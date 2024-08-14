
import java.util.*;


/*Complete the function below*/
class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        int i=0;
        for(; i < arr2.length; i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return i;
            }
        }
        return i;
    }
}
