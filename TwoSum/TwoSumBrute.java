package TwoSum;

import java.util.Arrays;

public class TwoSumBrute{
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        int tagert = 5;

        int sol[] = twoSum(arr, tagert);

        System.out.println(Arrays.toString(sol));


    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int [] {i, j};
                }
            }
        }
        return new int[] {}; 
    }

}

/*  
    PS C:\Users\anujj\Desktop\LeetCodePractice> javac TwoSum/TwoSum.java
    PS C:\Users\anujj\Desktop\LeetCodePractice> java TwoSum.TwoSum      
    [0, 3]

    PS C:\Users\anujj\Desktop\LeetCodePractice\TwoSum> javac -d . TwoSum.java
    PS C:\Users\anujj\Desktop\LeetCodePractice\TwoSum> java TwoSum.TwoSum
    [0, 3]

 */