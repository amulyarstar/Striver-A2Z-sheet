public class armstrong {
    public boolean isArmstrong(int n) {
        int temp = n; 
        int sum = 0; 
        int lastdig;

        while (temp != 0) {
            lastdig = temp % 10;
            // For 3-digit numbers specifically:
            sum = sum + (lastdig * lastdig * lastdig);
            temp = temp / 10;
        }
        return n == sum;
    }
}

