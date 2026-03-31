class Solution {
    public int findMin(int[] nums) {
        int beg=0;
        int end=nums.length-1;

        if(nums[beg]<=nums[end]){
            return nums[beg];
        }

        while(beg<end){
            int mid=beg+(end-beg)/2;
            
            if(mid<end && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(mid>beg && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[beg]<nums[mid]){
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return-1;
    }
}