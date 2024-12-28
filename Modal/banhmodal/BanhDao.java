package banhmodal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ketnoimodal.KetNoi;

public class BanhDao {
	public ArrayList<Banh> getBanh() throws Exception {
		ArrayList<Banh> ds = new ArrayList<Banh>();

		KetNoi kn = new KetNoi();
		kn.ketnoi();

		String sql = "Select * from Banh";

		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();

		while (rs.next()) {
			String mabanh = rs.getString("mabanh");
			String tenbanh = rs.getString("tenbanh");
			Long soluong = rs.getLong("soluong");
			Long gia = rs.getLong("gia");
			String anh = rs.getString("anh");
			String maloai = rs.getString("maloai");
			ds.add(new Banh(mabanh, tenbanh, anh, soluong, gia, maloai));
		}
		rs.close();
		kn.cn.close();
		return ds;

	}

	public ArrayList<Banh> timBanh(String tim) throws Exception {
		ArrayList<Banh> ds = new ArrayList<Banh>();

		KetNoi kn = new KetNoi();
		kn.ketnoi();

		String sql = "SELECT Banh.* FROM Banh " + "INNER JOIN Loai ON Banh.maloai = Loai.maloai "
				+ "WHERE LOWER(Banh.tenbanh) LIKE ? OR LOWER(Loai.tenloai) LIKE ?";

		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		String timKiem = "%" + tim.toLowerCase() + "%";
		cmd.setString(1, timKiem);
		cmd.setString(2, timKiem);

		ResultSet rs = cmd.executeQuery();

		while (rs.next()) {
			String mabanh = rs.getString("mabanh");
			String tenbanh = rs.getString("tenbanh");
			Long soluong = rs.getLong("soluong");
			Long gia = rs.getLong("gia");
			String anh = rs.getString("anh");
			String maloai = rs.getString("maloai");
			ds.add(new Banh(mabanh, tenbanh, anh, soluong, gia, maloai));
		}

		rs.close();
		kn.cn.close();
		return ds;
	}

	public void xoaBanh(String maBanh) throws Exception {
		KetNoi kn = new KetNoi();
		kn.ketnoi();

		try {
			String sql = "DELETE FROM Banh WHERE mabanh = ?";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);

			cmd.setString(1, maBanh);

			int ketQua = cmd.executeUpdate();

			cmd.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			kn.cn.close();
		}
	}

	public void taoBanh(Banh banh) throws Exception {
		KetNoi kn = new KetNoi();
		kn.ketnoi();

		try {
			String sql = "INSERT INTO Banh (mabanh, tenbanh, soluong, gia, anh, maloai) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);

			cmd.setString(1, banh.getMabanh());
			cmd.setString(2, banh.getTenbanh());
			cmd.setLong(3, banh.getSoluong());
			cmd.setLong(4, banh.getGia());
			cmd.setString(5, banh.getAnh());
			cmd.setString(6, banh.getMaloai());

			int ketQua = cmd.executeUpdate();

			cmd.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			kn.cn.close();
		}
	}
	public void editBanh( Banh banh) throws Exception {
		   KetNoi kn = new KetNoi();
		   kn.ketnoi();

		   try {
		       String sql = "UPDATE Banh SET tenbanh = ?, soluong = ?, gia = ?, anh = ?, maloai = ? WHERE mabanh = ?";
		       PreparedStatement cmd = kn.cn.prepareStatement(sql);
		       
		       cmd.setString(1, banh.getTenbanh());
		       cmd.setLong(2, banh.getSoluong());
		       cmd.setLong(3, banh.getGia());
		       cmd.setString(4, banh.getAnh());
		       cmd.setString(5, banh.getMaloai());
		       cmd.setString(6, banh.getMabanh()); // Mã bánh để xác định bánh cần update
		       
		       int ketQua = cmd.executeUpdate();
		       
		       cmd.close();
		   }
		   catch (Exception e) {
		       e.printStackTrace();
		       throw e;
		   }
		   finally {
		       // Đóng kết nối
		       kn.cn.close();
		   }
		}
}
