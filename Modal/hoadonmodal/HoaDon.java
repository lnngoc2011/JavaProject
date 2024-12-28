package hoadonmodal;

import java.util.Date;

public class HoaDon {
private Long mahoadon;
private String makhachhang;
private Date ngaymua;
private boolean damua;
public String getMakhachhang() {
	return makhachhang;
}
public void setMakhachhang(String makhachhang) {
	this.makhachhang = makhachhang;
}
public Date getNgaymua() {
	return ngaymua;
}
public void setNgaymua(Date ngaymua) {
	this.ngaymua = ngaymua;
}
public boolean isDamua() {
	return damua;
}
public void setDamua(boolean damua) {
	this.damua = damua;
}
public HoaDon(String makhachhang, Date ngaymua, boolean damua) {
	super();
	this.makhachhang = makhachhang;
	this.ngaymua = ngaymua;
	this.damua = damua;
}
}
