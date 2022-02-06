package br.com.araujo.solid.l;

public class MotorCar implements Car {

	private final Engine engine;

	public MotorCar(Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public void turnOnEngine() {
		// liga o motor
		engine.on();		
	}

	@Override
	public void accelerate() {
		// acelera 1000 metros
		engine.powerOn(1000);		
	}

}
