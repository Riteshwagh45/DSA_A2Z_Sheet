package Array.Basics;

import java.util.*;

public class Unionoftwosortedarrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 7};
        ArrayList<Integer> list = new ArrayList<>();

       /*
        for(int i=0; i<arr1.length; i++){

            if(!list.contains(arr1[i])){
                list.add(arr1[i]);
            }
        }
        for(int i=0; i<arr2.length; i++){

            if(!list.contains(arr2[i])){
                list.add(arr2[i]);
            }
        }
        System.out.println(list);

        */
        LinkedHashSet<Integer> lsk = new LinkedHashSet<>();

        for(int i=0; i<arr1.length; i++){
            lsk.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            lsk.add(arr2[i]);
        }
        System.out.println(lsk);
    }

    }

