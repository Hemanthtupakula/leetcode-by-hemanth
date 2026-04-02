
import java.util.Scanner;

class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        // 1. Create a boolean array to track composite numbers
        // By default, all are false (assume they are prime)
        boolean[] isNotPrime = new boolean[n];
        int count = 0;
        
        // 2. Start from the first prime, 2
        for (int i = 2; i < n; i++) {
            if (isNotPrime[i] == false) {
                count++;
                
                // 3. Mark all multiples of 'i' as not prime
                // Optimization: Start from i*i because smaller multiples
                // like 2*i and 3*i have already been marked by 2 and 3
                if ((long)i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isNotPrime[j] = true;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            Solution sol = new Solution();
            System.out.println(sol.countPrimes(n));
        }
    }
}

