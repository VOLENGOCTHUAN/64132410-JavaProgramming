import java.util.Scanner; // Import thư viện Scanner

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khởi tạo Scanner

        // Nhập chiều dài và chiều rộng
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        // Tính chu vi, diện tích và cạnh nhỏ nhất
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        // Xuất kết quả
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ nhất: " + canhNhoNhat);

        // Đóng Scanner
        scanner.close();
    }
}
