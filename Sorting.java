import java.util.Arrays;

public class Sorting {
    private int[] array;

    public Sorting(int[] array) {
        this.array = array.clone();
    }

    public int[] getArray() {
        return array;
    }

    public void bubbleSort(String[] names) {
        int n = array.length;
        System.out.println("Array Awal: " + Arrays.toString(array));
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Iterasi ke-" + (i + 1) + ":");
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
                System.out.println("  Setelah membandingkan indeks " + j + " (" + array[j] + ") dan " + (j + 1) + " (" + array[j + 1] + "): " + Arrays.toString(array));
            }
        }
    }

    public void selectionSort(String[] names) {
        int n = array.length;
        System.out.println("Array Awal: " + Arrays.toString(array));
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            System.out.println("Iterasi ke-" + (i + 1) + ":");
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            String tempName = names[minIndex];
            names[minIndex] = names[i];
            names[i] = tempName;

            System.out.println("  Setelah menukar indeks " + i + " (" + array[i] + ") dengan indeks " + minIndex + " (" + array[minIndex] + "): " + Arrays.toString(array));
        }
    }
}
