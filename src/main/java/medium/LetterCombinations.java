package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {

    public List<String> letterCombinations(String digits){

        String [] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> result = new ArrayList<>();
        for(int i = 0;i <digits.length(); i++){
           String temp = letters[digits.charAt(i) - '2'];
            if(result.size() == 0){
                for (int j = 0; j < temp.length(); j++) {
                    result.add(String.valueOf(temp.charAt(j)));
                }
            }else{
                List<String> newResult = new ArrayList<>();
                for(String s : result){
                    for (int j = 0; j < temp.length(); j++) {
                        newResult.add( s+ temp.charAt(j));
                    }
                }
                result = newResult;
            }
        }
        return result;
    }
}
