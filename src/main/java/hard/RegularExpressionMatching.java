package hard;

import java.util.ArrayList;
import java.util.List;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int j = 0;
        boolean flag = p.contains("*");
        if(flag){
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            if(j > p.length() - 1){
                return false;
            }
            if(p.charAt(j) == '*'){
                return true;
            }
            if(p.charAt(j) == '.') {
                j++;
                continue;
            }
            if(p.charAt(j) != '*' && p.charAt(j) != s.charAt(i)){
                return false;
            }
            j++;
        }
        return true;
    }
}
