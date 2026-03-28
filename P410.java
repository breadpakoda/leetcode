class Solution {
    public int splitArray(int[] nums, int k) {

        int max_element=0;
        int element_sum=0;
        for(int i : nums){
            max_element=(int)Math.max(max_element,i);
            element_sum+=i;
        }
    while(max_element<element_sum){
        int mid=max_element+(element_sum-max_element)/2;

        int sum=0;
        int pieces=1;
        
        for(int i:nums){
            if(sum+i>mid){
                sum=i;
                pieces++;
            }
            else{
                sum+=i;
            }
        }
        if(pieces>k){
            max_element=mid+1;
        }
        else{
            element_sum=mid;
        }
    }
    return element_sum;
        
    }
}