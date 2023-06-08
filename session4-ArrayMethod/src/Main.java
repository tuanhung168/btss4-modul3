import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //khai báo mảng
        int[] arrInt = {1,2,3,4};
        int arrInt1[];
        System.out.println("mang ban dau =>>" + Arrays.toString(arrInt));
        test(arrInt);
        System.out.println("mang sau khi da thay doi =>>" + Arrays.toString(arrInt));
        int[] arrInt2 = new int[5];
        System.out.println("cac gia tri chua khoi tao cuar mang ArrItn2" + Arrays.toString(arrInt2) );
    }
    public static void test(int[] arr){
        arr[1] =10;
    }
}