package algorithm;


public class FindDuplicate {
    public static void duplicateElements(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<i;j++){
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
     
    public static void main(String a[]){
         
        int[] nums = {5,2,7,2,4,7,8,2,3,2};
        FindDuplicate.duplicateElements(nums);
    }
}


