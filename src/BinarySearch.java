import java.util.Scanner;

public class BinarySearch {


    public static void main(String[] args) {
        int[] sample = {1, 2, 3, 4, 5, 6, 9, 10, 13, 15};
        int position = getUserInput("Choose a number between 1-15");
        int result = binarySearch(sample, position);

        if (result >= 0) {
            System.out.println("The index of our target is " + result);
        } else {
            System.out.println("index is unknown");
        }
    }

    public static int getUserInput(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        int response = scan.nextInt();

        return response;

    }
    public static int binarySearch(int[] values,int key) {


        int lowerBound = 0;
        int upperBound = values.length - 1;
        int midBound = -1;

        while (lowerBound <= upperBound) {

            midBound = (lowerBound + upperBound) / 2;

            if (values [midBound] == key) {
                return midBound;
            }
            else if (values [midBound] > key) {
                upperBound = midBound - 1;
            }
            else {
                lowerBound = midBound + 1;
            }
        }
        return -1;
    }
}