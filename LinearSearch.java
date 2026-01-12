package ArraysAllQuestions;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter the values of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Step 1: Take element to search
        System.out.println("Enter the element to search:");
        int target = sc.nextInt();

        // Step 2: Linear Search
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        // Step 3: If not found
        if (!found) {
            System.out.println("Element not found in the array");
        }

        sc.close();
    }
}
