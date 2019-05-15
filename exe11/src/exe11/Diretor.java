package exe11;

public class Diretor extends Chefe {

	private int datadaPromocao;
	
	public Diretor(String nome, int identidade, int dnascimento, int datadeAdmissao, int salario, String departamento) {
		super(nome, identidade, dnascimento, datadeAdmissao, salario, departamento);
		
	}

	public int getDatadaPromocao() {
		return datadaPromocao;
	}

	public void setDatadaPromocao(int datadaPromocao) {
		this.datadaPromocao = datadaPromocao;
	}
	

}
