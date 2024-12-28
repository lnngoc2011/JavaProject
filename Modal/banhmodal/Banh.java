package banhmodal;

public class Banh {
	private String mabanh;
	private String tenbanh;
	private String anh;
	private Long soluong;
	private Long gia;
	private String maloai;
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
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public Long getSoluong() {
		return soluong;
	}
	public Banh(String mabanh, String tenbanh, String anh, Long soluong, Long gia, String maloai) {
		super();
		this.mabanh = mabanh;
		this.tenbanh = tenbanh;
		this.anh = anh;
		this.soluong = soluong;
		this.gia = gia;
		this.maloai = maloai;
	}
	public Banh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setSoluong(Long soluong) {
		this.soluong = soluong;
	}
	public Long getGia() {
		return gia;
	}
	public void setGia(Long gia) {
		this.gia = gia;
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}

}
