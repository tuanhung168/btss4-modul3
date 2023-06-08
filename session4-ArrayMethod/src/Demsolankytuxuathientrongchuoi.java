import java.util.Scanner;
public class Demsolankytuxuathientrongchuoi {
    public static void main(String[] args) {
        // Bước 1: Khai báo và gán giá trị cho chuỗi
        String str = "Hello World";

        // Bước 2: Nhập ký tự từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự cần đếm: ");
        char ch = scanner.nextLine().charAt(0);
        scanner.close();

        // Bước 3: Khai báo và khởi tạo biến count
        int count = 0;

        // Bước 4: Duyệt qua từng ký tự trong chuỗi và đếm số lần xuất hiện
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        // In ra kết quả
        System.out.println("Số lần xuất hiện của ký tự " + ch + " trong chuỗi là: " + count);
    }
}
