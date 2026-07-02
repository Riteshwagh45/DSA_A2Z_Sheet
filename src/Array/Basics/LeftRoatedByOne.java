package Array.Basics;

public class LeftRoatedByOne {

    public void rotateArrayByOne(int[] nums) {

        int temp = nums[0];

        for(int i = 0; i < nums.length - 1; i++){
            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = temp;
    }

    static void main(String[] args) {
        //you can call this method and pass the Array:

    }
}
