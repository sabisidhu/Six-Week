package Collection;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayRetain {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		ArrayList<String> obj1 = new ArrayList<String>();
		obj.add("hello");
		obj.add("abc");
		obj.add("xyz");
		obj.add("sabi");
		obj1.add("gatec");
		obj1.add("abc");
		obj1.add("xyz");
		obj.retainAll(obj);
		java.util.Iterator<String> itr =  obj.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
	}

}
