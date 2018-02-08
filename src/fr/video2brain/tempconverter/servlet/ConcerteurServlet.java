package fr.video2brain.tempconverter.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConcerteurServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.getRequestDispatcher("/WEB-INF/converter.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String celcius = req.getParameter("celcius");
		float FloatCelcius = Float.parseFloat(celcius);
		
		float result = (FloatCelcius*9/5)+32;
		System.out.println(FloatCelcius);
		
		//renvoi de result 
		req.setAttribute("result", result);
		req.getRequestDispatcher("/WEB-INF/converter.jsp").forward(req, resp);
		
		
	}
}
