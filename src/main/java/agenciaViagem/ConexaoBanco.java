package agenciaViagem;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {
	
	private static final String username = "root";
	private static final String password = "";
	private static final String database_url = "jdbc:mysql://localhost:3306/agenciaviagem";
	
	public static Connection createConnectionToMySQL() throws Exception {
		Connection conn = DriverManager.getConnection(database_url, username, password);
		return conn;
	}
	
	public static void main(String[] args) throws Exception {
		Connection conn = createConnectionToMySQL();
		
		if (conn != null) {
			System.out.println("Conexão bem sucedida!");
		}
		conn.close();
	}
}
