package Array.Basics;

public class LinearSearch {
    public int linearSearch(int nums[], int target) {

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
     void main(String[] args) {
        int arr[] = {1,2,3,4,5};
       // linearSearch(arr,3);


    }
}
