
import java.io.*;
import java.util.*;

class Solution {
    
    static long reverse(long n)
    {
        long rev=0;
        while(n!=0)
        {
            rev = rev*10+(n%10);
            n=n/10;
        }
        return rev;
    }
    static boolean isPalindrome(long n)
    {
        long rev = reverse(n);
        if(n==rev)
        {
            return true;
        }
        return false;
    }
    static long isSumPalindrome(long n) {
        // code here\
        if(isPalindrome(n))
        {
            return n;
        }
        
        for(int i = 0; i<5; i++)
        {
            long res = reverse(n);
            n=n+res;
            if(isPalindrome(n))
            {
                return n;
            }
        }
        return -1;
        
    }
}
