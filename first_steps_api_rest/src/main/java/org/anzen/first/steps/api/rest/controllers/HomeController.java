/*
 * Copyright (c) 2018 Anzen Soluciones S.A. de C.V.
 * Mexico D.F.
 * All rights reserved.
 *
 * THIS SOFTWARE IS  CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES.
 * THIS INFORMATION SHOULD NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE COMPANY ITSELF.
 */
package org.anzen.first.steps.api.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 * 
 * @author Marco Acevedo {@literal <marcoacevedo@anzen.com.mx>}
 * @version first-steps-api-rest
 * @since first-steps-api-rest
 * @category
 */
@RestController("/home")
public class HomeController {

	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> holaMundo(@RequestParam String name) {
		String foo = String.format("primeros pasos de %s", name);
		return new ResponseEntity<>(foo, HttpStatus.OK);
		
		
	}
}
