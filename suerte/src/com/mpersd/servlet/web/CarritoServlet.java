package com.mpersd.servlet.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mpersd.servlet.modelo.ArticuloTo;
import com.mpersd.servlet.modelo.CarritoTo;

@WebServlet("/carrito")
public class CarritoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CarritoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		double precio = new Double( request.getParameter("precio") );
		int cantidad =  Integer.parseInt( request.getParameter("cantidad") ); 
		double total = precio * cantidad;
		
		ArticuloTo art = new ArticuloTo(nombre, precio, cantidad, total);
		HttpSession session = request.getSession();
		if(session.getAttribute("carrito") == null){
			CarritoTo car = new CarritoTo();
			session.setAttribute("carrito", car);
		}
		CarritoTo car = (CarritoTo) session.getAttribute("carrito");
		car.getListaDeArticulos().add(art);
		car.setTotal( car.getTotal() + art.getTotal() );
		//Mostrar el carrito
		out.println("<!DOCTYPE html>");
		out.println("<h1>Carrito de compras</h1>");
		out.println("<table>");
			out.println("<tr><th>Nombre</th> <th>Precio</th> ");
				out.println("<th>Cantidad</th> <th>Total</th>");
			out.println("</tr>");
			for(ArticuloTo a : car.getListaDeArticulos()){
				out.println("<tr>");
					out.println("<td>"+ a.getNombre()  +"</td>");
					out.println("<td>"+ a.getPrecio()  +"</td>");
					out.println("<td>"+ a.getCantidad()  +"</td>");
					out.println("<td>"+ a.getTotal()  +"</td>");
				out.println("</tr>");				
			}
			out.println("<tr>");
				out.println("<td colspan='3'>Total del carrito:</td>");
				out.println("<td>" + car.getTotal() + "</td>");
			out.println("</tr>");
			
		out.println("</table>");
	}

}
