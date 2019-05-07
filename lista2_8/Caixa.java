package lista2_8;

public class Caixa {

	private double saldo;

	public Caixa(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void adicionarPagamento(double saldo) {
		this.saldo += saldo;
	}
	
}