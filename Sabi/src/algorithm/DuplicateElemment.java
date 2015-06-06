package algorithm;

import javax.swing.JOptionPane;

public class DuplicateElemment {
	 public static void main(String a[]){
         
	        int[] arr = {5,2,7,2,4,7,8,8,2,3,2};
	        for(int i=0;i<arr.length;i++){
	            boolean isDuplicate = false;
	            for(int j=0;j<i;j++){
//	            	System.out.println(i+"  "+arr[i]+"  "+j+"  "+arr[j]);
	                if(arr[i] == arr[j]){
	                	
	                    isDuplicate = true;
	                    
	                    break;
	                }
	            }
	            if(!isDuplicate){
               System.out.print(arr[i]+" ");
	            }
	        }
	    
	}

}
