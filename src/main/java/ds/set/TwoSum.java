package ds.set;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(twoSum(numbers, 30));
        System.out.println(twoSum(numbers, 100));
    }

    private static Boolean twoSum(List<Integer> nums, Integer sum) {
        Boolean result = false;
        for (Integer i = 0; i < nums.size(); i = i + 1) {
            for (Integer j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == sum) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
