package exer;

public class Uso {

	public static void main(String[] args) {
		Celular c1 = new Celular();
		
		c1.modelo = "Iphone";
		c1.cor = "Branco";
		c1.tamanho = 0.45f;
		c1.bateria = 5;
		
		c1.status();
		c1.ligar();
		c1.ligacao();

	}

}
