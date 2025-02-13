import java.util.Scanner; // Import thư viện Scanner

public class Bai3_TheTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khởi tạo Scanner

        // Nhập cạnh của khối lập phương
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();

        // Tính thể tích
        double theTich = Math.pow(canh, 3); // Hoặc dùng: canh * canh * canh

        // Xuất kết quả
        System.out.println("Thể tích của khối lập phương: " + theTich);

        // Đóng Scanner
        scanner.close();
    }
}
