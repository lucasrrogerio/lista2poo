package lista2_7;

public class Livro {
	private String titulo;
	private String autor;
	private String isbn;
	private int quantidade = 0;

	public Livro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}

	public String toString() {
		return ("\nTitulo: " + this.titulo + "\nAutor: " + this.autor + "\nISBN: " + this.isbn + "\n" + this.quantidade
				+ " livro(s).");
	}

	// getters
	public String getTitulo() {
		return this.titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public String getISBN() {
		return this.isbn;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	// setter
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}