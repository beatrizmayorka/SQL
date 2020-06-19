package meu_lazer;

public class Viaja {
	private int id_viaja;
	private String companhia;
	private int id_pessoa;
	private int id_local;
	
	public Viaja() { }
	
	public Viaja(int id_viaja, String companhia, int id_pessoa, int id_local) {
		this.id_viaja = id_viaja;
		this.companhia = companhia;
		this.id_pessoa = id_pessoa;
		this.id_local = id_local;
	}

	public int getId_viaja() {
		return id_viaja;
	}

	public void setId_viaja(int id_viaja) {
		this.id_viaja = id_viaja;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setNome(String companhia) {
		this.companhia = companhia;
	}
	

	public int getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public int getId_local() {
		return id_local;
	}

	public void setId_local(int id_local) {
		this.id_local = id_local;
	}
	
	public String toString() {
		return " Viaja [id_viaja = " + id_viaja + ", Companhia = " + companhia + ", id_pessoa" + id_pessoa + "id_local" + id_local + "]";
	}

	public void setCompanhia(String string) {
		// TODO Auto-generated method stub
		
	}

}