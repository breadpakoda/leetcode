public class p26 {
    public static void main(String[] args) {

        int[] nums={1,1,1,1,2,2,3,3,4,4,4,5,5,5};
        for(int i=1 ; i<nums.length ; i++){

            if(nums[i]==nums[i-1]){
                for(int j=1;j<nums.length;j++){
                    nums[j-1]=nums[j]; 
                }
                for(int k=0 ; k<nums.length;k++){
                    System.out.print(nums[i]);
                }
            }

        }
       
    }

    
}
