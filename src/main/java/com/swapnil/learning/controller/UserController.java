/**
 * 
 */
package com.swapnil.learning.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dangoswa
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

	private String baseUri = "https://reqres.in/api/users";
	
	@GetMapping
	public ResponseEntity<String> getAllUsers(){
		RestTemplate restTemplete = new RestTemplate();
		Path keystore=null;
		try {
			keystore = Files.createTempFile(null, null);
			try (InputStream stream = getClass().getResourceAsStream("/cacerts")) {
				Files.copy(stream, keystore, StandardCopyOption.REPLACE_EXISTING);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("javax.net.ssl.trustStore", keystore.toString());
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		
		return ResponseEntity.ok().body(restTemplete.getForObject(baseUri, String.class));
	}
}
