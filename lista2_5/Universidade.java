package lista2_5;

import java.util.*;

//comentar as partes que nao for usar

public class Universidade {

	private String nome;
	private List<Departamento> departamento;

	public String getNome() {
		return this.nome;
	}

	public List<Departamento> getDepartamento() {
		return this.departamento;
	}
	
	/* PARTE 1 */
	public Universidade(String nome) {
		this.nome = nome;
	}

	/* PARTE 2 
	public Universidade(String nome) {
		this.nome = nome;
		departamento = new ArrayList<Departamento>();
		adicionarDepartamento("RH");
		adicionarDepartamento("DevOps");
	}

	public void adicionarDepartamento(String nome) {
		Departamento dp = new Departamento(nome);
		this.departamento.add(dp);
	}
*/
	/* PARTE 3 
	public Universidade(String nome) {
		this.nome = nome;
		departamento = new ArrayList<Departamento>();
	}

	public void adicionarDepartamento(Departamento departamento) {
		this.departamento.add(departamento);
	}
*/
}