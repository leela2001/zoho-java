
import java.io.*;
import java.util.*;


class Sol
{
    int getCount (String S, int N)
    {
        // your code here
        
        HashMap<Character,Integer> map = new HashMap<>();
        map.put(S.charAt(0), 1);
        for(int i = 1; i< S.length(); i++)
        {
            if(S.charAt(i) != S.charAt(i-1))
            {
                Integer cur_val = map.getOrDefault(S.charAt(i),0);
                map.put(S.charAt(i),cur_val+1);
            }
        }
        
        int count =0;
        for(Integer val : map.values())
        {
            if(val==N)
            {
                count++;
            }
        }
        
        return count;
    }
}
