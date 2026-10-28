import java.util.*;
public class word1 {
    public static void main(String[] args) {
        String s = "Hello world";
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("vowels: " + vowels);
        System.out.println("consonants: " + consonants);
    }
}
