import java.util.Scanner; // Import thư viện Scanner

public class Bai4_Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khởi tạo Scanner

        // Nhập các hệ số a, b, c
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Tính căn delta (nếu delta >= 0)
        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Delta: " + delta);
            System.out.println("Căn delta: " + canDelta);
        } else {
            System.out.println("Delta: " + delta);
            System.out.println("Không thể tính căn delta vì delta < 0");
        }

        // Đóng Scanner
        scanner.close();
    }
}
