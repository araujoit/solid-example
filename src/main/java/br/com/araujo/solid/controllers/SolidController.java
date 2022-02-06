package br.com.araujo.solid.controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class SolidController {
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("description", "The SOLID principles were introduced by Robert C. Martin in his 2000 paper “Design Principles and Design Patterns.” These concepts were later built upon by Michael Feathers, who introduced us to the SOLID acronym. And in the last 20 years, these five principles have revolutionized the world of object-oriented programming, changing the way that we write software.");
		
		final Map<String, String> itemsMap = new LinkedHashMap<String, String>();
		itemsMap.put("S - Single Responsibility (Responsabilidade Única)", "Uma classe deve ter apenas uma responsabilidade. Além disso, deve ter apenas um motivo para mudar");
		itemsMap.put("O - Open for Extension, Closed for Modification (Aberto para Extensão, Fechado para Modificação)", "Classes devem ser abertas para extensão, mas fechadas para modificação. Ao fazer isso, nos impedimos de modificar o código existente e causar novos bugs em potencial em um aplicativo de outra forma feliz");
		itemsMap.put("L - Liskov Substitution (Substituição de Liskov)", "Se a classe A for um subtipo da classe B , devemos ser capazes de substituir B  por  A  sem interromper o comportamento do nosso programa");
		itemsMap.put("I - Interface Segregation (Segregação de Interface)", "Interfaces maiores devem ser divididas em menores. Ao fazer isso, podemos garantir que as classes de implementação só precisem se preocupar com os métodos que são de seu interesse");		
		itemsMap.put("D - Dependency Inversion (Inversão de Dependência)", "O princípio da inversão de dependência refere-se ao desacoplamento de módulos de software. Dessa forma, ao invés de módulos de alto nível dependerem de módulos de baixo nível, ambos dependerão de abstrações");
	
		// adiciona entryset com dados de principios SOLID, tratados na template
		model.addAttribute("items", itemsMap.entrySet());
		
		
		// adiciona entryset com dados de referências, tratados na template
		final Map<String, String> referencesMap = new HashMap<>();
		referencesMap.put("Solid Principles", "https://www.baeldung.com/solid-principles");		
		model.addAttribute("references", referencesMap.entrySet());
		
		// retorna nome da template a ser renderizada
		return "solid";
	}
	
	@GetMapping(value = "/s")
	public String singleResponsibility() {
		return """
				<b>Single Responsibility</b>
				<p>A class should only have one responsibility. Furthermore, it should only have one reason to change</p>
				""";
	}
	
	@GetMapping(value = "/o")
	public String openClosed() {
		return """
				<b>Open/Closed</b>
				<p>Classes should be open for extension but closed for modification</p>
				""";
	}
	
	@GetMapping(value = "/l")
	public String liskovSubstitution() {
		return """
				<b>Liskov Substitution</b>
				<p>If class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program</p>
				""";
	}
	
	@GetMapping(value = "/i")
	public String interfaceSegregation() {
		return """
				<b>Interface Segregation</b>
				<p>Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them</p>
				""";
	}
	
	@GetMapping(value = "/d")
	public String dependencyInversion() {
		return """
				<b>Dependency Inversion</b>
				<p>The principle of dependency inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions</p>
				""";
	}
}
