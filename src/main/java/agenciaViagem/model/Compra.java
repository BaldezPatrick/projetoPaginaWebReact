package agenciaViagem.model;

import java.util.Date;

public class Compra {
	private int id_compra;
	private String nome;
	private String sobrenome;
	private String partida;
	private String destino;
	private Date dia_ida;
	private Date dia_volta;
	private int passagens;
	private int assento;
	
	public int getId_compra() {
		return id_compra;
	}
	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public Date getDia_ida() {
		return dia_ida;
	}
	public void setDia_ida(Date dia_ida) {
		this.dia_ida = dia_ida;
	}
	
	public Date getDia_volta() {
		return dia_volta;
	}
	public void setDia_volta(Date dia_volta) {
		this.dia_volta = dia_volta;
	}
	
	public int getPassagens() {
		return passagens;
	}
	public void setPassagens(int passagens) {
		this.passagens = passagens;
	}
	
	public int getAssento() {
		return assento;
	}
	public void setAssento(int assento) {
		this.assento = assento;
	}
	
	
}
