package algo;

import java.util.ArrayList;
import java.util.List;

public class Minimum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-20);
        numbers.add(-10);
        numbers.add(-30);
        numbers.add(-90);
        numbers.add(-1);
        System.out.println(minimum(numbers));
    }

    private static Integer minimum(List<Integer> nums) {
        Integer min = nums.get(0);
        for (Integer num : nums) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }
}

