package tempo;


public class Horario {
	private int hora, minuto;

	public Horario()throws Exception {
	    this(0,0);
		
	}
	public Horario(int hora, int minuto)throws Exception {
		this.setHora(hora);
		this.setMinuto(minuto);

	}


	public void setHorario(int hora, int minuto) throws Exception {
		if (Horario.isHorarioValido(hora, minuto)) {
			this.hora = hora;
			this.minuto = minuto;
		} else {
			throw new Exception("Hor@rio inv�lida");
		}
	}

	public void setHorario(String horario) throws Exception {
		int firstindex = horario.indexOf(":");
		this.setHorario(Integer.parseInt(horario.substring(0, firstindex)),
				Integer.parseInt(horario.substring(firstindex + 1, horario.length())));

	}

	public static boolean isHorarioValido(int hora, int minuto) {
		if (hora < 0 || hora > 24)
			return false;
		if (minuto < 0 || minuto > 60)
			return false;
		else
			return true;
	}

	public int compareTo(Object objeto) throws Exception {
		Horario aux = (Horario) objeto;
		if ((aux.getHora() > this.getHora())
				|| (aux.getHora() == this.getHora() && aux.getMinuto() > this.getMinuto())) {
			return 1;
		}

		if ((aux.getHora() < this.getHora())
				|| (aux.getHora() == this.getHora() && aux.getMinuto() < this.getMinuto())) {
			return -1;
		} else
			return 0;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public String toString() {
		StringBuilder horario = new StringBuilder();
		horario.append(this.getHora());
		horario.append(":");
		horario.append(this.getMinuto());
		return horario.toString();
	}



}
