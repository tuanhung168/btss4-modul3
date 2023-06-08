import java.util.Scanner;
public class bt6SS4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();

        System.out.print("Nhập số cột của mảng: ");
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];

        System.out.println("Nhập các phần tử của mảng:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Nhập thứ tự của cột (tính từ 0): ");
        int columnOrder = scanner.nextInt();

        double columnSum = 0;

        for (int i = 0; i < rows; i++) {
            columnSum += array[i][columnOrder];
        }

        System.out.println("Tổng của cột " + columnOrder + " là: " + columnSum);

        scanner.close();
    }
}
