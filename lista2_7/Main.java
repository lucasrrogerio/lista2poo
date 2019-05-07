package lista2_7;

public class Main {

	public static void main(String[] args) {

		Pessoa cliente = new Pessoa("Lucas", "1");
		Emprestimo sessao = new Emprestimo(cliente);

		Livro livro = new Livro("Origem", "Dan Brown", "123321");

		Colecao colecao = new Colecao();
		colecao.inserirLivro(livro);

		System.out.println(colecao.toString());

		String titulo = "Origem";
		boolean disponivel = false;

		if (colecao.checarLivro(titulo)) {
			System.out.println("\nEste livro esta disponivel.");
			disponivel = true;
		} else {
			System.out.println("\nLivro indisponivel.");
		}

		if (disponivel) {
			sessao.alugarLivro(colecao.buscarLivro(titulo));
			System.out.println("\nAlugando livro " + titulo);
		}

		Livro alugado = livro;
		sessao.devolverLivro(alugado);

		System.out.println("\nCliente " + cliente.toString() + ": " + cliente.getAlugados() + " livros alugado(s)");

	}

}