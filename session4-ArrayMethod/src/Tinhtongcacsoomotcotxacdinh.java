import java.util.Scanner;
public class Tinhtongcacsoomotcotxacdinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        // Khởi tạo mảng hai chiều
        double[][] array = new double[rows][cols];

        // Nhập giá trị cho mảng từ người dùng
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Nhập số cột bạn muốn tính tổng (tính từ 0): ");
        int column = scanner.nextInt();

        // Tính tổng các phần tử của cột
        double columnSum = 0;
        for (int i = 0; i < rows; i++) {
            columnSum += array[i][column];
        }

        System.out.println("Tổng của cột " + column + " là: " + columnSum);

        scanner.close();
    }
}
