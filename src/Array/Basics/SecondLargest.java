package Array.Basics;

public class SecondLargest {
    public static void main(String[] args){
        int nums[] = {4,2,10};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

           for(int i=0; i<nums.length; i++){

               if(nums[i] > firstMax){
                   secondMax = firstMax;
                   firstMax = nums[i];
               }
               else if(nums[i] > secondMax && nums[i] != firstMax){
                   secondMax = nums[i];
               }
           }
        System.out.println("First Max : " +firstMax);
        System.out.println("second max : "+ secondMax);

    }
}
