package avaliacao_n2;

public class Viaja {
	private int id;
	private String companhia;
	private int idviaja;
	
	public Viaja() { }
	
	public Viaja(int id, String companhia, int idviaja) {
		this.id = id;
		this.companhia = companhia;
		this.idviaja = idviaja;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public int getidviaja() {
		return idviaja;
	}

	public void setidviaja(int idviaja) {
		this.idviaja = idviaja;
	}

	@Override
	public String toString() {
		return "Viaja [id = " + id + ", companhia = " + companhia + ", idviaja = " + idviaja + "]";
	}
}
