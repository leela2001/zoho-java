
import java.io.*;
import java.util.*;



class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        ArrayList<Integer> dup = new ArrayList<>();
        int l = arr.length;
        
        for(int val : arr)
        {
            arr[val % l] += l; 
        }
        for(int i = 0; i< l; i++)
        {
            // arr[i]/=l;
            if( arr[i]/l >= 2)
            {
                dup.add(i);
            }
        }
        if(dup.isEmpty()) 
        {
            dup.add(-1);
        }
        
        return dup;
    }
}
