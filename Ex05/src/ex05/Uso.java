package ex05;

public class Uso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aluno x = new Aluno();
				// x.setNome("Natália");
				// Aluno.setLimite(10);
				// x.setNotas(15.0, 10.0, 20.0);
				// System.out.println(Aluno.verificaNota(x.getNota1()));
				// System.out.println(x.toString());
				//

				try {
					AlunoErro x = new AlunoErro();
					x.setNome("Natália");
					AlunoErro.setLimite(15);
					x.setNotas(16.0, 10.0, 10.0);
					System.out.println(AlunoErro.verificaNota(x.getNota1()));
					System.out.println(x.toString());
				} catch (Exception e) {
					System.out.println(e);
				}
			

	}

}
