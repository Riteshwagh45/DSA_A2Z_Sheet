package Array.Basics;

public class SingleNumber {

    public static void main(String[] args) {

        int nums[] = {1,2,2,4,3,1,4};

        int xor = 0;

        for(int num : nums){
            xor ^= num;
        }

        System.out.println("Single Number = " + xor);
    }
}