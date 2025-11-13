//asjgfjashgfdj
import java.util.Scanner;

public class cArray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the number of elements (at least 10):");
        int n = SC.nextInt();

        if (n < 10) {
            System.out.println("Please enter at least 10 numbers.");
            SC.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = SC.nextInt();
        }

        int smallest = arr[0];
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

     
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
            if (arr[i] > largest)
                largest = arr[i];
        }


        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] < largest)
                secondLargest = arr[i];
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All elements are equal. No distinct second largest element.");
        } else {
            System.out.println("Smallest element: " + smallest);
            System.out.println("Largest element: " + largest);
            System.out.println("Second largest element: " + secondLargest);
        }

        SC.close();
    }
}
