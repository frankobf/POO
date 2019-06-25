package prova;
import tempo.*;
public class Evento extends ItemdeAgenda {

	private String localizacao;

	public Evento(String titulo, String descricao, Periodo duracao, String localizacao) {
		super(titulo, descricao, duracao);
		this.setLocalizacao(localizacao);

	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String toString() {

		StringBuilder evento = new StringBuilder();

		evento.append(super.toString());
		evento.append("Local:" + this.getLocalizacao());

		return evento.toString();
	}

}
