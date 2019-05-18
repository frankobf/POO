public class Ponto {

	private double x, y;
	static final public double LIMITE_SUP = 500;
	static private double limiteSup = Ponto.LIMITE_SUP;
	static final public double LIMITE_INF = 0;
	static private double limiteInf = Ponto.LIMITE_INF;

	public Ponto(double x, double y) throws Exception {
		this.setX(x);
		this.setY(y);
	}

	public Ponto() throws Exception {
		this(0, 0);
	}

	public Ponto(String ponto) throws Exception {
		this(Double.parseDouble(ponto.substring(1, ponto.indexOf(","))),
				Double.parseDouble(ponto.substring(ponto.indexOf(",") + 1, ponto.indexOf(")"))));

	}

	public double getX() {
		return x;
	}

	public void setX(double x) throws Exception {

		if (x >= Ponto.limiteInf && x <= Ponto.limiteSup)
			this.x = x;
		else
			throw new Exception("ponto fora do limite");
	}

	public double getY() {
		return y;
	}

	public void setY(double y) throws Exception {
		if (y >= Ponto.limiteInf && y <= Ponto.limiteSup)
			this.y = y;
		else
			throw new Exception("ponto fora do limite");
	}

	public static double getLimiteSup() {
		return Ponto.limiteSup;
	}

	public static void setLimiteSup(double limiteSup) {
		Ponto.limiteSup = limiteSup;
	}

	public static double getLimiteInf() {
		return Ponto.limiteInf;
	}

	public static void setLimiteInf(double limiteInf) {
		Ponto.limiteInf = limiteInf;
	}

	public boolean equals(Ponto ponto) {
		if (this.getX() == ponto.getX() && this.getY() == ponto.getY())
			return true;

		else
			return false;
	}

	public Ponto clonar() throws Exception {
		Ponto ponto = new Ponto(this.getX(), this.getY());
		return ponto;
	}

	public Ponto criaSwap() throws Exception {
		Ponto ponto = new Ponto(this.getY(), this.getX());
		return ponto;
	}

	public boolean temEixoComum(Ponto ponto) {
		if (this.getX() == ponto.getX() || this.getY() == ponto.getY())
			return true;
		return false;
	}

	public double distancia(Ponto ponto) throws Exception {
		return distancia(this.getX(), this.getY(), ponto.getX(), ponto.getY());
	}

	public double distancia(double x, double y) throws Exception {
		return distancia(this.getX(), this.getY(), x, y);
	}

	public static double distancia(Ponto ponto1, Ponto ponto2) throws Exception {
		return distancia(ponto1.getX(), ponto1.getY(), ponto2.getX(), ponto2.getY());
	}

	public static double distancia(double x1, double y1, double x2, double y2) throws Exception {
		double dist;
		if (x1 >= Ponto.limiteInf && x1 <= Ponto.limiteSup && y1 >= Ponto.limiteInf && y1 <= Ponto.limiteSup
				&& x2 >= Ponto.limiteInf && x2 <= Ponto.limiteSup && y2 >= Ponto.limiteInf && y2 <= Ponto.limiteSup) {
			dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
			return dist;
		} else
			throw new Exception("O valor da coordenada do ponto passado está fora do limite determinado");
	}

	public double distanciaDaOrigem() throws Exception {
		return distancia(this.getX(), this.getY(), 0, 0);
	}

	public int compareTo(Ponto _ponto) throws Exception {
		if (this.distanciaDaOrigem() > _ponto.distanciaDaOrigem())
			return 1;
		else if (this.distanciaDaOrigem() == _ponto.distanciaDaOrigem())
			return 0;
		else
			return -1;
	}
}
