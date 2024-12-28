package giohangmodal;

public class GioHang {
	private String makhachhang;
	private String mabanh;
	private String tenbanh;
	private Long gia;
	private String soluong;

	public GioHang(String makhachhang, String mabanh, String tenbanh, Long gia, String soluong) {
		super();
		this.makhachhang = makhachhang;
		this.mabanh = mabanh;
		this.tenbanh = tenbanh;
		this.gia = gia;
		this.soluong = soluong;
	}

	public GioHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMakhachhang() {
		return makhachhang;
	}

	public void setMakhachhang(String makhachhang) {
		this.makhachhang = makhachhang;
	}

	public String getMabanh() {
		return mabanh;
	}

	public void setMabanh(String mabanh) {
		this.mabanh = mabanh;
	}

	public String getTenbanh() {
		return tenbanh;
	}

	public void setTenbanh(String tenbanh) {
		this.tenbanh = tenbanh;
	}

	public Long getGia() {
		return gia;
	}

	public void setGia(Long gia) {
		this.gia = gia;
	}

	public String getSoluong() {
		return soluong;
	}

	public void setSoluong(String soluong) {
		this.soluong = soluong;
	}

}
