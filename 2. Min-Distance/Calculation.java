import java.util.*;
import java.lang.Math;//for mathematical calculations

public class Calculation{

    public int performMin(int[]a){
 /**declare variables---
 n: to store the length of array. 
 first_index: to capture the first index of pair having min dist.
 minDist: initialized with maximum value possible of an integer this is because
 any distance compared with it at the beginning has to be smaller.**/
    
        int n=a.length;
        int first_index=0;
        int minDist=Integer.MAX_VALUE;
    
    /**for loop to loop through all the neighbouring pairs.**/
        for(int i=0;i<n-1;i++)
        {
            int j=i+1;
    /**cal variable stores distance between the neighbouring pair**/
                int cal=Math.abs(a[i]-a[j]);
                
    /**check if the distance between current neighbouring pair is less than
     the previous neighbouring pairs distance**/  
            if(cal<=minDist){
                minDist=cal;
                first_index=i;
            }
        }
        return first_index;
    }
}