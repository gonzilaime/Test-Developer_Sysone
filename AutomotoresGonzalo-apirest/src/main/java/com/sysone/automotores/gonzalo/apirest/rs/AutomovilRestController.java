package com.sysone.automotores.gonzalo.apirest.rs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sysone.automotores.gonzalo.apirest.models.dto.AutomovilPostDTO;

@RequestMapping("/api")
public interface AutomovilRestController {
	
	@GetMapping("/automovil")
	public ResponseEntity<?> getAutomoviles();
	
	@PostMapping("/automovil")
	public ResponseEntity<?> create(@RequestBody AutomovilPostDTO automovil);
	
	@GetMapping("/automovil/{id}")
	public ResponseEntity<?> getAutomovilById(@PathVariable("id") Long id);
	
	@DeleteMapping("/automovil/{id}")
	public ResponseEntity<?> deleteAutomovilById(@PathVariable("id") Long id);
	
	@PutMapping("/automovil/{id}")
	public ResponseEntity<?> updateAutomovil(@PathVariable("id") Long id, @RequestBody AutomovilPostDTO automovil);
	
}
