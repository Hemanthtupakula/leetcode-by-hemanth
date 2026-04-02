class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
           return new int[]{};
    }
     
        public static void Main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int nums[]=new int[n];
            int target=sc.nextInt();
            for(int i=0;i<nums.length;i++){
                nums[i]=sc.nextInt();
            }
            int[] result=twoSum(nums,target);
            System.out.println(result);
        }
        
    
}