import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> bag = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        
        // The loop should wrap around all the logic inside
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // Check for repeats and shrink the window from the LEFT
            while (bag.contains(currentChar)) {
                bag.remove(s.charAt(left));
                left++;
            }
            
            bag.add(currentChar);
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Check if there is actually a line to read
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            Solution sol = new Solution();
            int result = sol.lengthOfLongestSubstring(s);
            System.out.println(result);
        }
    }
}
