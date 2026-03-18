class P34{
    
    public int[] searchRange(int[] nums, int target) {
        int[] indexes={-1,-1};

        int start=findindex(nums,target,true);
        int end=findindex(nums,target,false);

        indexes[0]=start;
        indexes[1]=end;



        return indexes;

        
        
    }

    static int findindex  (int[] nums,int target,boolean findstart){

        int beg=0;
        int end=nums.length-1;
        int ans=-1;
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                beg=mid+1;
            }
            else{
                ans=mid;
                if(findstart){
                    end=mid-1;
                }
                else{
                    beg=mid+1;
                }

            }
        }

    return ans;
    }
}