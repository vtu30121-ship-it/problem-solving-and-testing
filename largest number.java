import java.util.*;

public class Main {

    public static String largestNumber(int[] nums) {

        
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        
        Arrays.sort(arr, (a, b) -> {
            String ab = a + b;
            String ba = b + a;

            return ba.compareTo(ab);
        });

        
        if (arr[0].equals("0")) {
            return "0";
        }

      
        StringBuilder result = new StringBuilder();

        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        int[] nums = {3, 30, 34, 5, 9};

        System.out.println(largestNumber(nums));
    }
}
