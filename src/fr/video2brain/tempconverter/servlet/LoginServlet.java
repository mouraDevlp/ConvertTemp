package fr.video2brain.tempconverter.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.video2brain.tempconverter.models.User;

public class LoginServlet extends HttpServlet{

/*
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("LoginServletc - service");
	}*/

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LoginServletc - doGet");
		req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("LoginServletc - doPost");
		String email=req.getParameter("email");
		String password = req.getParameter("password");
		
		System.out.println("email:  "+email +"  mot de passe: "+password);
		
		if (email.equals("messi@issmi.fr") && password.equals("123456"))
		{
			System.out.println("bonne authontification");
			req.getSession().setAttribute("User", new User(email, password));
			resp.sendRedirect("converter");
			
		}
		else {
			System.out.println("mauvaise authontification");
			resp.sendRedirect("login");
		}
	}
	
	
	
	
}
