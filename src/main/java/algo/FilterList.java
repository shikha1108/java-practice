package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<String> result1 = filterByName(names,"a");
       System.out.println(result1);
        System.out.println(filterByCharacter(names,"a"));


    }
    private static List<Integer> filter(List<Integer> nums, Integer key) {
        List<Integer> result = new ArrayList<>();
       for (int i = 0; i < nums.size(); i++) {
            Integer num = nums.get(i);
            if(num < key) {
                result.add(num);
            }
        }
        for (Integer num : nums) {
            if(num < key) {
                result.add(num);
            }
        }
        return result;
    }
    
    private static List<String> filterByLength(List<String> names, Integer key){
//        return names.stream().filter(n -> n.length()>= key).collect(Collectors.toList());
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if(name.length()  >= key){     // > -> greater than, < -> smaller than, >= ->greatethan or equal to, <=,
                result.add(name);
            }
        }
        return result;

    }
    private static List<String> filterByName(List<String> names,String key) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            Boolean result1 = name.startsWith(key);
            if(true) {
                result.add(name);
            }
        }
        return result;
    }
    private static List<String> filterByCharacter(List<String> names,String key){
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.endsWith(key)){
                result.add(name);
            }
        }
        return result;
    }
}



