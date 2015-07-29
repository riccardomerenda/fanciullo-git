public class Automobile{
	
	private String targa;
	
	/* Costruttore */
	public Automobile(String targa){
		this.targa = targa;
	}

	@Override
	public String toString(){
		return targa;
	}
}
