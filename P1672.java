public class P1672 {

    public static void main(String[] args) {

        int[][] arr={{1,2,3},{2,4,32,2},{1,2}};

        System.out.println(find_greatest(arr));
        
    }

    static int find_greatest(int[][] arr){

        int result=0;
        
        for(int i=0; i<arr.length;i++){
            int sum=0;
            for(int j=0; j<arr[i].length;j++){
                sum+=arr[i][j];

                
                result=(int)Math.max(result,sum);
                
            }
        }

        return result;
    }

    
}
