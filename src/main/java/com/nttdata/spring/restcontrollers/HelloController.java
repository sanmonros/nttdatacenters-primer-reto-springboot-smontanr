package com.nttdata.spring.restcontrollers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;



/**
 * Clase Saludo
 * 
 * @author smontanr
 *
 */

@RestController
@RequestMapping(path = "/greetings")
public class HelloController {


	@Value("${message:Hello default}")
	private String message;
	
	@Operation(summary="Saludo config server")
	@GetMapping("/messageProject")
	public @ResponseBody String seeMessage() {
		return this.message;
	}
	
	
	

}
