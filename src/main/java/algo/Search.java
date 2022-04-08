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
        List<String> names = new ArrayList<>();
        names.add("pankaj");
        names.add("mamta");
        names.add("anu");
        names.add("Bruno");
        System.out.println(search2(names, "pankaj"));
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
    private static Boolean search2(List<String> strs, String key) {
        Boolean result = false;
        for (String str : strs) {
            if(str.equals(key)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
