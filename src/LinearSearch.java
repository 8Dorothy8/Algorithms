public class LinearSearch {
    public static void main(String[] args) {
        int[] testValues = {4, 9, 7, 3, 2, 8, 6, 5};
        int position = linearSearch(testValues,6);
        System.out.println("Found target at index" + position);
    }

    public static int linearSearch(int[] values, int key) {
        for (int i = 0; i< values.length; i++) {
            if (values[i] == key)
                return i;
        }
        return -1;
    }
}
