package com.src.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.model.LoginModel;
import com.src.model.LoginModel;
import com.src.service.dbFactory1;
import com.src.service.dbFactory1;

/**
 * Servlet implementation class LoginController1
 */
@WebServlet("/LoginController1")
public class LoginController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		LoginModel ln=new LoginModel();
		System.out.println("login cintroller");
		ln.setUsername(username);
		ln.setPassword(password);
		try{
			boolean valid=dbFactory1.getInstance().CheckLogin(ln);
		
		if(valid){
			System.out.println("going to books");
			request.getRequestDispatcher("").forward(request,response);
			
		}
		else
		{
			request.setAttribute("message","invalid username or password");
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
