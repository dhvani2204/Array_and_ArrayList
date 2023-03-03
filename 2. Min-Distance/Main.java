/** Name: Dhvani Uday Parekh
   Branch and Batch: AIML-B3
   prn: 21070126126**/

import java.util.*;
import java.io.*;

public class Main{
    /**declare the array and a variable to capture first index.**/
    static int[]a;
    static int f_i;
    public static void main(String args[]){
        
        /**Create object of 2 files**/
        UserInput input=new UserInput();
        Calculation c=new Calculation();
        
        /**Storing the array and the first index by calling
         the methods from the UserInput and CalculationFile**/
         
        a=input.inputArray();
        f_i=c.performMin(a);
        
        /**Print the first index of the pair of numbers with least distance**/
        
        System.out.print("first index of neighbouring pair with least distance:"+f_i);
        
    }
}