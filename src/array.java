import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = enterArr();
        ShowArr(arr);
        System.out.print("\nenter X: ");
        int X = scanner.nextInt();
        delete(arr, X);

    }

    public static int[] enterArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enterSize: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void ShowArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void delete(int[] arr, int X) {
        int index;

        for (index = 0; index < arr.length; index++) {
            if (X == arr[index]) {
                for (int j = index; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}




