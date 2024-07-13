import java.util.Arrays;

/**
 * A01TwoSum
 */
public class A01TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;

        int[] ans = sum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sum(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    return new int[] {arr[i], arr[j]};
                }
            }
        }
        return new int[] {};
    }
}
