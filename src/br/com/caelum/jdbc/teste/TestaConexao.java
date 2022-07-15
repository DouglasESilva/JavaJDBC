package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {
	
	//Testando Conexão com o banco de dados

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnectio(); 
		System.out.println("Conexão Aberta!");
		con.close();
	}

}
