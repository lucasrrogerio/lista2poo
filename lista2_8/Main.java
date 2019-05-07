package lista2_8;

public class Main {

	public static void main(String[] args) {

		Caixa caixa = new Caixa(100.00f);
		Cliente cliente = new Cliente("Lucas", "12345678910");
		Produto produto = new Produto("Arroz", 2.40f, 20);
		Pedido pedido = new Pedido(cliente);
		pedido.adicionarItemPedido(produto, 10);
		pedido.criarPagamento(1);
		pedido.getPagamento().setCaixa(caixa);
		pedido.fecharPedido(50.00f);
		System.out.println();
		System.out.println("Saldo em caixa: " + caixa.getSaldo());
	}

}
