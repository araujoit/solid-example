package br.com.araujo.solid.l;

/**
 * @author araujo
 *
 */
public interface Engine {

	/**
	 * Ligar
	 */
	void on();
	
	/**
	 * Desligar
	 */	
	void off();
	
	/**
	 * Acelerar
	 */
	void powerOn(int meters);
	
	/**
	 * Freiar
	 */
	void brake();
}
