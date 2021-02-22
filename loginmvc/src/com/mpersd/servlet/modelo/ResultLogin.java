package com.mpersd.servlet.modelo;

public class ResultLogin {
	private String username;
	private String password;
	private String nombre;
	private Boolean login = false; 
	
	public ResultLogin() {	
	}

	public ResultLogin(String username, String password, String nombre, Boolean login) {
		super();
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.login = login;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getLogin() {
		return login;
	}

	public void setLogin(Boolean login) {
		this.login = login;
	}
	

}
