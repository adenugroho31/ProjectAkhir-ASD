import java.util.Scanner;

public class ProductSortingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] productNames = new String[n];
        int[] productPrices = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nMasukkan nama barang ke-" + (i + 1) + ": ");
            productNames[i] = scanner.nextLine();
            System.out.print("Masukkan harga barang " + productNames[i] + ": ");
            productPrices[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\nPilih metode sorting untuk mengurutkan harga barang:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        int choice = scanner.nextInt();

        Sorting sorter = new Sorting(productPrices);

        switch (choice) {
            case 1:
                System.out.println("\nLangkah-langkah Bubble Sort:");
                sorter.bubbleSort(productNames);
                System.out.println("\nHarga barang setelah Bubble Sort:");
                break;
            case 2:
                System.out.println("\nLangkah-langkah Selection Sort:");
                sorter.selectionSort(productNames);
                System.out.println("\nHarga barang setelah Selection Sort:");
                break;
            default:
                System.out.println("\nPilihan tidak valid.");
                scanner.close();
                return;
        }

        System.out.println("Daftar barang yang sudah diurutkan berdasarkan harga:");
        for (int i = 0; i < n; i++) {
            System.out.println(productNames[i] + ": Rp" + sorter.getArray()[i]);
        }
        
        scanner.close();
    }
}
