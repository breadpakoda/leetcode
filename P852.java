class P852{
    public static void main(String[] args) {

        System.out.println(peakIndexInMountainArray(new int[]{1,2,2,3,4,3,2,1}));
        
    }

     static int peakIndexInMountainArray(int[] arr) {

        int beg=0;
        int end=arr.length-1;
        

        while(beg<end){
            int mid= beg+(end-beg)/2;
                
            if(arr[mid]<arr[mid+1]){
                beg=mid+1;

            }
            else if(arr[mid]>arr[mid+1]){
                end=mid;
                
            }
            
        }
        return beg;
        
    }
}