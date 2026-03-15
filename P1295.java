public class P1295 {
    public static void main(String[] args) {

        int arr[]={23,1,22222222,46};
        System.out.println(even_length(arr));
        
    }

    static int even_length(int[] arr){

        int count=0;

        for(int i : arr){
            if(((int)Math.log10(i)+1)%2==0){
                count++;
            }
        }

        return count;

    }
}
