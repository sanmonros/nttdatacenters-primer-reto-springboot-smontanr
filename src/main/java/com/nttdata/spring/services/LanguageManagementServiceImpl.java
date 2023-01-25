package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Language;
import com.nttdata.spring.repository.LanguageRepository;

/**
 * Servicio idiomas
 * 
 * @author smontanr
 *
 */
@Service
@Primary
public class LanguageManagementServiceImpl implements LanguageManagementServiceI {

	/** Repositorio idiomas */
	@Autowired
	LanguageRepository languageRe;

	@Override
	public void insertLanguage(Language l) {
		languageRe.save(l);

	}

	@Override
	public void updateLanguage(Long languageId, Language newLanguage) {
		Language languageExists = languageRe.findById(languageId).orElseThrow();
		languageExists.setLanguageName(newLanguage.getLanguageName());
		languageExists.setLanguageCode(newLanguage.getLanguageCode());
		languageRe.save(languageExists);

	}

	@Override
	public void deleteLanguage(Language l) {
		languageRe.delete(l);

	}

	@Override
	public Language getLanguageById(Long languageID) {
		Language language = null;
		language = languageRe.findById(languageID).get();

		return language;

	}

	@Override
	public List<Language> getAllLanguage() {
		return languageRe.findAll();
	}

	@Override
	public void deleteLanguageById(Long languageId) {
		languageRe.deleteById(languageId);

	}

	@Override
	public Language generateLanguages(String languageName, String languageCode) {
		Language genericLanguage = new Language();
		genericLanguage.setLanguageName(languageName);
		genericLanguage.setLanguageCode(languageCode);

		return genericLanguage;
	}

}
