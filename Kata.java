public class Kata {
    public static long sumMul(int n, int m) {
     if (n > 0 && m > 0) {
            long sum = 0;
            int pow = n;
            while (m > n) {
                sum += n;
                n += pow;
            }
            return sum;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
