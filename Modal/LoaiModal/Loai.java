package LoaiModal;

public class Loai {
	private String maloai;
	private String tenloai;

	public String getMaloai() {
		return maloai;
	}

	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}

	public String getTenloai() {
		return tenloai;
	}

	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}

	public Loai(String maloai, String tenloai) {
		super();
		this.maloai = maloai;
		this.tenloai = tenloai;
	}

	public Loai() {
		super();
		// TODO Auto-generated constructor stub
	}

}
