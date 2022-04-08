package algo;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(sum(numbers));
    }

    private static Integer sum(List<Integer> nums){
        Integer sum = 0;
        for (Integer num : nums) {
            sum = sum + num;
        }
        return sum;
    }
}
