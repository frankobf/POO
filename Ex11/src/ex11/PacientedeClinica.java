package ex11;

public class PacientedeClinica extends Pessoa {

	private boolean planodeSaude;

	public PacientedeClinica(String nome, int identidade, Data dnascimento, boolean planodeSaude) {
		super(nome, identidade, dnascimento);
		this.planodeSaude = planodeSaude;
	}

	public boolean isPlanodeSaude() {
		return planodeSaude;
	}

	public void setPlanodeSaude(boolean planodeSaude) {
		this.planodeSaude = planodeSaude;
	}

	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(this.isPlanodeSaude());
		return dados.toString();
	}

}
