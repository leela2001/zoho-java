// Union_of_two_arrays

import java.io.*;
import java.lang.*;
import java.util.*;

class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here
        Set<Integer> set = new HashSet<>();
        
        for(int a: arr1)
        {
            set.add(a);
        }
        
        for(int b : arr2)
        {
            set.add(b);
        }
        
        return set.size();
      
    }
}
