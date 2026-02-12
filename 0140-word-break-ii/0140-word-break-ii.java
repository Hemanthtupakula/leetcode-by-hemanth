import java.util.*;

class Solution {
    
    Map<String, List<String>> memo = new HashMap<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        
        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        List<String> result = new ArrayList<>();
        
        
        if (s.isEmpty()) {
            result.add("");
            return result;
        }

        
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                
                String remaining = s.substring(word.length());
                List<String> subPartResults = wordBreak(remaining, wordDict);

            
                for (String sub : subPartResults) {
                    String space = sub.isEmpty() ? "" : " ";
                    result.add(word + space + sub);
                }
            }
        }

        memo.put(s, result);
        return result;
    }
}