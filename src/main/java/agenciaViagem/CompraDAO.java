package agenciaViagem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import agenciaViagem.ConexaoBanco;
import agenciaViagem.model.Compra;

public class CompraDAO {
	
	public static Compra[] getCompra;
	
	public void comprar(Compra compra) {
		String sql = "INSERT INTO compra (NOME, SOBRENOME, PARTIDA, DESTINO, DIA_IDA, DIA_VOLTA, PASSAGENS, ASSENTO)"
				+ " values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConexaoBanco.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, compra.getNome());
			pstm.setString(2, compra.getSobrenome());
			pstm.setString(3, compra.getPartida());
			pstm.setString(4, compra.getDestino());
			pstm.setDate(5, new Date(compra.getDia_ida().getTime()));
			pstm.setDate(6, new Date(compra.getDia_volta().getTime()));
			pstm.setInt(7, compra.getPassagens());
			pstm.setInt(8, compra.getAssento());
			
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
	
	public void deletar(int id) {
		
		String sql = "DELETE FROM compra WHERE ID_COMPRA = ?";
		
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
	
	public void atualizar(Compra compra) {
		String sql = "UPDATE compra SET NOME = ?, SOBRENOME = ?, PARTIDA = ?, DESTINO = ?, DIA_IDA = ?, DIA_VOLTA = ?, PASSAGENS =?, "
				+ "ASSENTO = ? WHERE ID_COMPRA = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConexaoBanco.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, compra.getNome());
			pstm.setString(2, compra.getSobrenome());
			pstm.setString(3, compra.getPartida());
			pstm.setString(4, compra.getDestino());
			pstm.setDate(5, new Date(compra.getDia_ida().getTime()));
			pstm.setDate(6, new Date(compra.getDia_volta().getTime()));
			pstm.setInt(7, compra.getPassagens());
			pstm.setInt(8, compra.getAssento());
			pstm.setInt(9, compra.getId_compra());
			
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
	
	public static List<Compra> getCompra() {
		
		String sql = "SELECT * FROM compra";
		
		List<Compra> compra = new ArrayList<Compra>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			conn = ConexaoBanco.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				
				Compra compras = new Compra();
				
				compras.setNome(rset.getString("NOME"));
				compras.setSobrenome(rset.getString("SOBRENOME"));
				compras.setPartida(rset.getString("PARTIDA"));
				compras.setDestino(rset.getString("DESTINO"));
				compras.setDia_ida(rset.getDate("DIA_IDA"));
				compras.setDia_volta(rset.getDate("DIA_VOLTA"));
				compras.setPassagens(rset.getInt("PASSAGENS"));
				compras.setAssento(rset.getInt("ASSENTO"));
				
				compra.add(compras);
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
			return compra;
		}
	}
}
