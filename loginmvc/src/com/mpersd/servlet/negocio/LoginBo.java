package com.mpersd.servlet.negocio;

import com.mpersd.servlet.datos.LoginDao;
import com.mpersd.servlet.modelo.ResultLogin;

public class LoginBo {
	
	private LoginDao ldao = new LoginDao();
	
	public LoginBo() {
		// TODO Auto-generated constructor stub
	}

	public ResultLogin check(String username,String password){
		ResultLogin r = new ResultLogin(username, password, null, false);
		if(username.equals("admin") && "nimda".equals(password)){
			r.setNombre("Administrador");
			r.setLogin(true);
		}
		return r;
	}
	
	public ResultLogin login(String username,String password){
		return ldao.login(username, password);
	}
}
