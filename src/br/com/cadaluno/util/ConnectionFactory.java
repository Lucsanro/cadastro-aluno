package br.com.cadaluno.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static Connection getConnection() throws Exception {
		try {
			// ConnectionFactory usando MySQL 5.7.26
			Class.forName("com.mysql.jdbc.Driver");
			// conexão com DB
			String login = "root";
			String senha = "";
			String url = "jdbc:mysql://localhost:3306/dbcadaluno";
			return DriverManager.getConnection(url, login, senha);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
