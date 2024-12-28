//package Controller;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import banhmodal.Banh;
//import banhmodal.BanhBo;
//
//@WebServlet("/TestController")
//public class TestController extends HttpServlet {
//
//	private static final long serialVerionUID = 1L;
//
//	public TestController() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		try {
//			BanhBo banhbo = new BanhBo();
//			List<Banh> ds = new ArrayList();
//			ds = banhbo.getBanh();
//			req.setAttribute("ds", ds);
//			RequestDispatcher rd = req.getRequestDispatcher("/TrangChu.jsp");
//			rd.forward(req, resp);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doPost(req, resp);
//	}
//
//}
