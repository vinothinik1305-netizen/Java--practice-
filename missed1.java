import java.util.*;
public class missed1 {
    public static void main(String[] args) {
        int[] arr = {6,1,0,2,9,5,6,3,7,4};

        for (int i = 1; i <= arr.length + 1; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(i);
                break;
            }
        }
    }
}
