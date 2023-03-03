import java.util.Scanner;
import java.io.*;


public class UserInput{
    Scanner sc=new Scanner(System.in);
     //Input and store number of array elements.
    public int[] inputArray(){
    
        System.out.println("Enter number of elements in array:");
        int n=sc.nextInt();
        
        //input array elements.
        int[]a=new int[n];
        System.out.println("Enter "+n+"elements");
        
        //storing array elements in the array.
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        return a;
    }
}