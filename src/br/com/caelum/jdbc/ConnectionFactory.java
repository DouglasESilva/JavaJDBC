package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	//Criando conexão
	
	public Connection getConnectio() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/fj21","root","Ke4ojsor4");
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
