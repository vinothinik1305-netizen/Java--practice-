import java.util.*;
public class word2{
public static void palindrome(String []args){
    String s="madam";
    int i=0;
    int j=s.length()-1;
    boolean ispalindrome=true;
    while(i<j) {
        if(s.charAt(i)!=s.charAt(j)) {
            ispalindrome=false;
            break;
        }
        i++;
        j--;
    }
    System.out.println("Is palindrome: " + ispalindrome);
}
}
