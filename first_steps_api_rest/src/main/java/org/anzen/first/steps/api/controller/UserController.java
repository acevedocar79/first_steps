/*
 * Copyright (c) 2018 Anzen Soluciones S.A. de C.V.
 * Mexico D.F.
 * All rights reserved.
 *
 * THIS SOFTWARE IS  CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES.
 * THIS INFORMATION SHOULD NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE COMPANY ITSELF.
 */
package org.anzen.first.steps.api.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>TODO [Add comments of the class]</p>
 * 
 * @author triana
 * @version first-steps-api-rest
 * @since first-steps-api-rest
 * @category
 */
@RestController("/user")
public class UserController {
	
	@GetMapping(produces = MediaType.TEXT_PLAIN_VALUE, path ="/{nombre}")
	public ResponseEntity<String> getUser(@PathVariable String nombre) {
		return new ResponseEntity<>(nombre, HttpStatus.OK);
	}
	
}
