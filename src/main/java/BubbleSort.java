import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // 배열의 크기 입력 받기
            System.out.print("배열의 크기를 입력하세요: ");
            int size = Integer.parseInt(reader.readLine());

            // 배열의 원소 입력 받기
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("배열의 " + (i + 1) + "번째 원소를 입력하세요: ");
                array[i] = Integer.parseInt(reader.readLine());
            }

            System.out.println("정렬 전 배열: ");
            printArray(array);

            bubbleSort(array);

            System.out.println("정렬 후 배열: ");
            printArray(array);

            reader.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
