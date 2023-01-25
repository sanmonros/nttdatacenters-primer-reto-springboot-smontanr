package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.repository.Language;

/**
 * Interface Idiomas
 * 
 * @author smontanr
 *
 */
public interface LanguageManagementServiceI {

	/**
	 * Método para generar idiomas
	 * 
	 * @param name
	 * @return
	 */
	public Language generateLanguages(String name, String code);

	/**
	 * Insertar idiomas
	 * 
	 * @param l
	 */
	public void insertLanguage(Language l);

	/**
	 * Actualizar idiomas
	 * 
	 * @param l
	 */
	public void updateLanguage(Long languageId, Language l);

	/**
	 * Borrar idiomas
	 * 
	 * @param l
	 */
	public void deleteLanguage(Language l);

	/**
	 * Borrar idioma por el id introducido
	 * 
	 * @param languageId
	 */
	public void deleteLanguageById(Long languageId);

	/**
	 * Buscar un idioma por su Id
	 * 
	 * @param languageID
	 * @return
	 */
	public Language getLanguageById(Long languageID);

	/**
	 * Obtener información de todos los idiomas registrados
	 * 
	 * @return
	 */
	public List<Language> getAllLanguage();

}
