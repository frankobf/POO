package prova;
import tempo.*;
public class Meta extends ItemdeAgenda {

	private String prioridade;

	public Meta(String titulo, String descricao, Periodo duracao, String prioridade) {
		super(titulo, descricao, duracao);
		this.setPrioridade(prioridade);

	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public String toString() {
		StringBuilder meta = new StringBuilder();
		meta.append(super.toString());
		meta.append("Prioridade: " + this.getPrioridade());
		return meta.toString();
	}

}
