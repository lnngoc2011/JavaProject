package LoaiModal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import banhmodal.Banh;
import ketnoimodal.KetNoi;

public class LoaiDao {
	LoaiDao loaiDao = new LoaiDao();
	public ArrayList<Loai> getLoai() throws Exception {
		ArrayList<Loai> ds = new ArrayList<Loai>();

		KetNoi kn = new KetNoi();
		kn.ketnoi();

		String sql = "Select * from Loai";

		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();

		while (rs.next()) {
			String maloai = rs.getString("maloai");
			String tenloai = rs.getString("tenloai");
		
			ds.add(new Loai(maloai, tenloai));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	public void taoLoai( Loai loai) throws Exception {
		   KetNoi kn = new KetNoi();
		   kn.ketnoi();

		   try {
				String sql = "INSERT INTO Loai (maloai, tenloai) VALUES (?, ?)";
		       PreparedStatement cmd = kn.cn.prepareStatement(sql);
		       
		       cmd.setString(1, loai.getMaloai());
		       cmd.setString(2, loai.getTenloai());		 
		       int ketQua = cmd.executeUpdate();
		       
		       cmd.close();
		   }
		   catch (Exception e) {
		       e.printStackTrace();
		       throw e;
		   }
		   finally {
		       kn.cn.close();
		   }
		}
	public void editLoai(Loai loai) throws Exception {
		   KetNoi kn = new KetNoi();
		   kn.ketnoi();

		   try {
		       String sql = "UPDATE Loai SET tenloai = ? WHERE maloai = ?";
		       PreparedStatement cmd = kn.cn.prepareStatement(sql);
		       
		       cmd.setString(1, loai.getMaloai());
		       cmd.setString(2, loai.getTenloai());		 
		       int ketQua = cmd.executeUpdate();
		       
		       cmd.close();
		   }
		   catch (Exception e) {
		       e.printStackTrace();
		       throw e;
		   }
		   finally {
		       kn.cn.close();
		   }
		}
}
