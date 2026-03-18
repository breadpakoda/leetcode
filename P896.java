class P896 {

    public static void main(String[] args) {
        int arr[]={1,2,4,3,5,6,7,8,9};
        int arr2[]={1,2,3,4,5,6,7,8,9};
        System.out.println(isMonotonic(arr));
        System.out.println(isMonotonic(arr2));
    }


    static boolean isMonotonic(int[] nums) {

        boolean flag1=true;
        boolean flag2=true;

        for(int i=1; i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                flag1=false;
            }
            else if(nums[i-1]>nums[i]){
                flag2=false;

            }

            
        }
        return flag1 || flag2;
        
    
}
}