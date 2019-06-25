package prova;
import tempo.*;
public class Lembrete extends ItemdeAgenda {

	private boolean alerta;

	public Lembrete(String titulo, String descricao, Periodo duracao, boolean alerta) {
		super(titulo, descricao, duracao);
		this.setAlerta(alerta);
	}
	

	public boolean isAlerta() {
		return alerta;
	}

	public void setAlerta(boolean alerta) {
		this.alerta = alerta;
	}

	public String toString() {

		StringBuilder alerta = new StringBuilder();

		alerta.append(super.toString());
		alerta.append("Aviso: \n" + this.isAlerta());

		return alerta.toString();
	}

}
