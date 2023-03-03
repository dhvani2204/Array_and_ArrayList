/**Name: Dhvani Uday Parekh
   Batch and Branch: AIML-B3
   PRN:21070126126
**/ 

import java.util.*; 
public class Main
{
    //declare array and arraylist to store the numbers.
    static Integer[] numbers;
    static ArrayList<Integer> al;
    public static void main (String[] args)
    {
        //create objects of 3 classes.
        ArrayInput arr_i=new ArrayInput();
        ArrayListInput all_i=new ArrayListInput();
        Conversion c=new Conversion();
        
       //Menu-driven code to perform as per the type of conversion entered.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice");
        System.out.println("1.Array to ArrayList:");
        System.out.println("2. ArrayList to Array:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
        //numbers stored in array.
                numbers=arr_i.insertArray();
        //convert array to arraylist and print it.
                System.out.println(c.ArrayToArrayList(numbers));
                break;
            case 2:
        //numbers stored in arraylist
                al=all_i.insertArrayList();
        //arraylist to array and print it.
                System.out.println(Arrays.toString(c.ArrayListToArray(al)));
                break;
            default:
                System.out.println("Invalid choice");
    }
}
}