package Collection;
import java.util.*;  
class ArrayCollection{  
 public static void main(String args[]){  
   
  ArrayList<String> obj=new ArrayList<String>();
  obj.add("abc");//
  obj.add("xyz");  
  obj.add("sam");  
  obj.add("harry");  
  
  Iterator objItr=obj.iterator();
  while(objItr.hasNext()){  
   System.out.println(objItr.next());  
  }  
 }  
}