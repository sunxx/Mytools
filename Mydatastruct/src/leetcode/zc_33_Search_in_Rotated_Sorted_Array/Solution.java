public class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(target == nums[mid]) return mid;
            
            if(nums[start]<=nums[mid]){
                if(nums[start] <= target && target < nums[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            
            if(nums[mid]<=nums[end]){
                if(nums[mid] < target && nums[end] >= target)
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
    }
}