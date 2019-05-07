package lista2_8;

abstract public class Pagamento {

	private Caixa caixa;
	private double recebido;
	private double valor;
	private boolean autorizado;
	
	public Pagamento() {
		this.caixa = null;
		this.recebido = 0f;
		this.autorizado = false;
		this.valor = 0f;
	}

	public double getRecebido() {
		return recebido;
	}
		
	public double getValor() {
		return valor;
	}

	public Caixa getCaixa() {
		return caixa;
	}

	public void setRecebido(double recebido) {
		this.recebido = recebido;
	}

	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	
	public boolean isAutorizado() {
		return autorizado;
	}

	abstract public void fecharPagamento(double valor, double recebido);
	
}