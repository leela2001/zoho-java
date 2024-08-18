// Element with left side smaller and right side greater

import java.io.*;
import java.util.*;


class Solution {
    public int findElement(List<Integer> arr) {
        // Code here
        int[] leftmax = new int[arr.size()];
        int[] rightmin = new int[arr.size()];
        int n = arr.size();
        
        leftmax[0] = arr.get(0);
        for(int i = 1; i < n; i++ )
        {
            leftmax[i] = Math.max(arr.get(i-1),leftmax[i-1]);
        }
        rightmin[n-1] = arr.get(n-1);
        for(int i = n-2; i>=0; i--)
        {
            rightmin[i] = Math.min(arr.get(i+1),rightmin[i+1]); 
        }
        
        for(int i = 0; i < n; i++)
        {
            if(leftmax[i]<arr.get(i) && rightmin[i]>arr.get(i))
            {
                return arr.get(i);
            }
        }
        return -1;
    }
}
