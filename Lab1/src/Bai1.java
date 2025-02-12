import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();

        // Xuất kết quả ra màn hình
        System.out.printf("%s %.2f điểm\n", hoTen, diemTB);

        // Đóng scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}
