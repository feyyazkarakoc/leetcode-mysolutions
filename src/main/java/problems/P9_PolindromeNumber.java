package problems;

public class P9_PolindromeNumber {

    public static  boolean isPolindrome(int x) {

        if (x < 0) return false;

        int y = x;

        long reversed = 0;

        while (y > 0) {
            reversed = reversed * 10 + y % 10;
            y /= 10;
        }

        return x == reversed;

    }


}
