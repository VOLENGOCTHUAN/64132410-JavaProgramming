
public class CT {

	public static void main(String[] args) {
		//Tạo ra 2 sản phẩm
		SanPham sp1 = new SanPham(0, null, null, null);
		SanPham sp2 = new SanPham(2,"Bánh mì","thức ăn nhanh","chưa có");
		sp1.setMaSP(1);
		sp1.setTenSP("Phở");
		sp1.setLoaiSP("đặc sản Việt Nam");
		sp1.setAnhSP("chưa có");
		
		//In ra thông tin 2 sản phẩm trên
		//in ra tất cả
		String thongtinSP1 = sp1.toString(); 
		//in thủ công
		String thongtinSP2 = "Mã sản phẩm 2 là: " + sp2.getMaSP();
				thongtinSP2 += "Tên sản phẩm 2 là: " + sp2.getTenSP();
		
		System.out.println(thongtinSP1);
		System.out.println(thongtinSP2);

	}

}
