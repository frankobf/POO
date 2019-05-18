
public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormaGeometrica x = new Retangulo();
		((Retangulo) x).setComprimento(5);
		((Retangulo) x).setLargura(5);
		System.out.println(x.area());

	}

}
