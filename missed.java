import java.util.*;
public class missed {
    public static void main(String[] args) {
        int[] arr = {5, 3, -1, 2, 1, 8};

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
