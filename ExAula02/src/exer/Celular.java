package exer;

public class Celular {
	public String modelo;
	public String cor;
	public float tamanho;
	int bateria;
	boolean ligado;
	
	void status() {
		System.out.println("modelo: "+ this.modelo);
		System.out.println("cor: "+ this.cor);
		System.out.println("tamanho: "+this.tamanho);
		System.out.println("bateria: "+this.bateria);
		System.out.println("ligado: "+this.ligado);
	}
	
	void ligar() {
		if(this.bateria == 5) {
			this.ligado = true;
		}
		}
	void ligacao() {
		if(this.ligado == true) {
			System.out.println("fazendo ligação...");
	}
			
	}
}
