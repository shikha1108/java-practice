package algo;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        permutation1(letters);
        permutation2(letters);

        // Permutation: AA, AB, AC, BA, BB, BC, CA, CB, CC : 3 x 3
        // Permutation: AB, AC, BA, BC, CA, CB : 3 x 2
        // Combination: AB, AC, BC : 3 x 2 / 2

    }
    private static void permutation1(List<String> strs) {
        for (int i = 0; i < strs.size(); i++) {
            for (int j = 0; j < strs.size(); j++) {
                System.out.print(strs.get(i) + "");
                System.out.println(strs.get(j));
            }
        }
    }
    private static void permutation2(List<String> strs) {
        for (int i = 0; i < strs.size(); i++) {
            for (int j = 0; j < strs.size(); j++) {
                if (i != j) {
                    System.out.print(strs.get(i) + "");
                    System.out.println(strs.get(j));
                }
            }
        }
    }
}
