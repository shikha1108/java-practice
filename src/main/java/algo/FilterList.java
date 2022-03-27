package algo;

import java.util.ArrayList;
import java.util.List;

public class FilterList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(90);
        numbers.add(60);
        System.out.println(filter(numbers, 50));
    }
    private static List<Integer> filter(List<Integer> nums, Integer key) {
        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < nums.size(); i++) {
//            Integer num = nums.get(i);
//            if(num < key) {
//                result.add(num);
//            }
//        }
        for (Integer num : nums) {
            if(num < key) {
                result.add(num);
            }
        }
        return result;
    }
}
