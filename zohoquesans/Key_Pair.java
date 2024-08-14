
//learning link refered in Bitonic_Generator_Sort.java



import java.io.*;
import java.util.*;

// User function Template for Java

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // code here
        Set<Integer> set = new HashSet<>();
        int i=0;
        for(int a : arr)
        {
            int val = x-arr[i];
            if(set.contains(val))
            {
                return true;
            }
            set.add(arr[i++]);
        }
        
        return false;
    }
}
