package tempo;



public class Periodo {
	private Data dataInicio, dataFinal;
	private Horario horaInicio, horaFinal;

	public Periodo() {

	}

	public void setPeriodo(Data dataInicio, Horario horaInicio, Data dataFinal, Horario horaFinal) throws Exception {
//se lembrar se for maior retorna -1 se for menor retorna 1 e se for igual retona 0
			if ((dataInicio.compareTo(dataFinal) == 1) || (dataInicio.compareTo(dataFinal) == 0 && horaInicio.compareTo(horaFinal) == 1)) {
				this.setDataInicio(dataInicio); 
				this.setDataFinal(dataFinal);
				this.setHoraInicio(horaInicio);
				this.setHoraFinal(horaFinal);
			} else throw new Exception("data final é menor que a data inicial");
		
	}

	public Data getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Data dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Data getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Data dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Horario getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Horario horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Horario getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(Horario horaFinal) {
		this.horaFinal = horaFinal;
	}

	public String toString() {
		StringBuilder periodo = new StringBuilder();
		periodo.append("Dia ");
		periodo.append(this.getDataInicio());
		periodo.append(" ás ");
		periodo.append(this.getHoraInicio());
		periodo.append(" até ");
		periodo.append(this.getHoraFinal());
		periodo.append(" do dia ");
		periodo.append(this.getDataFinal());
		return periodo.toString();
	}


}
