package com.nttdata.spring.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.spring.repository.Language;
import com.nttdata.spring.services.LanguageManagementServiceI;

/**
 * Clase principal
 * 
 * @author smontanr
 *
 */
@RestController
@RequestMapping(path = "/language")
public class LanguageController {

	/** Servicio idioma */
	@Autowired
	LanguageManagementServiceI languageService;

	/**
	 * Método devolver saludo según parámetro introducido
	 * 
	 * @param lang
	 * @return
	 */
	@GetMapping(value = "/greetings")
	public String index(@Pathvariable String lang) {
		if (lang.equalsIgnoreCase("en")) {
			return "HELLO WORLD";
		} else if (lang.equalsIgnoreCase("es")) {
			return "HOLA MUNDO";
		} else {
			return "Idioma no disponible";
		}
	}

	/**
	 * Añadir un nuevo idioma
	 * 
	 * @param newLanguage
	 */
	@PostMapping(value = "/newLanguage")
	public void generateLanguage(@ModelAttribute("language") Language newLanguage) {
		languageService.insertLanguage(newLanguage);
	}

	/**
	 * Borrar un idioma por el id introducido
	 * 
	 * @param languageId
	 */
	@RequestMapping("deleteLanguageById")
	public @ResponseBody void deleteById(@RequestParam Long languageId) {
		languageService.deleteLanguageById(languageId);
		System.out.println("Idioma borrado correctamente");
	}

	/**
	 * Actualizar un idioma existente
	 * 
	 * @param newLanguage
	 */
	@PutMapping(value = "/updateLanguage")
	public void updatelanguage(@RequestParam Long languageId, @RequestBody Language newLanguage) {
		languageService.updateLanguage(languageId, newLanguage);
	}

	/**
	 * Listar todos los idiomas existentes
	 * 
	 * @return
	 */
	@GetMapping(value = "showLanguage")
	public @ResponseBody List<Language> showAll() {
		return languageService.getAllLanguage();
	}

	/**
	 * Consultar por id del idioma
	 * 
	 * @param languageId
	 * @return
	 */
	@RequestMapping("searchLanguageById")
	public @ResponseBody Language searchById(@RequestParam Long languageId) {
		return languageService.getLanguageById(languageId);
	}

}
