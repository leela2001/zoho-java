//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Solution {
    
    static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                return false;
            }
            
        }
        return true;
    }
    static int reverse(int n)
    {
        int reverse = 0;
        
        while(n!=0)
        {
            reverse = reverse*10+(n%10);
            n= n/10;
        }
        return reverse;
    }
    int isTwistedPrime(int N) {
        // code here
        
        if(isPrime(N) && isPrime(reverse(N)))
        {
            return 1;
        }
        return 0;
        
    }
}
