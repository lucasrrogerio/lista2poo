package lista2_5;

import java.util.*;

public class Pessoa {

	private String nome;
	private Universidade universidade;
	private Departamento departamento;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}

	public String getNomeUniversidade() {
		if (this.universidade != null)
			return this.nome + " - " + this.universidade.getNome();
		else
			return this.nome;
	}

	public Departamento getDepartamento() {
		return this.departamento;
	}
	
	/* PARTE 2 
	public void setDepartamento(String nome) {
		List<Departamento> departamento = this.universidade.getDepartamento();
		for (Departamento d : departamento)
			if (nome.equals(d.getNome()))
				this.departamento = d;
		if (this.departamento == null)
			System.out.println("Departamento não encontrado.");
	}
*/
	/*PARTE 3 
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
*/
}