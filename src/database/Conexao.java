package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection createConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/academia"; //Nome da base de dados
		String user = "db_adm_academia"; //nome do usuário do MySQL
		String password = "1234"; //senha do MySQL

		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);

		return conexao;
	}
	
}
