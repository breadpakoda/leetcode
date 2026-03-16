public class P744 {

        public static void main(String[] args) {

        char[] arr={'e','x','y','y'};
        

        
        System.out.println(find_greatest_lower_bound(arr, 'z'));
        
    }

    static char find_greatest_lower_bound(char[] letters,char target){


        int beg=0;
        int end= letters.length-1;
        while(beg<=end){
            int mid=beg+(end-beg)/2;;
            
            if(target<(letters[mid])){
                end=mid-1;
            }
            else {

                beg=mid+1;
            }
          
        }

        return letters[beg%letters.length];
    }
    
}
