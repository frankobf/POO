package ex11;

public class Funcionario extends Pessoa {
	private Data datadeAdmissao;
	private int salario;

	public Funcionario(String nome, int identidade, Data dnascimento, Data datadeAdmissao, int salario) {
		super(nome, identidade, dnascimento);
		this.datadeAdmissao = datadeAdmissao;
		this.salario = salario;
	}

	public Data getDatadeAdmissao() {
		return datadeAdmissao;
	}

	public void setDatadeAdmissao(Data datadeAdmissao) {
		this.datadeAdmissao = datadeAdmissao;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(this.getDatadeAdmissao());
		dados.append(this.getSalario());
		return dados.toString();
	}

}
