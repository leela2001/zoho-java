

import java.io.*;
import java.lang.*;
import java.util.*;



class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        
        int sp=0;
        int ep=arr.length-1;
        ArrayList<Integer> res = new ArrayList<>();
        
        Arrays.sort(arr);
        while(sp<=ep)
        {
            res.add(arr[ep--]);
            if(sp<ep)
            {
                res.add(arr[sp++]);
            }
        }
        
        return res;
    }
}
