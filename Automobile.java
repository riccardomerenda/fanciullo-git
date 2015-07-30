public class Automobile{
	
	private String targa;
	private String marca;
	
	/* Costruttore */
	public Automobile(String targa, String marca){
		this.targa = targa;
		this.marca = marca;
	}

	@Override
	public String toString(){
		return "Targa: " + targa + " Marca: " + marca;
	}
}
