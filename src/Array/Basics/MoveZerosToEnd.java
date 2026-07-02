package Array.Basics;

public class MoveZerosToEnd {
    public static void moveZeroEnd(int nums[]){
        int j = 0;
        for(int i=0; i<nums.length; i++){

            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        //printing the Array
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] +" ");
        }
    }
    static void main(String[] args) {
        int nums[] = {0,1,4,5,0,2};

        moveZeroEnd(nums);

    }
}
