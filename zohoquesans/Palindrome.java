

import java.util.*;
import java.lang.*;
import java.io.*;


class Solution
{
    static int reverse(int n)
    {
        int res =0;
        while(n!=0)
        {
            res = res*10+(n%10);
            n=n/10;
        }
        return res;
    }
    static boolean isPalindrome(int n)
    {
        int r = reverse(n);
        if(n==r)
        {
            return true;
        }
        return false;
    }
    public String is_palindrome(int n)
    {
        // Code here
        if(isPalindrome(n))
        {
            return "Yes";
        }
        return "No";
        
    }
}
