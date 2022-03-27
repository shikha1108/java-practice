package algo;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(60);
        numbers.add(30);
        numbers.add(50);
        System.out.println(search(numbers,20));
    }
    private static Boolean search(List<Integer> nums, Integer key) {
        Boolean result = false;
        for (Integer num : nums) {
            if(num == key) {
                result = true;
                break;
            }
        }
        return result;
    }

}
