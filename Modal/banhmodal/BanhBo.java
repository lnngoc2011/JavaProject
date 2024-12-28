package banhmodal;

import java.util.ArrayList;

public class BanhBo {
	BanhDao banhdao = new BanhDao();
	ArrayList<Banh> ds;

	public ArrayList<Banh> getBanh() throws Exception {
		ds = banhdao.getBanh();
		return ds;
	}

	public ArrayList<Banh> timBanh(String timBanh) throws Exception {
		ds = banhdao.timBanh(timBanh);
		return ds;
	}

	public void taoBanh(Banh banh) throws Exception {
		banhdao.taoBanh(banh);
	}

	public void xoaBanh(String maBanh) throws Exception {
		banhdao.xoaBanh(maBanh);
	}
	public void editBanh(Banh banh) throws Exception {
		banhdao.editBanh(banh);
	}

}
