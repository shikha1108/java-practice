package algo;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String text = "hello how are you are you okay yes";
        System.out.println(countsWord(text));
        System.out.println(countWordMap(text));
    }
    private static Integer countsWord(String text){
        String[] words = text.split(" ");
        Integer result = words.length;

        return result;
    }
    private static Map<String, Integer> countWordMap(String text) {
        Map<String, Integer> countMap = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if(countMap.containsKey(word)){
                Integer old = countMap.get(word);
                countMap.put(word, old + 1);
            }
            else {
                countMap.put(word, 1);
            }
        }
        return countMap;
    }
}
