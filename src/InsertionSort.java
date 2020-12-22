public class InsertionSort {
    public static void main(String[] args) {
        int[]values = {3,1,9,5,6,2,2,7,8,11};
        insertionSort(values);
    }
    public static int insertionSort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int currentValue = values [i];
            int compare = i - 1;
        while (compare >= 0 && values [compare] > currentValue) {
            values[compare + 1] = values[compare];
            compare = compare - 1;
        }
            values [compare + 1] = currentValue;
        }

        for (int i = 0; i< values.length; i++) {
            System.out.println(" " + values[i]);
        }
        return -1;
    }
}
