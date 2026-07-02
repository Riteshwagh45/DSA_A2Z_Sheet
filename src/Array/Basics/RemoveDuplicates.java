package Array.Basics;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int j = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;

    }
    static void main(String[] args) {
     //you should create a array and call this method removeDuplicates...
    }
}
