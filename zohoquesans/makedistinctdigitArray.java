
class Solution
{
    public int[] common_digits(int[] nums)
    {
        // code here
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++)
        {
            int n = nums[i];
            while(n>0)
            {
                set.add(n%10);
                n=n/10;
            }
        }
        
        int[] arr = new int[set.size()];
        int i=0;
        for(Integer num : set)
        {
            arr[i++] = num; 
        }
        return arr;
    }
}
