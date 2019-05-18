package ex18;

public class Livro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private int edicao;

	public String getTitulo() {
		return this.titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}

	public int getEdicao() {
		return this.edicao;
	}

	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}

	public void setAutor(String _autor) {
		this.autor = _autor;
	}

	public void setNumeropaginas(int _numeroPaginas) {
		this.numeroPaginas = _numeroPaginas;
	}

	public void setEdicao(int _edicao) {
		this.edicao = _edicao;
	}

	public String toString() {
		StringBuilder inf = new StringBuilder();
		inf.append("[");
		inf.append(this.getTitulo());
		inf.append("/");
		inf.append(this.getAutor());
		inf.append("/");
		inf.append(this.getNumeroPaginas());
		inf.append("]");
		return inf.toString();
	}

}
