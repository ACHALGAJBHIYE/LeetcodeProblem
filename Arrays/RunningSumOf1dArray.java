/*  1480: Running Sum Of 1d Array
    difficulty: hard
    https://leetcode.com/problems/running-sum-of-1d-array/

   Problem:
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums  [0]…nums[i]).Return the running sum of nums.
    
    Example 1:
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

*/


import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
        int sum[] = new int[nums.length];
        sum[0] = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            sum[i] = sum[i-1]+nums[i];     
        }
        return sum;   
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<nums.length; i++)
        {
             nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        obj.runningSum(nums);
        sc.close();
    }
}