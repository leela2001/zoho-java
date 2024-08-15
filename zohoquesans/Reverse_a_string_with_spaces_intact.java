// Reverse a string with spaces intact



import java.io.*;
import java.util.*;



//User function Template for Java
class Solution
{
    String reverseWithSpacesIntact(String S)
    {
        int sp = 0;
        int ep = S.length()-1;
        
        StringBuilder sb = new StringBuilder(S);
        
        while(sp<ep)
        {
            if(sb.charAt(sp) != ' ' && sb.charAt(ep) != ' ')
            {
                char temp = sb.charAt(sp);
                sb.setCharAt(sp, sb.charAt(ep));
                sb.setCharAt(ep, temp);
                sp++;
                ep--;
            }
            if(sb.charAt(sp) == ' ')
            {
                sp++;
            }
            if(sb.charAt(ep) ==' ')
            {
                ep--;
            }
        }
        return sb.toString();
    }
}
