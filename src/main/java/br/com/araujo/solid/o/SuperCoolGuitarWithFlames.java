package br.com.araujo.solid.o;

/**
 * Permite a extensão de Guitar, sem necessidade de alteração na classe para
 * adicionar funcionalidades, e ainda, caso necessário, é facilitada a correção
 * de algum bug
 * 
 * @author araujo
 */
public class SuperCoolGuitarWithFlames extends Guitar {

	private String flameColor;

	public SuperCoolGuitarWithFlames(String make, String model, int volume) {
		this(make, model, volume, "");
	}

	public SuperCoolGuitarWithFlames(String make, String model, int volume, String flameColor) {
		super(make, model, volume);
		this.flameColor = flameColor;
	}

	public String getFlameColor() {
		return flameColor;
	}

	public void setFlameColor(String flameColor) {
		this.flameColor = flameColor;
	}
}
