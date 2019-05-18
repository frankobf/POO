package ex02;

public class Data {
	private int dia, mes, ano;

	public Data(int mes, int ano) {
		this(1, mes, ano);
	}

	public Data(int dia, int mes, int ano) {
		this.setData(dia, mes, ano);
	}

	public Data(String data) {
		this.setData(data);
	}

	public Data(int dia, String mes, int ano) {
		this.setData(dia, mes, ano);
	}

	public Data() {
		this(1, 1, 1900);
	}

	public void setData(int dia, int mes, int ano) {
		if (isDataValida(dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			this.dia = 1;
			this.mes = 1;
			this.ano = 1900;
		}
	}

	public void setData(int dia, String mes, int ano) {
		int mesInt = Data.retornaMes(mes);
		this.setData(dia, mesInt, ano);
	}

	public static int retornaMes(String mes) {
		mes = mes.toLowerCase();
		switch (mes) {
		case "janeiro":
			return 1;
		case "fevereiro":
			return 2;
		case "mar�o":
			return 3;
		case "marco":
			return 3;
		case "abril":
			return 4;
		case "maio":
			return 5;
		case "junho":
			return 6;
		case "julho":
			return 7;
		case "agosto":
			return 8;
		case "setembro":
			return 9;
		case "outubro":
			return 10;
		case "novembro":
			return 11;
		case "dezembro":
			return 12;
		default:
			return 13;
		}
	}

	public void setData(String data) {
		int firstindex = data.indexOf("/");
		int secindex = data.indexOf("/", firstindex + 1);
		this.setData(Integer.parseInt(data.substring(0, firstindex)),
				Integer.parseInt(data.substring((firstindex + 1), secindex)),
				Integer.parseInt(data.substring((secindex + 1), (secindex + 5))));
	}

	public String getData() {
		return this.toString();
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}

	public static boolean isDataValida(int dia, int mes, int ano) {
		if (ano < 1582) {
			return false;
		}
		if (mes > 12) {
			return false;
		}
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia > 31 || dia < 1) {
				return false;
			}
		} else if (mes == 2) {
			if (Data.isBissexto(ano)) {
				if (dia > 29 || dia < 1) {
					return false;
				}
			} else {
				if (dia > 28 || dia < 1) {
					return false;
				}
			}
		} else {
			if (dia > 30 || dia < 1) {
				return false;
			}
		}
		return true;
	}

	private static boolean isBissexto(int ano) {
		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			return true;
		}
		return false;
	}

	public String toString() {
		StringBuilder data = new StringBuilder();
		data.append(this.getDia());
		data.append("/");
		data.append(this.getMes());
		data.append("/");
		data.append(this.getAno());
		return data.toString();
	}

}