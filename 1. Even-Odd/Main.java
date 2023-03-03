/** Name: Dhvani Uday Parekh
   Branch and Batch: AIML-B3
   prn: 21070126126**/
import java.io.*;
import java.util.Scanner;
public class Main
{
    /**declare array for all numbers.**/
    static int[] numbers;
   
    public static void main(String args[]){
        /**object of 2 files**/
        UserInput input=new UserInput();
        AllocateNumbers an=new AllocateNumbers(); 
        
      /**input array of numbers from user.**/
            numbers=input.insertArray();
            
       /**call the method to separate the 
        even and odd numbers into two separate arrays.**/
            an.performAllocation(numbers);
            }
}