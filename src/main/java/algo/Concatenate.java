package algo;

import java.util.ArrayList;
import java.util.List;

public class Concatenate {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("anu");
        names.add("pankaj");
        names.add("bruno");
        names.add("mamta");
        System.out.println(concatenate(names));
    }
    private static String concatenate(List<String> strs) {
        String add = "";
        for (String str : strs) {
            add = add + str;
        }
        return add;
    }
}
