
import java.util.ArrayList;
import java.util.List;

public class PrintSubsequencesSum {

    /*
     * ✅ Problem: Print All Subsequences With Sum K
     * 
     * Given an integer array arr and a target integer K,
     * print all subsequences of the array whose sum is exactly equal to K.
     * 
     * A subsequence is a sequence that can be derived from the array by deleting
     * zero or more elements without changing the order of the remaining elements.
     * 
     * Input:
     * 
     * arr = [1, 2, 1]
     * K = 2
     * 
     * Output:
     * 
     * [1, 1]
     * [2]
     */

    public static void main(String[] args) {

        int[] arr = { 3, 1, 2, 4 };
        int expectedSum = 3;

        PrintSubsequencesSum(arr, 0, expectedSum, 0, new ArrayList<>());
    }

    public static void PrintSubsequencesSum(int[] arr, int index, int expectedSum, int currentSum,
            List<Integer> currentList) {

        if (index >= arr.length) {

            if (currentSum == expectedSum) {
                System.out.println(currentList);
            }
            return;
        }

        currentList.add(arr[index]);
        currentSum += arr[index];

        PrintSubsequencesSum(arr, index + 1, expectedSum, currentSum, currentList);

        currentList.remove(currentList.size() - 1);
        currentSum -= arr[index];

        PrintSubsequencesSum(arr, index + 1, expectedSum, currentSum, currentList);

    }

}
