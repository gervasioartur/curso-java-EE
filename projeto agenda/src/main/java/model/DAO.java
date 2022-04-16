package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

	// list all
	public ArrayList<JavaBeans> getAll() {
		ArrayList<JavaBeans> contacts = new ArrayList();
		String select = "select * from contacts order by id";
		try {
			Connection conn = conect();
			PreparedStatement pst = conn.prepareStatement(select);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);
				contacts.add(new JavaBeans(id, name, phone, email));
			}
			conn.close();
			return contacts;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	// crud create
	public void store(JavaBeans contact) {
		String create = "insert into contacts (name, email,phone) values (?,?,?)";

		try {
			// abir a conexao
			Connection conn = conect();
			// prepared statement
			PreparedStatement pst = conn.prepareStatement(create);
			pst.setString(1, contact.getName());
			pst.setString(2, contact.getEmail());
			pst.setString(3, contact.getPhone());
			pst.executeUpdate();
			// fechando a conexao
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
