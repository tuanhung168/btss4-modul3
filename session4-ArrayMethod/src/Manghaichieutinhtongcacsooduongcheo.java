import java.util.Scanner;

public class Manghaichieutinhtongcacsooduongcheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước ma trận
        System.out.print("Nhập kích thước ma trận vuông: ");
        int size = scanner.nextInt();

        // Tạo ma trận từ nhập liệu của người dùng
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Tính tổng các phần tử trên đường chéo chính
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }

        // In tổng ra màn hình
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum);

        scanner.close();
    }
}
