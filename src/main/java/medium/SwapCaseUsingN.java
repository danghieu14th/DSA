package medium;

public class SwapCaseUsingN {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                answer += (char) ((c - 'a' + n) % 26 + 'a');
            } else if ('A' <= c && c <= 'Z') {
                answer += (char) ((c - 'A' + n) % 26 + 'A');
            } else {
                answer += c;
            }
        }
        return answer;
    }
}
