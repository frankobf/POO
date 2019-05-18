package ex11;

public class Diretor extends Chefe {

	private int datadaPromocao;

	public Diretor(String nome, int identidade, Data dnascimento, Data datadeAdmissao, int salario, String departamento,
			int datadaPromocao) {
		super(nome, identidade, dnascimento, datadeAdmissao, salario, departamento);
		this.datadaPromocao = datadaPromocao;
	}

	public int getDatadaPromocao() {
		return datadaPromocao;
	}

	public void setDatadaPromocao(int datadaPromocao) {
		this.datadaPromocao = datadaPromocao;
	}

}
