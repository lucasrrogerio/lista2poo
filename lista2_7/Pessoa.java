package lista2_7;

public class Pessoa {
	private String nome;
	private String id;
	private int alugados;

	public Pessoa(String nome, String id) {
		this.nome = nome;
		this.id = id;
		this.alugados = 0;
	}

	public String toString() {
		return (this.nome + " - " + this.id);
	}

	public int getAlugados() {
		return this.alugados;
	}

	public void setAlugados(int numero) {
		this.alugados += numero;
	}

}