import java.util.Scanner;
public class Timgiatrinhonhattrongmang {
    public static void main(String[] args) {
        final int SIZE = 5; // Kích thước của mảng, bạn có thể thay đổi nếu cần

        // Khai báo mảng số nguyên
        int[] arr = new int[SIZE];

        // Nhập giá trị cho các phần tử trong mảng từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Tìm giá trị nhỏ nhất trong mảng
        int min = arr[0];
        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // In ra giá trị nhỏ nhất
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
