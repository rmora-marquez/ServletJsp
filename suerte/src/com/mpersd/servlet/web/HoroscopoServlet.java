package com.mpersd.servlet.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/horoscopo") //URL para ejecutar el programa
public class HoroscopoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HoroscopoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int numero = (int) (Math.random() * 100);
		String signo = request.getParameter("signo");
		
		out.println("<!DOCTYPE html>");
		out.println("<h1>Bienvenido " + signo + " al horoscopo del dia</h1>");
		out.println("<h2>Tu número del suerte para hoy es:" + numero + " </h2>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
