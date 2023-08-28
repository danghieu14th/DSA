package medium;

public class ReverseInteger {
    public int reverse(int x){
        int res = 0;
        int signed = x > 0 ? 1 : -1;
        x = Math.abs(x);
        while(x > 0){
            if(res > Integer.MAX_VALUE/10){
                return 0;
            }
            res = res * 10 + x % 10;
            x /=10;
        }
        return res * signed;
    }
}
