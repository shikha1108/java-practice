package algo;

import java.util.ArrayList;
import java.util.List;

public class Transform {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        names.add("anu");
        names.add("unu");
        names.add("una");
        numbers.add(20);
        numbers.add(50);
        numbers.add(70);
        System.out.println(transform(names));
        System.out.println(tranformNumber(numbers));
    }

    private static List<String> transform(List<String> strs){
        List<String> result = new ArrayList<>();
        for (String str : strs) {
            String name = str.toUpperCase();
            result.add(name);
        }
        return result;
    }
    private static List<Integer> tranformNumber(List<Integer> nums){
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            Integer multi = num * 2;
            result.add(multi);
        }
        return result;
    }
}
