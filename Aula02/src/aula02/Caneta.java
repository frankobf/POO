package aula02;

public class Caneta {
	public String cor;
	String modelo;
	float ponta;
	int carga;
	boolean tampada;
	
	public void status() {
		System.out.println("cor: "+this.cor);
		System.out.println("ponta: "+this.ponta);
		System.out.println("carga: "+this.carga);
		System.out.println("Est� tampada? "+this.tampada);
	}
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar!");
		}else{
				System.out.println("Estou rabiscando!");
			}
		
	}
	void tampar() {
		this.tampada = true;
		
	}
	void destampar() {
		this.tampada = false;
	}
}
