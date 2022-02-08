package agenciaViagem;

import agenciaViagem.model.Compra;
import agenciaViagem.CompraDAO;
import agenciaViagem.ClienteDB;
import agenciaViagem.model.Cliente;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		
		/* ClienteDB cliente = new ClienteDB();
		
		Cliente contato = new Cliente();
		
		contato.setNome("Nome");
		contato.setSobrenome("Sobrenome");
		contato.setData_nasc(new Date(10-10-1987));
		contato.setEndereco("Avenida Imginária");
		contato.setTelefone("999999999");
		contato.setCidade("São Paulo");
		contato.setEmail("exemplo@exemplo.com");
		
		cliente.adicionar(contato);
		
		Cliente contato1 = new Cliente();
		
		contato1.setNome("Luiz");
		contato1.setSobrenome("Inácio");
		contato1.setData_nasc(new Date(05-11-1945));
		contato1.setEndereco("Rua do Amor");
		contato1.setTelefone("889897890");
		contato1.setCidade("Brasília");
		contato1.setEmail("exemplo@exemplo.com");
		
		cliente.adicionar(contato1);
		
		Cliente contato1 = new Cliente();
		
		contato1.setId_cliente(5);
		contato1.setNome("Antônio");
		contato1.setSobrenome("Conselheiro");
		contato1.setData_nasc(new Date(10-10-1987));
		contato1.setEndereco("Avenida Imginária");
		contato1.setTelefone("888888888");
		contato1.setCidade("Recife");
		contato1.setEmail("exemplo@exemplo.com");
		
		cliente.atualizar(contato1);
		
	
			for (Cliente c : ClienteDB.getCliente()) {
				System.out.println("Nome: " + c.getNome());
				System.out.println("Sobrenome: " + c.getSobrenome());
				System.out.println("Data de nascimento: " + c.getData_nasc());
				System.out.println("Endereço: " + c.getEndereco());
				System.out.println("Telefone: " + c.getTelefone());
				System.out.println("Cidade: " + c.getCidade());
				System.out.println("E-mail: " + c.getEmail());
				System.out.println("===========================");
			} */ 
		
		CompraDAO compra = new CompraDAO();
		
		/*Compra compra1 = new Compra();
		compra1.setNome("");
		compra1.setSobrenome("Tevez");
		compra1.setPartida("Santiago do Chile");
		compra1.setDestino("São Paulo");
		compra1.setDia_ida(new Date(12-04-2023));
		compra1.setDia_volta(new Date(14-05-2023));
		compra1.setPassagens(2);
		compra1.setAssento(44);
		
		compra.comprar(compra1);*/
		
		/*Compra compra3 = new Compra();
		
		compra3.setId_compra(1);
		compra3.setNome("Carlitos");
		compra3.setSobrenome("Tevez");
		compra3.setPartida("Santiago do Chile");
		compra3.setDestino("Milão");
		compra3.setDia_ida(new Date(12-04-2023));
		compra3.setDia_volta(new Date(14-05-2023));
		compra3.setPassagens(2);
		compra3.setAssento(44);
		
		compra.atualizar(compra3);
		
		compra.deletar(2); */
		
		for (Compra c : CompraDAO.getCompra()) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Sobrenome: " + c.getSobrenome());
			System.out.println("Partida: " + c.getPartida());
			System.out.println("Destino: " + c.getDestino());
			System.out.println("Ida: " + c.getDia_ida());
			System.out.println("Volta: " + c.getDia_volta());
			System.out.println("Quantidade de passagens: " + c.getPassagens());
			System.out.println("Número do assento: " + c.getAssento());
			System.out.println("=============================");
		}
		}
		
	}

