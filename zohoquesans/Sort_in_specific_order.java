// youtube link: https://youtu.be/ZDw4i9NolJ8?si=Aa12F3jW--jgDRdF

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      
	        int[] arr = {0,1, 2, 3, 5, 4, 7, 10};
	        sortit(arr);
	        System.out.print("Odd(Desc) and Even(Asc) : ");
	        for(int i :arr)
	        {
	            System.out.print(i+" ");
	        }
    }
    public static int[] sortit(int[] arr)
    {
        oddnegative(arr);
        Arrays.sort(arr);
        oddnegative(arr);
        return arr;
    }
    public static void oddnegative(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
                arr[i]*=-1;
            }
        }
    }
    
    
}
