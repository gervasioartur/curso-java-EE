package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

//	modulo de conexao
	// parametros de conexao
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimeZone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "0199";

	// metod de conexao
	private Connection conect() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
