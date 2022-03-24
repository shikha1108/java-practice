package algo;

public class Palindrome {
    public static void main(String[] args) {
        //NITIN, ANA, BOB, KANAK, SARAS

        System.out.println(palindrome("NITIN"));
        System.out.println(palindrome("ANU"));
    }

    private static Boolean palindrome(String s) {
        Boolean result = false;
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            reverse = c + reverse;
        }
        if(s.equals(reverse)){
            result = true;
        }

        return result;

    }
}
