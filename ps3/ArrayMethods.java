// CS 112 PS3 Problem 4
// ArrayMethods.java
// By: Tsz Kit Wong
// Email: wongt@bu.edu

import java.util.*;

public class ArrayMethods {
    public static final String[] DAY_NAMES = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    
    public static int getDayNum(String day) {   
       
        boolean contain = false;
        int index = 0;
        
        for (int i = 0; i < DAY_NAMES.length; i++) {
            if (DAY_NAMES[i].equalsIgnoreCase(day)) {
                contain = true;
                index = i;
            }
        }
        if (contain != true || day == null) {
            return -1;
        }

        return index;
    }

    public static void swapNeighbors(int[] values) {
        
        if (values == null) {
            throw new IllegalArgumentException();
        }
        
        for (int i = 0; i < values.length-1; i += 2) {
            int holder = values[i];
            values[i] = values[i+1];
            values[i+1] = holder;
        }
    }

    public static int[] copyWithCeiling(int[] values, int ceiling) {
        
        if (values == null) {
            throw new IllegalArgumentException();
        }

        int[] newValues = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            if (values[i] > ceiling) {
                newValues[i] = ceiling;
            } else {
                newValues[i] = values[i];
            }
        }
        return newValues;
    }

    public static int mostOccur(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        
        int numWithMost = arr[0];
        int currNum = 0;
        int currCount = 1;
        int maxCount = 1;

        for (int i = 0; i < arr.length-1; i++) {
            currNum = arr[i];
            currCount = 0;
            for (int x = 0; x < arr.length-1; x++) {
                if (currNum == arr[x+1]) {
                    currCount++;
                }
            }
            if (currCount > maxCount) {
                numWithMost = currNum;
                maxCount = currCount;
            }
        }
        return numWithMost;
    }

    public static int find(int[] arr1, int[] arr2) {
        
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length ==0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < (arr2.length - arr1.length); i++) {
            boolean found = false;

            for (int x = 0; i < arr1.length; x++) {
                if (arr2[i+x] == arr1[x]) {
                    found = true;
                }
            }

            if (found == true) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int[] a1 = {0,2,4,6,8,10};
        int[] a2 = {1,2,3,4,5,6,7};
        swapNeighbors(a1);
        swapNeighbors(a2);
        
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        System.out.println(getDayNum("Sunday"));
        System.out.println(getDayNum("No"));
        System.out.println(getDayNum("Wednesday"));

        int[] a3 = {2, 5, 6, 3, 7, 4, 1};
        int[] a4 = ArrayMethods.copyWithCeiling(a3, 4);
        System.out.println(Arrays.toString(a4));

        int[] arr = {1, 2, 3, 3, 8, 8, 8, 8, 11, 11, 11, 14, 19, 19};
        System.out.println(mostOccur(arr));

        int[] list1 = {1, 3, 6};
        int[] list2 = {1, 3, 5, 8, 12, 1, 3, 17, 1, 3, 6, 9, 1, 3, 6};
        System.out.println(find(list1, list2));
    }

}
