package aula02;

public class Uso {

	public static void main(String[] args) {
	Caneta c1 = new Caneta();
	
	c1.cor = "Azul";
	c1.carga = 30;
	c1.ponta = 0.5f;
	c1.tampar();
	c1.status();
	c1.rabiscar();
	
	Caneta c2 =new Caneta();
	c2.cor = "Vermelha";
	c2.carga = 30;
	c2.ponta = 0.5f;
	c2.destampar();
	c2.status();
	c2.rabiscar();
	
	}
	
}
