package lista2_7;

public class Emprestimo {

	private Pessoa cliente;

	public Emprestimo(Pessoa cliente) {
		this.cliente = cliente;
	}

	private boolean checarDisponibilidade(Livro livro) {
		if (livro.getQuantidade() > 0) {
			return true;
		}
		return false;
	}

	public void alugarLivro(Livro livro) {
		if (checarDisponibilidade(livro)) {
			livro.setQuantidade(livro.getQuantidade() - 1);
			this.cliente.setAlugados(this.cliente.getAlugados() + 1);
		}
	}

	public void devolverLivro(Livro livro) {
		livro.setQuantidade(livro.getQuantidade() + 1);
		this.cliente.setAlugados(this.cliente.getAlugados() - 1);
	}

}