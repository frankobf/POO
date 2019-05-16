
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
		if(this.getX() == ponto.getX() && this.getY() == ponto.getY())
			return true;
		
		else
			return false;
	}
}
