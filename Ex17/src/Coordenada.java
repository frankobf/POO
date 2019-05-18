public class Coordenada {
	private double valor;

	public Coordenada() {
		this(0);
	}

	public Coordenada(double _valor) {
		this.setCoordenada(_valor);
	}

	public void setCoordenada(double _valor) {
		this.valor = _valor;
	}

	public double getCoordenada() {
		return this.valor;
	}

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getCoordenada());
		return dados.toString();
	}
}