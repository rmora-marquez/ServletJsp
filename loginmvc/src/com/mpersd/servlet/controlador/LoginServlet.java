package com.mpersd.servlet.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mpersd.servlet.modelo.ResultLogin;
import com.mpersd.servlet.negocio.LoginBo;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LoginBo lbo = new LoginBo();
	
    public LoginServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("usuario") == null){
			request.getRequestDispatcher("/WEB-INF/vistas/loginform.jsp")
				.forward(request, response);
			return;
		}else{
			request.getRequestDispatcher("/WEB-INF/vistas/bienvenido.jsp")
				.forward(request, response);
		return;
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		ResultLogin result = lbo.login(username, password); //.check(username, password);
		if(result.getLogin()){
			HttpSession session = request.getSession();
			session.setAttribute("usuario", result);
			request.getRequestDispatcher("/WEB-INF/vistas/bienvenido.jsp")
				.forward(request, response);
			return;
		}else{
			response.sendRedirect("login?error");
		}
	}

}
