public class P9 {

    public static void main(String[] args) {
        int x = 121;
        int reverse = 0;
        int temp=x;

        if (x < 0) {
            System.out.println("false");
            return;
            
        }

        while (x != 0) {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }

        if (temp == reverse) {
            System.out.println("true");
            return;
        }

        System.out.println("false");
        return;
    }

}
