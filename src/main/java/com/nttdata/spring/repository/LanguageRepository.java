package com.nttdata.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de clientes
 * 
 * @author smontanr
 *
 */
@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {

}
