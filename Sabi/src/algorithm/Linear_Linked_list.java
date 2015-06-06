package algorithm;
import javax.swing.JOptionPane;// importing swing class
class Link{	 // each node of link_list of type link
	public int rno;
	public double marks;
	public Link next;
	
	public Link(int roll,double mark){
		rno = roll;
		marks = mark;
	}
}
class Deletion { // deletion of data
	Link head2 = insertion.head;
	Deletion(){
		
	String p = "PRESS";
	String choices = "1.To delete from beginning\n"+"2.Delete from end\n"+"3.Delete a specific element\n"+"4.To Delete whole list\n";
		String s = JOptionPane.showInputDialog(null, p+"\n\n"+choices, "OPTIONS", JOptionPane.PLAIN_MESSAGE);
		
		int choice = Integer.parseInt(s);{
		
		switch(choice){
		case 1:delete_from_beg();
		break;
		case 2:delete_from_end();
		break;
		case 3:String r = JOptionPane.showInputDialog(null, "Enter rollnumber which you want to delete:");
		int roll = Integer.parseInt(r);
			delete_specific(roll);
			break;
		case 4:delete_entire();
		break;
		}
		}
	}
	private void delete_from_beg() { // delete from beginning
		// TODO Auto-generated method stub
		if(insertion.head == null)
			JOptionPane.showMessageDialog(null,"Linked list is empty cannot delete");
		else
			{
			JOptionPane.showMessageDialog(null,"Element " + insertion.head.rno + "deleted");
			insertion.head = insertion.head.next;
			}
	}
	private void delete_entire() {// delete entire linked_list
		// TODO Auto-generated method stub
		insertion.head = null;
		JOptionPane.showMessageDialog(null,"Entire linked list deleted");
	}
	private void delete_specific(int roll) { // delete specific element of link_list
		// TODO Auto-generated method stub
		Link ptr = insertion.head;
		
		if(ptr == null)
			JOptionPane.showMessageDialog(null," linked list is empty, hence cannot deleted");
		else if(ptr.next == null && ptr.rno == roll)
		{
			JOptionPane.showMessageDialog(null," rollnumber "+ ptr.rno + " data deleted");
			insertion.head = null;	
		}	
		else	
			{
			Link p = insertion.head.next;
			while(ptr.next.rno != roll)	
			{
				p = p.next;			
				ptr = ptr.next;
			}
			JOptionPane.showMessageDialog(null," rollnumber "+ p.rno + " data deleted");
		ptr.next = p.next; 
	}
	}
		
	private void delete_from_end() { // delete from end of link_list
		// TODO Auto-generated method stub
		Link p = insertion.head;
		if(insertion.head == null)
			JOptionPane.showMessageDialog(null,"Linked list is empty");
		else if(insertion.head.next == null){
			JOptionPane.showMessageDialog(null,"rollnumber " + head2.rno + " data deleted");
			head2 = null;
		}
		else
			{
			Link ptr = insertion.head.next;
			while(ptr.next != null){
			p = ptr;	
			ptr = ptr.next;
		}
			JOptionPane.showMessageDialog(null,"rollnumber " + ptr.rno + " data deleted");
		p.next = null;
	 }
	}
}
class insertion { // insertion operation on linked_list
	public static Link head = null;
	insertion(){
	
	String roll = JOptionPane.showInputDialog(null,"Enter roll number:");
	int rno = Integer.parseInt(roll);
	
	String marks = JOptionPane.showInputDialog(null,"Enter marks of rollnumber "+rno+":");
	double mark = Double.parseDouble(marks);
	
	String choices = "1.To insert at beginning\n"+"2.Insert at end\n"+"3.Insert after an element\n"+"4.To skip insertion\n";
	String s = JOptionPane.showInputDialog(null, choices, "OPTIONS", JOptionPane.PLAIN_MESSAGE);
	
	int choice = Integer.parseInt(s);{
	
	switch(choice){
	case 1:Insert_at_beg(rno,mark);
	break ;
	case 2:Insert_at_end(rno,mark);
	break;
	case 3:String after = JOptionPane.showInputDialog(null,"Enter rollnumber after which you want enter data");
	int roll1 = Integer.parseInt(after);
		Insert_after(rno,mark,roll1);
		break;
	case 4:break;	
	}
	}
	}
	private void Insert_at_beg(int roll,double marks) { // insert at beginning
		// TODO Auto-generated method stub
		Link ptr = new Link(roll,marks);
	ptr.next = head;
	head = ptr;
	}
	private void Insert_after(int roll,double marks,int after_roll) { // insert after a given element
		// TODO Auto-generated method stub
		Link ptr = new Link(roll,marks);
		Link p = head;
	
		while(p.rno != after_roll)
			p = p.next;
		
		ptr.next = p.next;
		p.next = ptr;
	}
	private void Insert_at_end(int roll,double marks) {// insert at end
		// TODO Auto-generated method stub
		Link ptr = new Link(roll,marks);
		Link p = head;
		ptr.next = null;
		if(head == null)
			head = ptr;
		else{
		while(p.next != null)
			p = p.next;
		
		p.next = ptr;
		
	}}
}
class traversal { // linked list traversal
	Link ptr = insertion.head;
	String s ="roll number" +" " + "marks\n";
	int i = 1;
	public traversal(){
		while(ptr != null){
			s = s+ i++ +". "+ ptr.rno + "" + ptr.marks +"\n" ;
			ptr = ptr.next;
			}
		
		JOptionPane.showMessageDialog(null,s, "DATA STORED",JOptionPane.INFORMATION_MESSAGE);
		}
}
class Searching { // searching an element 
	Link ptr = insertion.head;
	public Searching(int roll){
		while(ptr != null){
			if(ptr.rno == roll)
				{
				JOptionPane.showMessageDialog(null,"roll number " + roll +"found " +"and has marks = " + ptr.marks, "NUMBER FOUND",JOptionPane.INFORMATION_MESSAGE);
				break;			
				}
			else	
		ptr = ptr.next;
		}
	}
}
public class Linear_Linked_list { // main class
	public static void main(String[] args){
		int ch = 0;
		JOptionPane.showMessageDialog(null, "WELCOME TO LINKED LIST PROGRAM", "WELCOME", JOptionPane.INFORMATION_MESSAGE);
		while(ch < 5){
		String p = "PRESS";
		String choice = "1.To insert \n"+"2.To delete \n"+"3.To search an element\n"+"4.To traverse stored data \n "+"5.To exit " ;
		String c = JOptionPane.showInputDialog(null,p+"\n\n"+choice,"CHOICES",JOptionPane.PLAIN_MESSAGE);
		ch = Integer.parseInt(c);
		
		switch(ch){
		case 1:new insertion(); // creating object of insertion class 
			break;
		case 2:new Deletion();// creating object of deletion class 
			break;
		case 3:String c1 = JOptionPane.showInputDialog(null,"enter rollnumber whose marks you want to see:");
		 int ch1 = Integer.parseInt(c1); 
			 new Searching(ch1);// creating object of searching class
			 break;
		case 4:new traversal(); // creating object of traversal class
			break;	
		case 5:break;	
		}
		
		}
	}
}
// end of program