package com.src.controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.model.RegisterModel1;
import com.src.model.RegisterModel1;
import com.src.service.dbFactory1;
import com.src.service.dbFactory1;
import com.src.validation.Validation1;
import com.src.validation.Validation1;

/**
 * Servlet implementation class RegisterController1
 */
@WebServlet("/RegisterController1")
public class RegisterController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController1() {
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
		String cpassword=request.getParameter("cpassword");
		String age=request.getParameter("age");
		HashMap<String,String> errors=new HashMap();
		int agei=0;
		if(age!=null|age.length()<=0){
			try{
				agei=Integer.parseInt(age);
				if (agei>100)
				{
					errors.put("ageerror","age must be less than 100");
				}
				else {
					request.setAttribute("age", age);
				}
			}
		catch(NumberFormatException nfe)
		{
			errors.put("ageerror","age must be a number");
		}
		}
		else
		{
			errors.put("ageerror", "age cannot be blank");
		}
		if(username==null|username.length()<=0)
		{
			errors.put("usernameerror","username must be not be left blank");
		}
		else if(!Validation1.ischar(username)){
			request.setAttribute("username", username);
		}
		else{
			request.setAttribute("username",username);
		}
		if(password==null|password.length()<5){
			errors.put("passworderror","password too short");
		}
		else if(!password.equals(cpassword)){
			errors.put("passworderror","password and confirm password must be same");
		}
		else if(!Validation1.isValidPassword(password)){
			errors.put("passworderror","password must be 6-20");
		}
		
		if(errors.isEmpty()){
			
		
		RegisterModel1 rm=new RegisterModel1();
		rm.setUsername(username);
		rm.setPassword(password);
		rm.setAge(Integer.parseInt(age));
		try{
		int rows=dbFactory1.getInstance().insertToDb(rm);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		request.setAttribute("registerdata",rm);
		request.getRequestDispatcher("second1.jsp").forward(request,response);
		
	}
		else
		{
			request.setAttribute("error",errors);
			request.getRequestDispatcher("index1.jsp").forward(request,response);
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
