package exe11;

public class Pessoa {
	private String nome;
	private int identidade;
	private Data dnascimento;
	
	
	public Pessoa(String nome, int identidade, Data dnascimento) {
		
		this.nome = nome;
		this.identidade = identidade;
		this.dnascimento = dnascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdentidade() {
		return identidade;
	}
	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}
	public int getDnascimento() {
		return dnascimento;
	}
	public void setDnascimento(Data dnascimento) {
		this.dnascimento = dnascimento;
	}

	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getNome());
		dados.append(this.getIdentidade());
		dados.append(this.getDnascimento());
		return dados.toString();
		
	}
	
}
