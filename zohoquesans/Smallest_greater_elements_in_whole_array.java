//link refered in 

import java.io.*;
import java.util.*;

            

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] greaterElement (int arr[], int n) {
        
        // Complete the function
        int[] copy = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            copy[i] = arr[i];
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
                
        Arrays.sort(copy);
                
        int i = 0;
        for(; i<n-1;i++)
        {
            map.put(copy[i], copy[i+1]);
        }
        map.put(copy[i], -10000000);
        
        for(int j = 0; j<n; j++)
        {
            arr[j] = map.get(arr[j]);
        }
        return arr;
    }
    
    
}


