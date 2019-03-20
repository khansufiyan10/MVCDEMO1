package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		model.Logincredential loginObj=new model.Logincredential();
		loginObj.setUsername(username);
		loginObj.setPassword(password);
		
		
		if(loginObj.checklogin())
		{
			request.setAttribute("username",username);
			RequestDispatcher dispatch=request.getRequestDispatcher("Welcome.jsp");
			dispatch.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("Failure.jsp");
			dispatch.forward(request, response);
		}
		
	}

}
