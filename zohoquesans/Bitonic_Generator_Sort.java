// zoho placement coding : https://www.geeksforgeeks.org/explore?page=4&company=Zoho&sortBy=submissions&itm_source=geeksforgeeks&itm_medium=main_header&itm_campaign=practice_header
// problem link: https://www.geeksforgeeks.org/problems/bitonic-generator-sort3343/1?page=4&company=Zoho&sortBy=submissions
// youtube link : https://youtu.be/ZDw4i9NolJ8?si=R4mR07Pj-90D7IL8
// playlist link : https://www.youtube.com/watch?v=ZDw4i9NolJ8&list=PL4PIBBfQAns6_yBbe1HGX2teQYN0ZEOEl&index=2



//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    void bitonicGenerator(long arr[], int n)
    {
        
        ArrayList<Long> odd = new ArrayList<>();
        ArrayList<Long> even = new ArrayList<>();
        
        
        for(int i =0; i < n; i++)
        {
            if(i%2==0)
            {
                even.add(arr[i]);
            }
            else
            {
                odd.add(arr[i]);
            }
        }
        
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int i=0;
        
        for(Long val : even)
        {
            arr[i++] = val;
        }
        for(Long val : odd)
        {
            arr[i++] = val;
        }
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            Solution ob = new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            ob.bitonicGenerator(a,n);
            for (int i = 0; i < n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}





// } Driver Code Ends
