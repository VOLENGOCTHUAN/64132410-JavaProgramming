import java.util.ArrayList;

public class CT {

	public static void main(String[] args) {
		// khai báo danh sách sản phẩm
		ArrayList<SanPham> dsSanPham;
		// Xin mới
		dsSanPham = new ArrayList<SanPham>();
		// Nhập 3 sản phẩm
		SanPham sp1 = new SanPham(1, "bánh mì", "fast food", "chưa có");
		SanPham sp2 = new SanPham(2, "bánh bao", "fast food", "chưa có");
		SanPham sp3 = new SanPham(3, "bánh bò", "ăn vặt", "chưa có");
		// Thêm vào danh sách (ArrayList)
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
		for (int i = 0; i<dsSanPham.size(); i++) {
			System.out.println(dsSanPham.get(i).toString());
		}
	}
}
