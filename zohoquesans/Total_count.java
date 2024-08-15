
import java.io.*;
import java.lang.*;
import java.util.*;




class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int res = 0;
        for(int  val: arr)
        {
            res += val/k;
            if(val%k != 0)
            {
                res++;
            }
        }
        return res;
    }
}

