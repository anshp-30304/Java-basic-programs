class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i <= nums.length-1;i++){
            int num1 = nums[i];
            int num2 = nums[i];
            int total = num1+num2;
            if(total==target){
                System.out.println(total);
            }
        }
        return twoSum(nums, target);
    }
}

class two_Sum{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1,2,3,4};
        obj.twoSum(arr,9);
    }
}