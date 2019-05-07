package lista2_7;

import java.util.List;
import java.util.ArrayList;

public class Colecao {

	private List<Livro> colecao;

	public Colecao() {
		this.colecao = new ArrayList<Livro>();
	}

	public String toString() {
		String livros = "";
		for (Livro livro : colecao) {
			livros = livros + livro.toString() + "\n";
		}
		return livros;
	}

	public void inserirLivro(Livro novo) {
		this.colecao.add(novo);
	}

	public boolean checarLivro(String titulo) {
		for (Livro livro : this.colecao) {
			if (livro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	public Livro buscarLivro(String titulo) {
		for (Livro livro : this.colecao) {
			if (livro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
				return livro;
			}
		}
		return null;
	}
}