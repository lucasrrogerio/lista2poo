package lista2_8;

public class PagamentoDinheiro extends Pagamento {

	public PagamentoDinheiro() {
		super();
	}

	public void fecharPagamento(double valor, double recebido) {
		super.setRecebido(valor);
		super.setAutorizado(true);
		super.getCaixa().adicionarPagamento(valor);
		getTroco(valor, recebido);
	}
	
	
	public void getTroco(double valor, double recebido) {
		double troco = recebido-valor;
		System.out.println("Recebido: R$"+recebido);
		System.out.println("Troco: R$" + troco);
	}

	
}