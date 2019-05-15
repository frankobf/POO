
public class ContaBancaria {
	private String correntista;
	private double saldo;
	static final public double TAXADEJUROS = 5.0;
	
	public ContaBancaria(String correntista, double saldo) {
		this.correntista = correntista;
		this.saldo = saldo;
	}
	
	public String getCorrentista() {
		return correntista;
	}
	
	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
