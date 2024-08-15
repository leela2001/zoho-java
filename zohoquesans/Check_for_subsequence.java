

import java.io.*;
import java.util.*;


class Solution{
    boolean isSubSequence(String A, String B){
        int ap = 0;
        for(int bp = 0; bp < B.length(); bp++)
        {
            if(A.charAt(ap) == B.charAt(bp))
            {
                ap++;
                if(ap == A.length())
                {
                    return true;
                }
            }
        }
        return ap==A.length();
    }
}
