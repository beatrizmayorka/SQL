package meu_lazer;

public class Local {
	private int id_local;
	private String local;

	
	public Local() { }
	
	public Local(int id_local, String local) {
		this.id_local = id_local;
		this.local = local;
	}

	public int getId_local() {
		return id_local;
	}

	public void setId_local(int id_local) {
		this.id_local = id_local;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public String toString() {
		return " Local [id_local = " + id_local + ", local = " + local + "]";
	}

}