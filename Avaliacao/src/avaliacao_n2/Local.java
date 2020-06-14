package avaliacao_n2;

public class Local {
	private int idviaja;
	private String local;
	
	public Local() { }
	
	public Local(int idviaja, String local) {
		this.idviaja = idviaja;
		this.local = local;
	}

	public int getidviaja() {
		return idviaja;
	}

	public void setidviaja(int idviaja) {
		this.idviaja = idviaja;
	}

	public String getlocal() {
		return local;
	}

	public void setlocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Local [idviaja = " + idviaja + ", local = " + local + "]";
	}

}
