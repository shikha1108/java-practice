package algo;

import java.util.ArrayList;
import java.util.List;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(60);
        numbers.add(30);
        numbers.add(10);
        numbers.add(100);
        System.out.println(numbers);
        System.out.println(sortNumbers(numbers));
    }

    private static List<Integer> sortNumbers(List<Integer> nums) {
        List<Integer> sortedlist = new ArrayList<>();
        Integer size = nums.size();
        for (int i = 0; i < size; i++) {
            Integer min = Minimum.minimum(nums);
            sortedlist.add(min);
            nums.remove(min);
        }
        return sortedlist;
    }

}
