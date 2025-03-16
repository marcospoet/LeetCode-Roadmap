import java.util.Arrays;
import java.util.HashMap;

public class SolutionTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diferencia = target - nums[i];
            if (map.containsKey(diferencia)) {
                return new int[]{map.get(diferencia), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums2 = {3,4,5,6};
        int target2 = 7;
        System.out.println(Arrays.toString(twoSum(nums2, target2))); // Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(nums3, target3))); // Output: [0, 1]
    }
}