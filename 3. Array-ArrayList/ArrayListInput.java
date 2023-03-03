import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ArrayListInput{
    Scanner sc=new Scanner(System.in);
  //method to input arraylist
    public ArrayList<Integer> insertArrayList(){
        ArrayList<Integer> al=new ArrayList<Integer>();
        //ask and store size of arraylist
        System.out.println("How many values do you want to enter:");
        int size=sc.nextInt();
        
        //add elementd in arraylist
        for(int i=0;i<size;i++){
             al.add(sc.nextInt());
        }
          return al;
    }
}