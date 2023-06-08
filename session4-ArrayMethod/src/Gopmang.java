import java.util.Scanner;
public class Gopmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của hai mảng
        System.out.print("Nhập kích thước của mảng 1: ");
        int size1 = scanner.nextInt();
        System.out.print("Nhập kích thước của mảng 2: ");
        int size2 = scanner.nextInt();

        // Khai báo và khởi tạo hai mảng
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        // Nhập giá trị cho mảng 1
        System.out.println("Nhập giá trị cho mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Nhập giá trị cho mảng 2
        System.out.println("Nhập giá trị cho mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Gộp hai mảng thành mảng thứ ba
        int size3 = size1 + size2;
        int[] array3 = new int[size3];
        int index = 0;

        for (int i = 0; i < size1; i++) {
            array3[index] = array1[i];
            index++;
        }

        for (int i = 0; i < size2; i++) {
            array3[index] = array2[i];
            index++;
        }

        // In mảng thứ ba
        System.out.println("Mảng thứ ba sau khi gộp:");
        for (int i = 0; i < size3; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
