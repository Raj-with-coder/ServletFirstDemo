package in.sp.backend;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.dao.UserDao;

public class UserLogin extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid =req.getParameter("uid");
		String upass =req.getParameter("upass");
		
		System.out.println("User id = "+ uid);
		System.out.println("User Password = "+ upass);
		boolean flag = UserDao.userLogin(uid, upass);
		if(flag)
		{
			RequestDispatcher rd = req.getRequestDispatcher("userhome.jsp");
			rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("userlogin.jsp");
			rd.forward(req, resp);
		}
	}
}
