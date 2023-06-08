import java.util.Scanner;
public class Themphantuvaomang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int N = scanner.nextInt();

        // Khai báo mảng với số lượng phần tử đã nhập
        int[] arr = new int[N];

        // Nhập các giá trị cho mảng
        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < N; i++) {
            System.out.print("Nhập giá trị thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Nhập giá trị cần chèn
        System.out.print("Nhập giá trị cần chèn: ");
        int value = scanner.nextInt();

        // Nhập vị trí cần chèn
        System.out.print("Nhập vị trí cần chèn (từ 1 đến " + N + "): ");
        int position = scanner.nextInt();

        // Kiểm tra vị trí hợp lệ
        if (position < 1 || position > N + 1) {
            System.out.println("Vị trí không hợp lệ!");
        } else {
            // Tạo mảng mới với số phần tử lớn hơn 1
            int[] newArray = new int[N + 1];

            // Sao chép các phần tử từ mảng cũ vào mảng mới
            for (int i = 0, j = 0; i < N + 1; i++) {
                if (i == position - 1) {
                    // Chèn giá trị mới vào vị trí cần chèn
                    newArray[i] = value;
                } else {
                    // Sao chép giá trị từ mảng cũ vào mảng mới
                    newArray[i] = arr[j];
                    j++;
                }
            }

            // In ra mảng mới sau khi chèn giá trị
            System.out.println("Mảng sau khi chèn giá trị:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }

        scanner.close();
    }
}
