class p240 {
    public boolean searchMatrix(int[][] arr, int target) {

        int row = 0;
        int col = arr[row].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                
                return true;
            } else if (target > arr[row][col]) {
                row++;
            }

            else {
                col--;
            }
        }
        return false;
        
    }
}