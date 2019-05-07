package lista2_8;

public class PagamentoCheque extends Pagamento {

	public PagamentoCheque() {
		super();
	}

	public void fecharPagamento(double valor, double recebido) {
		super.setRecebido(valor);
		super.setAutorizado(true);
		super.getCaixa().adicionarPagamento(valor);
	}
	
}