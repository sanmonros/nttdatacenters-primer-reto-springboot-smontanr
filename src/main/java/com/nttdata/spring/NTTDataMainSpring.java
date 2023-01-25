package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.repository.Language;
import com.nttdata.spring.services.LanguageManagementServiceI;

/**
 * Primer - Reto -Springboot
 * 
 * @author smontanr
 *
 */
@SpringBootApplication()
public class NTTDataMainSpring implements CommandLineRunner {

	/** Servicio idiomas */
	@Autowired
	private LanguageManagementServiceI languageService;

	/**
	 * Método principal para iniciar nuestra aplicación
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		SpringApplication.run(NTTDataMainSpring.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Creación de base de datos de idiomas para consumir diferentes servicios

		Language l1 = languageService.generateLanguages("Español", "ES");
		Language l2 = languageService.generateLanguages("Inglés", "EN");
		Language l3 = languageService.generateLanguages("Alemán", "AL");
		Language l4 = languageService.generateLanguages("Francés", "FR");

		// Insertar idiomas en la base de datos embebida
		languageService.insertLanguage(l1);
		languageService.insertLanguage(l2);
		languageService.insertLanguage(l3);
		languageService.insertLanguage(l4);

	}

}
