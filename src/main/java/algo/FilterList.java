package algo;

import java.util.ArrayList;
import java.util.List;

public class FilterList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<String> names = new ArrayList<>();
        names.add("lucky");
        names.add("animesh");
        names.add("mamta");
        names.add("anu");
        names.add("pankaj");
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(90);
        numbers.add(60);
        System.out.println(filter(numbers, 50));
        System.out.println(filterByLength(names, 5));
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
    
    private static List<String> filterByLength(List<String> names, Integer key){
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if(name.length()  >= key){ // > -> greater than, < -> smaller than, >= ->greatethan or equal to, <=,
                result.add(name);
            }
        }
        return result;
    }
}
