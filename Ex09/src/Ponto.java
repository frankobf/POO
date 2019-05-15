
public class Ponto {
	
	private double x,y;
	static final public int LIMITE_SUP =500;
	static private int limiteSup = Ponto.LIMITE_SUP;
	static final public int LIMITE_INF =0;
	static private int limiteInf = Ponto.LIMITE_INF;
	
	

	public Ponto(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	public Ponto() {
		this(0,0);
	}
	public Ponto(String ponto) {
		this(Double.parseDouble(ponto.substring(1,ponto.indexOf(","))),Double.parseDouble(ponto.substring(ponto.indexOf(",")+1,ponto.indexOf(")") )));
	
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	public static int getLimiteSup() {
		return limiteSup;
	}
	public static void setLimiteSup(int limiteSup) {
		Ponto.limiteSup = limiteSup;
	}
	public static int getLimiteInf() {
		return limiteInf;
	}
	public static void setLimiteInf(int limiteInf) {
		Ponto.limiteInf = limiteInf;
	}
	
	
}
