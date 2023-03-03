import java.util.Scanner;
import java.io.*;

public class ArrayInput{
    Scanner sc=new Scanner(System.in);
  
    public Integer[]insertArray(){
            //Input and store number of array elements
        System.out.println("Enter total numbers to enter:");
        int n=sc.nextInt();
            //input array elements
        System.out.println("Enter "+n+" Numbers:");
        Integer[] numbers=new Integer[n]; //creating an array of size entered
        
        //storing array elements
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        return numbers;
    }
}