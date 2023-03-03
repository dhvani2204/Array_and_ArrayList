import java.util.Scanner;
import java.io.*;

public class UserInput{
    Scanner sc=new Scanner(System.in);
  
    public int[]insertArray(){
            //Input and store number of array elements.
        System.out.println("Enter total numbers to enter:");
        int n=sc.nextInt();
            //input array elements.
        System.out.println("Enter "+n+" Numbers:");
        int[] numbers=new int[n]; //creating an array of size entered.
        
        //storing array elements in the array.
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        return numbers;
    }
}