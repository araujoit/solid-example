package br.com.araujo.solid.d;

public class Windows98Machine {
	private final Keyboard keyboard;
    private final Monitor monitor;

    // Utiliza a interface para o utilizador da classe Windows98Machine definir qual implementação de teclado utilizar
    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
    	this.keyboard = keyboard;
        this.monitor = monitor;
    }
    
    public void run() {
    	System.out.println("Utilizando keyboard " + keyboard);
    	System.out.println("Utilizando monitor " + monitor);
    }
}
