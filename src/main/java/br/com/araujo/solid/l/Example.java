package br.com.araujo.solid.l;

public class Example {
	
	public static void main(String[] args) {
		final Car motorCar = new MotorCar(new Engine() {
			@Override
			public void powerOn(int meters) {
				System.out.println("Acelerando " + meters + " metros via motor à combustão");
			}
			
			@Override
			public void on() {
				System.out.println("Ligando motor à combustão");
			}
			
			@Override
			public void off() {
				System.out.println("Desligando motor à combustão");
			}
			
			@Override
			public void brake() {
				System.out.println("Brecando motor à combustão");
			}
		});
		final Car eletricCar = new EletricCar(new Engine() {
			@Override
			public void powerOn(int meters) {
				System.out.println("Acelerando " + meters + " metros via motor elétrico");
			}
			
			/**
			 * Nunca chamado, pois motor elétrico não precisa ser ligado
			 */
			@Override
			public void on() {
				System.out.println("Ligando motor elétrico");
			}
			
			@Override
			public void off() {
				System.out.println("Desligando motor elétrico");
			}
			
			@Override
			public void brake() {
				System.out.println("Brecando motor elétrico");
			}
		});
		
		motorCar.turnOnEngine();
		motorCar.accelerate();
		
		eletricCar.turnOnEngine();
		eletricCar.accelerate();
	}

}
