import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SelectionSort {
    public static void main(String[] args) {
        int[] sample = {3, 4, 1, 20, 5, 7, 2, 6};
        selectionSort(sample);
    }

    public static void selectionSort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[smallest]) {
                    smallest = j;
                }
            }
            int temp = values[i];
            values[i] = values[smallest];
            values[smallest] = temp;
        }


        System.out.print("Sorted array");
        for (int i = 0; i < values.length; i++) {
            System.out.println(" " + values[i]);
        }
    }
}
