package medium;

public class TheBigFibonacciLastNumber {
public static void main(String[] args) {
        System.out.println(getFibonacciLastDigit(327305));
    }

    public static int getFibonacciLastDigit(int n) {
        if (n <= 1) {
            return n;
        }

        int previous = 0;
        int current = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous % 10;
            previous = current % 10;
            current = (tmp_previous + current) % 10;
        }

        return current;
    }
}
