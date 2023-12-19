
package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.catalina.connector.Response;

import com.user.dao.UserDao;

public class MyServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		
		// backend code
		System.out.println("Hi Raj your servlet page is run ");
		
		String uname= req.getParameter("uname");
		String uid= req.getParameter("user_id");
		String upass= req.getParameter("upass");
		String city = req.getParameter("ucity");
		String umobi= req.getParameter("umob");
		
		System.out.println("User name     = "+uname);
		System.out.println("User mail id     = "+uid);
		System.out.println("User password     = "+upass);
		System.out.println("User city name     = "+city);
		System.out.println("User mobile number     = "+umobi);
		boolean flag= UserDao.userRegistration(uname, uid, upass, city, umobi);
		if(flag)
		{
			RequestDispatcher rd = req.getRequestDispatcher("userlogin.jsp");
			rd.forward(req, resp);
			
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("userpage.jsp");
			rd.forward(req, resp);
		}
	}
	
}
