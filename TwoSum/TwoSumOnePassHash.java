package TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOnePassHash {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 5;

        int sol[] = twoSum(arr, target);
        System.out.println(Arrays.toString(sol));

    }

    static int[] twoSum(int nums[], int target){

        HashMap <Integer, Integer> nuMap = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            int complement = target - nums[i];
            if(nuMap.containsKey(complement)){
                return new int[] {nuMap.get(complement), i};
            }
            nuMap.put(nums[i], i);
        }
        return new int []{};
    }
}


