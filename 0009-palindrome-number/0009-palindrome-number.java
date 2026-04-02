class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int reversed=0;
        while(x>0){
            int lastDigit=x%10;
            reversed=(reversed*10)+lastDigit;
            x=x/10;

        }
        return reversed==original;
        
    }
    public static void Main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Solution sol=new Solution();
        if(sol.isPalindrome(x)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}