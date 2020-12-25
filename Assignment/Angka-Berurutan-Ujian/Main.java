class Main {
  public static int ujian(int[] nums) {
 
 if(nums == null || nums.length ==0){
   return 0;
 }
   int nilai = nums.length;
   int[] dp = new int [nilai];
   int max = 0; 
   
 for (int i = 0; i < nilai; i++) {
   for (int j = 0; j < i; j++) {
     if (nums[i] > nums[j]) {
       dp[i] = Math.max(dp[i], dp[j] +1);
     }
 }
 max = Math.max(dp[i], max);
  }
  return max + 1;
}
public static void main(String[] args){
  int[] nums = {4, 2, 3, 3, 2, 4, 6, 7, 3, 9};
  System.out.print(ujian(nums));
}
}

