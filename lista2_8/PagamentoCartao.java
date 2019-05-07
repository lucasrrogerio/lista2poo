package lista2_8;

public class PagamentoCartao extends Pagamento {

	public PagamentoCartao() {
		super();
	}

	public void fecharPagamento(double valor, double recebido) {
		super.setRecebido(recebido);
		super.setAutorizado(true);
		super.getCaixa().adicionarPagamento(recebido);
	}

}