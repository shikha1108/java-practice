package algo;

import java.util.ArrayList;
import java.util.List;

public class Maximum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
//        numbers.add(-50);
//        numbers.add(-20);
//        numbers.add(-90);
//        numbers.add(-40);
//        numbers.add(-30);
        System.out.println(maximum(numbers));
    }

    private static Integer maximum(List<Integer> nums){
        Integer max = nums.get(0);
        for (Integer num : nums) {
            if (num > max){
                max = num;
            }
        }
        return max;
    }
}
