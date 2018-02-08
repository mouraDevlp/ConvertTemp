package fr.video2brain.tempconverter.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ClickCounterFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("ClickCounterFilter - doFilter");
		
		ServletContext sc =req.getServletContext();
		int counter =(int) sc.getAttribute("counter");
		counter++;
		sc.setAttribute("counter", counter);
		System.out.println("counter"+sc.getAttribute("counter"));
		chain.doFilter(req, resp);
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		int counter = 0;
		ServletContext sc = filterConfig.getServletContext();
		sc.setAttribute("counter", counter);
		
	}


	

}
