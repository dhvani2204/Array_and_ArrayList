import java.util.*;
public class AllocateNumbers{
    /**declare two arrays for even and odd numbers.**/
    public int[] even;
    public int[] odd;
    
    public void performAllocation(int[]numbers){
       int[] even = new int[numbers.length];
       int[] odd=new int[numbers.length];
       
       int evenSize=0,oddSize=0;
       
       /**for loop to check for even and odd numbers and
         store them in the respective arrays at the same time
         determining their size.**/
         
       for(int i=0;i<numbers.length;i++){
                 if(numbers[i]%2==0){
            even[evenSize++]=numbers[i];
        }
        else{
            odd[oddSize++]=numbers[i];
        }
    }
/**Printing even and odd arrays**/
System.out.print("Even array: ");
      for (int i = 0; i < evenSize; i++) {
            System.out.print(even[i] + " ");
    }
    System.out.print("\nOdd array: ");
     for (int i = 0; i < oddSize; i++) {
       System.out.print(odd[i] + " ");
    }
}
}