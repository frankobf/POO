package ex18;

public abstract class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

	private int statusEmprestimo;
	private String localizacao;
	private String descricao;

	public int getStatusEmprestimo() {
		return this.statusEmprestimo;
	}

	public String getLocalizacao() {
		return this.localizacao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setStatusEmprestimo(int _statusEmprestimo) {
		this.statusEmprestimo = _statusEmprestimo;
	}

	public void setLocalizacao(String _localizacao) {
		this.localizacao = _localizacao;
	}

	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}

	public String toString() {

		StringBuilder inf = new StringBuilder();
		inf.append(super.toString());
		inf.append("[");
		inf.append(this.getStatusEmprestimo());
		inf.append("/");
		inf.append(this.getLocalizacao());
		inf.append("/");
		inf.append(this.getDescricao());
		inf.append("]");
		return inf.toString();

	}

}
