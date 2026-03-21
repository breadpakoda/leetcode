class P33 {

    public static void main(String[] args) {
                int[] nums = { 6,3};
                System.out.println(search(nums,3));

    
    }
    static int search(int[] nums, int target) {

        int pivot = search_pivot(nums);
        int ans = bs(nums, target, 0, pivot);
        if (ans == -1) {
            ans = bs(nums, target, pivot+1, nums.length-1);
        }
        return ans;

    }

    static int search_pivot(int[] nums) {

        int beg = 0;
        int end = nums.length-1;

        while (beg < end) {
            int mid = beg + (end - beg) / 2;
            if (mid<end && nums[mid] > nums[mid + 1]) {
                return mid;
            }  if (mid>beg && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }  if (nums[beg] <= nums[mid]) {
                beg = mid+1;
            }  else {
                end = mid-1;

            }

        }
        return -1;

    }

    static int bs(int[] arr, int target, int beg, int end) {

        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                                beg = mid + 1;

                
            } else {
                return mid;
            }
        }

        return -1;

    }
}
