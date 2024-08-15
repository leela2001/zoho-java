
import java.io.*;
import java.util.*;

//User function Template for Java
class Solution{
    static String removeChars(String string1, String string2){
        // code here
        String res = "";
                                        
        HashSet<Character> hs = new HashSet<>();
        
        for(int i = 0; i < string2.length(); i++)
        {
            hs.add(string2.charAt(i));
        }
        
        for(int i = 0; i < string1.length(); i++)
        {
            if(hs.contains(string1.charAt(i))==false)
            {
                res += string1.charAt(i);
            }
        }
        return res;
        
        
    }
