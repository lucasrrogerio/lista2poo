package lista2_8;

public class ItemPedido {

	private Produto produto;
	private int quantidade;
	private double valor;

	public ItemPedido(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		setValor();
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void setValor() {
		this.valor = this.produto.getPreco()*this.quantidade;
	}
	
}
