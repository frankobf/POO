package prova;
import tempo.*;
public abstract class ItemdeAgenda {

	private String titulo, descricao;
	private Periodo duracao;

	public ItemdeAgenda(String titulo, String descricao, Periodo duracao) {
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.setDuracao(duracao);

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Periodo getDuracao() {
		return duracao;
	}

	public void setDuracao(Periodo duracao) {
		this.duracao = duracao;
	}

	public String toString() {
		StringBuilder item = new StringBuilder();
		item.append("Titulo: " + this.getTitulo());
		item.append("Descric@o: " + this.getDescricao());
		item.append("Durac@o: " + this.getDuracao());
		return item.toString();
	}

}
