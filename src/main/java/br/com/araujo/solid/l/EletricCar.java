package br.com.araujo.solid.l;

public class EletricCar implements Car {

	private final Engine engine;

	public EletricCar(Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public void turnOnEngine() {
		// não possui motor à ser ligado
	}

	@Override
	public void accelerate() {
		// acelera 1000 metros
		engine.powerOn(1000);
	}

}
