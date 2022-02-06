package br.com.araujo.solid.o;

/**
 * Open for extension, Closed for modification
 * 
 * Classe não é final, para permitir sua extensão com adição de funcionalidades.
 * Caso necessário corrigir algo, é facilitado também
 * 
 * @author araujo
 *
 */
public class Guitar {
	private String make;
	private String model;
	private int volume;

	public Guitar(String make, String model, int volume) {
		super();
		this.make = make;
		this.model = model;
		this.volume = volume;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
