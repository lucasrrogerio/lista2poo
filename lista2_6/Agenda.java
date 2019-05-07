package lista2_6;

import java.util.*;

public class Agenda {

	private List<Contato> contatos;

	public Agenda() {
		this.contatos = new ArrayList<Contato>();
	}

	public void adicionarContato(String nome, String telefone) {
		Contato contato = new Contato(nome, telefone);
		this.contatos.add(contato);
	}

	public void verAgenda() {
		for (Contato contato : contatos) {
			System.out.println(contato.toString());
		}
		
	}
	
}