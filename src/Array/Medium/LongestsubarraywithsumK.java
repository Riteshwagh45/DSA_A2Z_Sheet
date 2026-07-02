
package Array.Medium;

public class LongestsubarraywithsumK {
    public static int  longestSubarray(int nums[] , int k){
        int sum = 0;
        int curreLength = 0;
        int maxLength = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){

                sum+= nums[j];
                curreLength++;
                if(sum == k){
                    maxLength = Math.max(curreLength,maxLength);

                }
            }
            curreLength = 0;
            sum = 0;
        }
        return maxLength;
    }
    static void main(String[] args) {
        int nums[] = {-1,1,1};
        int k = 1;
        System.out.println(longestSubarray(nums,k));

    }
}
