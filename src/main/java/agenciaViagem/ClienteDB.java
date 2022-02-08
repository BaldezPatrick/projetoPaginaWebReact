package agenciaViagem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import agenciaViagem.ConexaoBanco;
import agenciaViagem.model.Cliente;

public class ClienteDB {
	
	public static Cliente[] getCliente;

	public void adicionar(Cliente cliente) {
		String sql = "INSERT INTO cliente (NOME, SOBRENOME, DATA_NASC, ENDERECO, TELEFONE, CIDADE, EMAIL) values (?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConexaoBanco.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getSobrenome());
			pstm.setDate(3, new Date(cliente.getData_nasc().getTime()));
			pstm.setString(4, cliente.getEndereco());
			pstm.setString(5, cliente.getTelefone());
			pstm.setString(6, cliente.getCidade());
			pstm.setString(7, cliente.getEmail());
			
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deletar (int id) {
		String sql = "DELETE FROM cliente WHERE ID_CLIENTE = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConexaoBanco.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			pstm.execute();
			
			pstm.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void atualizar (Cliente cliente) {
		String sql = "UPDATE cliente SET NOME = ?, SOBRENOME = ?, DATA_NASC = ?, ENDERECO = ?, TELEFONE = ?, CIDADE = ?, EMAIL = ?"
				+ "WHERE ID_CLIENTE = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConexaoBanco.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getSobrenome());
			pstm.setDate(3, new Date(cliente.getData_nasc().getTime()));
			pstm.setString(4, cliente.getEndereco());
			pstm.setString(5, cliente.getTelefone());
			pstm.setString(6, cliente.getCidade());
			pstm.setString(7, cliente.getEmail());
			pstm.setInt(8, cliente.getId_cliente());
			
			pstm.execute();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public static List<Cliente> getCliente() {
		String sql = "SELECT * FROM cliente";
		
		List<Cliente> cliente = new ArrayList<Cliente>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			conn = ConexaoBanco.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				
				Cliente cliente1 = new Cliente();
				
				cliente1.setNome(rset.getString("NOME"));
				cliente1.setSobrenome(rset.getString("SOBRENOME"));
				cliente1.setData_nasc(rset.getDate("DATA_NASC"));
				cliente1.setEndereco(rset.getString("ENDERECO"));
				cliente1.setTelefone(rset.getString("TELEFONE"));
				cliente1.setCidade(rset.getString("CIDADE"));
				cliente1.setEmail(rset.getString("EMAIL"));
				
				cliente.add(cliente1);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				
				if (conn != null) {
					conn.close();
				}
				if (rset != null) {
					rset.close();
				}
			} catch (final Exception e) {
				
				e.printStackTrace();
			}
			return cliente;
		}
	}
}
