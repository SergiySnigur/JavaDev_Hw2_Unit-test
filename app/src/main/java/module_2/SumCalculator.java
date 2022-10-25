package module_2;


public class SumCalculator {
    public int sum(int n) {
        int result = 0;

        if (n == 0 || n < 0) {
            throw new IllegalArgumentException("Must be bigger then 0!");
        } else {
            for (int i = 1; i <= n; i++) {
                result += i;
            }
        }
        return result;
    }
}
