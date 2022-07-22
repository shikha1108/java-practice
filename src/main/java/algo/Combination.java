package algo;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    //hello lucky
    //hello anu
    //bye lucky
    //bye anu
    //hey billy
    //hey anu tell today work

    static List<String> fruits = new ArrayList<>();

    public static void main(String[] args) {
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("grapes");
        fruits.add("guava");
        //Combination
        // apple, orange
        // apple, banana
        // apple, grapes
        // orange, banana
        // orange, grapes
        // banana, grapes

        // combination: ordering : 4 x 3 = 12 / 2
        combinations(fruits);
    }

    private static void combinations(List<String> strs) {
        //nested for loop
        for (Integer i = 0; i < strs.size(); i = i + 1) {
            for (Integer j = i + 1; j < strs.size(); j++) {
                System.out.print(strs.get(i) + " ");
                System.out.println(strs.get(j));
            }
        }
    }
}
