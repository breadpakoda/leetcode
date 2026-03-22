class Solution {
    public int searchInsert(int[] nums, int target) {
        int beg=0;
        int end= nums.length-1;
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                beg=mid+1;
            }

            else {
                return mid;
            }
        }
          while(beg<nums.length-1){
            // mid=beg+(end-beg)/2;
            int mide=0;
            if(target>nums[mide] && target<nums[mide+1]){
                return mide+1;
            }
            mide++;
        }

        return -1;
        
    }
}