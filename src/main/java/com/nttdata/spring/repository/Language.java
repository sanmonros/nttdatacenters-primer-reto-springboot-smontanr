package com.nttdata.spring.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase Idioma
 * 
 * @author smontanr
 *
 */
@Entity
@Table(name = "LANGUAGES")
public class Language implements Serializable {

	/** Serial version */
	private static final long serialVersionUID = 1L;

	/** Identificador idioma */
	private Long languageID;

	/** Nombre idioma */
	private String languageName;

	/** Código idioma */
	private String languageCode;

	/**
	 * Devolver el identificador idioma
	 * 
	 * @return the languageID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LANGUAGE_ID")
	public Long getLanguageID() {
		return languageID;
	}

	/**
	 * Fijar el identificador del idioma
	 * 
	 * @param languageID the languageID to set
	 */
	public void setLanguageID(Long languageID) {
		this.languageID = languageID;
	}

	/**
	 * Devolver el nombre del idioma
	 * 
	 * @return the languageName
	 */
	@Column(name = "LANGUAGE_NAME")
	public String getLanguageName() {
		return languageName;
	}

	/**
	 * Fijar el nombre del idioma
	 * 
	 * @param languageName the languageName to set
	 */
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	/**
	 * Devolver el código asociado al idioma
	 * 
	 * @return the languageCode
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * Fijar el código asociado al idioma
	 * 
	 * @param languageCode the languageCode to set
	 */
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

}
