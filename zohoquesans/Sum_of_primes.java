
import java.io.*;
import java.util.*;

// User function Template for Java

class Solution{
    static int primeNo(int ld)
    {
        if(ld < 2)
        {
            return 0;
        }
        for(int i = 2; i <= Math.sqrt(ld); i++)
        {
            if(ld%i==0)
            {
                return 0;
            }
        }   
        return 1;
    }
    static int primeSum(int N){
        // code here
        int ld =0;
        int sum = 0;
        while(N!=0)
        {
            ld = N%10;
            if(primeNo(ld)==1)
            {
                sum += ld;
            }
            N = N/10; 
        }
        return sum;
    }
}
