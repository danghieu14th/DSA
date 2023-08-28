package medium;

public class Atoi {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        if(n == 0){
            return 0;
        }
        int positive = 0;
        int negative = 0;

        while (i < n && !(s.charAt(i) >= '0' && s.charAt(i) <= '9')) { // skipping space characters at the beginning
            if (s.charAt(i) == '+') {
                positive++; // number of positive signs at the start in string
            } else if (s.charAt(i) == '-') {
                negative++; // number of negative signs at the start in string
            } else if(s.charAt(i) == ' '){
                if(positive > 0 || negative > 0){
                    return 0;
                }
            }
            else {
                return 0;
            }
            i++;
        }

        if (i == n) { // if string contains only characters
            return 0;
        }


        double ans = 0;

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            ans = ans * 10 + (s.charAt(i) - '0'); // (s.charAt(i) - '0') is converting character to integer
            i++;
        }

        if (negative == 1) { // if negative sign exists
            ans = -ans;
        }

        if (positive >= 1 && negative >= 1) { // if both +ve and -ve sign exist, Example: +-12
            return 0;
        }

        if (positive > 1 || negative > 1) { // if both +ve and -ve sign exist, Example: +-12
            return 0;
        }


        int INT_MAX = (int) Math.pow(2, 31);
        int INT_MIN = (int) Math.pow(-2, 31);

        if (ans > INT_MAX) { // if ans > 2^31 - 1
            ans = INT_MAX;
        }

        if (ans < INT_MIN) { // if ans < -2^31
            ans = INT_MIN;
        }

        return (int) ans;
    }
}
