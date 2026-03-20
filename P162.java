public class P162 {
    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[] {1,2,3,4,5,6,5,4,3,2,1}));
        
    }

     static int findPeakElement(int[] arr) {

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
