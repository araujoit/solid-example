package br.com.araujo.solid.l;

/**
 * Substituição de Liskov
 * 
 * Definição de interface permite implementar tipos específicos de carro. Ou seja, permite que uma implementação que herde o mesmo tipo possa ser substituída na classe utilizadora
 * 
 * @author araujo
 *
 */
public interface Car {
	
	void turnOnEngine();
	void accelerate();
}
