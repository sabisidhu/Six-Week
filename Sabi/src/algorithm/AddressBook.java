package algorithm;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
// user defined type where we put name, email, mobile
class Address{
	private String name;
	private String mobile;
	private String email;
	
	public Address(String _name, String _mobile, String _email){
		name = _name;
		mobile = _mobile;
		email = _email;
	}
	
	public String toString(){
		return name + "\n" + mobile + "\n"+ email+"\n";
	}
	
}
public class AddressBook extends JFrame{
	private LinkedList lList; // built in linked list of java.util
	
	private JLabel lName, lMobile, lEmail, lIndex;
	private JTextField fName, fMobile, fEmail, fIndex;
	private JTextField fRemove;
	private JTextArea outputArea;
	
	private JButton bAdd, bRemove, bExit, bAbout;
	
	private FileOutputStream fout; // used for file output
	private FileInputStream fin; // used for file input
	
	public AddressBook() throws IOException{
		// title
		super("Address Book (Name, Mobile, Email)"); 
		
		lList = new LinkedList();
		
		try{
			// if A file already exist and have some data read it
			fin = new FileInputStream("Data.dat");
			BufferedReader br = new BufferedReader(new InputStreamReader(fin));
			
			String sName = br.readLine();
			String sMobile = br.readLine();
			String sEmail = br.readLine();
			
			while (sName != null){
				// Read from file and store them in linked List's object
				lList.add(new Address(sName, sMobile, sEmail));
				
				sName = br.readLine();
				sMobile = br.readLine();
				sEmail = br.readLine();
			}
			fin.close();
		}
		catch(Exception err){
			// if no file create a new file
			fout = new FileOutputStream("Data.dat");
		}	
		
		// set graphical user interface
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		lName = new JLabel("Name");
		container.add(lName);
		fName = new JTextField(20);
		container.add(fName);
		
		lMobile = new JLabel("Mobile");
		container.add(lMobile);
		fMobile = new JTextField(10);
		container.add(fMobile);
		
		lEmail = new JLabel("Email");
		container.add(lEmail);
		fEmail = new JTextField(15);
		container.add(fEmail);
		
		bAdd = new JButton("Add");
		container.add(bAdd);
		bAdd.addActionListener( // add event
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					StringBuffer str = new StringBuffer();
					str.append(fName.getText());
					
					// if name field is empty
					if (str.length() == 0){						
						JOptionPane.showMessageDialog(null, "Name Field must be initialized", "Info", JOptionPane.INFORMATION_MESSAGE);
						return; // if name field empty
					}
					
					// add new information from user to linkedlist
					lList.add(new Address(fName.getText(), fMobile.getText(), fEmail.getText()));
					fName.setText("");
					fMobile.setText("");
					fEmail.setText("");
					update(); // show final result to outputArea
					diskFileUpdate(); // store information to disk
						
				}
			}
		);	
		
		lIndex = new JLabel("Enter Index to remove Item from Linked List");
		container.add(lIndex);
		fIndex = new JTextField(5);
		container.add(fIndex);
		
		bRemove = new JButton("Remove Item");
		container.add(bRemove);
		bRemove.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try{
						// remove item from linked list
						if(lList.size() != 0){
							lList.remove(Integer.parseInt(fIndex.getText()));
						}
						update(); // show final result in outputArea
						diskFileUpdate(); // store file in disk
					}
					catch(Exception err){
						JOptionPane.showMessageDialog(null, "Error" + err, "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		);
				
		// show the data to outputArea
		outputArea = new JTextArea(20, 40);
		outputArea.setEditable(false);
		container.add(new JScrollPane(outputArea));
		update();
		
		bAbout = new JButton("About Me");
		container.add(bAbout);
		bAbout.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String about = "Address Book\nVersion 1.00\nDeveloper: Md. Mahmud Ahsan\n Student of IIUC DC\n Matric no: C041101\n";
					JOptionPane.showMessageDialog(null, about, "About Me", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		);
		setSize(700, 500);
		setVisible(true);
	}
	private void update(){
		// I used Iterator to access linked list's object
		Iterator it = lList.iterator();
		String out=""; // it used for collecting all members
		int count = 0;
		while (it.hasNext()){
			Object element = it.next();
			out += "\nPERSON " + count + "\n";
			out += "=============\n";
			out += element.toString();
			++count;
		}		
		outputArea.setText(out); 
	}
	
	private void diskFileUpdate(){
		try{
			// store to disk file
			fout = new FileOutputStream("Data.dat");
			// StringBuffer used to access every character
			StringBuffer out = new StringBuffer("");
			char c;
			Iterator it = lList.iterator();
			while (it.hasNext()){
				Object element = it.next();
				out.append(element.toString());
			}
			// write file every character by character
			for (int i = 0; i < out.length(); ++i){
				c = out.charAt(i);
				fout.write(c);
			}
			fout.close();
		}
		catch(Exception err){
			JOptionPane.showMessageDialog(null, "Error Caught: " + err, "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
		
	public static void main(String args[]){
		try{
			AddressBook window = new AddressBook();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error" + e, "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}		
				