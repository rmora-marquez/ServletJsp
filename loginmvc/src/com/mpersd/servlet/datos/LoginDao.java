package com.mpersd.servlet.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mpersd.servlet.modelo.ResultLogin;

public class LoginDao {

	public LoginDao() {
		// TODO Auto-generated constructor stub
	}
	
	public ResultLogin login(String username,String password){
		ResultLogin r = new ResultLogin(username, password, null, false);
		try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/spring", //URL
                    "root", //USER
                    "admin"); //PASS
            String sql = "SELECT * FROM usuarios WHERE email = ? AND password = ?";
            PreparedStatement cmd = con.prepareStatement(sql);
            cmd.setString(1, username);
            cmd.setString(2, password);
            ResultSet rs = cmd.executeQuery();            
            while(rs.next()){
            	r.setNombre(rs.getString("nombre"));
            	r.setLogin(true);
            } 
            rs.close();
            cmd.close();
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
		return r;
	}

}
