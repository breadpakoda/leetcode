class P704 {
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,5));
    }
    static int search(int[] nums, int target) {

        int beg=0;
        int end= nums.length-1;

        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                beg=mid+1;
            }
            else {
                return mid;
            }

        }

return -1;        
    }
}