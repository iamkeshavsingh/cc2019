import java.util.HashMap;
import java.util.Scanner;

public class arrays {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void input(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void display(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] twoSum(int[] arr, int sum) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            map.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            int compliment = sum - arr[i];
            if (map.get(compliment) != null && map.get(compliment) != i) {
                return new int[] { i, map.get(compliment) };
            }
        }

        return new int[] {};
    }

    public static int linearSearch(int[] arr, int target) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (arr[i] == target)
                return i;
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }

        return -1;
    }

    public static int integralSquareRoot(int num) {

        int start = 0;
        int end = num;

        int ans = 0;

        while (start <= end) {

            int mid = (start + end) / 2;
            if ((mid * mid) <= num) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

}