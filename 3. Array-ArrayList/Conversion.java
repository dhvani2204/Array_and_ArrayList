import java.util.*;

public class Conversion
{
//method to convert array to arraylist using asList
public  ArrayList<Integer> ArrayToArrayList(Integer numbers[]){
        ArrayList<Integer> al =new ArrayList<Integer>(Arrays.asList(numbers));
        return al;
    }

//method to convert arraylist to array using toArray.
public Integer[] ArrayListToArray(ArrayList<Integer>al){
   
    Integer[] numbers= al.toArray(new Integer[al.size()]); 
    return numbers;
}
}