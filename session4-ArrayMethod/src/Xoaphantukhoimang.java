import java.util.Arrays;
import java.util.Scanner;


public class Xoaphantukhoimang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng từ người dùng
        System.out.print("Nhập kích thước mảng: ");
        int size = scanner.nextInt();

        // Khởi tạo mảng và nhập các phần tử từ người dùng
        int[] arr = new int[size];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Nhập phần tử cần xoá
        System.out.print("Nhập phần tử cần xoá: ");
        int element = scanner.nextInt();

        // Xoá phần tử nếu tồn tại trong mảng
        int[] newArr = deleteElement(arr, element);

        // In mảng sau khi xoá phần tử
        System.out.println("Mảng sau khi xoá phần tử " + element + ":");
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] deleteElement(int[] arr, int element) {
        // Tìm vị trí của phần tử trong mảng
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        // Nếu phần tử không tồn tại trong mảng, trả về mảng ban đầu
        if (index == -1) {
            return arr;
        }

        // Xoá phần tử khỏi mảng
        int[] newArr = new int[arr.length - 1];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }

        return newArr;
    }
}
