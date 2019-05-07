package lista2_8;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Cliente cliente;
	private List<ItemPedido> itens;
	private Pagamento pagamento;
	private boolean status;
	private double valor;

	public Pedido(Cliente cliente) {
		this.cliente = cliente;
		this.itens = new ArrayList<ItemPedido>();
		this.pagamento = null;
		this.status = false;
		this.valor = 0.00f;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public boolean isStatus() {
		return status;
	}

	public double getValor() {
		return valor;
	}
	
	public Pagamento getPagamento() {
		return this.pagamento;
	}

	public void adicionarItemPedido(Produto produto, int quantidade) {
		if (produto.getQuantidade() > quantidade) {
			ItemPedido item = new ItemPedido(produto, quantidade);
			this.itens.add(item);
			this.valor += item.getValor();
		} else {
			System.out.println("Quantidade pedida não disponível!");
		}
	}
	
	public void criarPagamento(int tipoPagamento) {
		if (tipoPagamento == 2){
			this.pagamento = new PagamentoCartao();
		} else if (tipoPagamento == 3){
			this.pagamento = new PagamentoCheque();
		} else {
			this.pagamento = new PagamentoDinheiro();
		}
	}
	
	/* Considerando 1 como PagamentoDinheiro, 2 PagamentoCartao, 3 PagamentoCheque*/
	public void fecharPedido(double quantiaRecebida) {
		mostrarItens();
		if (this.pagamento instanceof PagamentoCartao || this.pagamento instanceof PagamentoCheque){
			this.pagamento.fecharPagamento(this.valor, this.valor);
		} else {
			this.pagamento.fecharPagamento(this.valor, quantiaRecebida);
		}

	}
	
	public void mostrarItens() {
		System.out.println("Pedido do Cliente: " + this.cliente.getNome());
		for (ItemPedido item : itens) {
			System.out.println(item.getQuantidade() + " unidades de " + item.getProduto().getNome() + " - R$" + item.getValor());
		}
	}
		/*
		 * String texto = ""; for (ItemPedido itemPedido : itens) { texto +=
		 * itemPedido.getQuantidade() + " " + itemPedido.getProduto().getNome() +
		 * " - R$" + itemPedido.getValor() + "\n"; } return texto;
		 */	
}