import java.util.Scanner;
public class Timphantulonnhattrongmanghaichieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước ma trận từ người dùng
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int columns = scanner.nextInt();

        // Khởi tạo ma trận
        double[][] matrix = new double[rows][columns];

        // Nhập giá trị cho từng phần tử của ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị cho phần tử tại vị trí [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Tìm giá trị lớn nhất và tọa độ tương ứng
        double maxValue = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        // Hiển thị kết quả
        System.out.println("Phần tử lớn nhất trong ma trận là " + maxValue);
        System.out.println("Tọa độ của phần tử lớn nhất là [" + maxRow + "][" + maxColumn + "]");

        scanner.close();
    }
}
