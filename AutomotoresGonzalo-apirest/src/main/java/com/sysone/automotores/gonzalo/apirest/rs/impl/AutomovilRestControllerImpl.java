package com.sysone.automotores.gonzalo.apirest.rs.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.sysone.automotores.gonzalo.apirest.models.dto.AutomovilDTO;
import com.sysone.automotores.gonzalo.apirest.models.dto.AutomovilPostDTO;
import com.sysone.automotores.gonzalo.apirest.models.dto.ErrorResponse;
import com.sysone.automotores.gonzalo.apirest.rs.AutomovilRestController;
import com.sysone.automotores.gonzalo.apirest.service.dto.AutomovilDTOService;

@RestController
public class AutomovilRestControllerImpl implements AutomovilRestController {

	@Autowired
	private AutomovilDTOService serviceDto;

	@Override
	public ResponseEntity<?> getAutomoviles() {
		List<AutomovilDTO> listaAutomoviles = null;
		try {
			listaAutomoviles = serviceDto.getAutomoviles();
			return new ResponseEntity<List<AutomovilDTO>>(listaAutomoviles, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<ErrorResponse>(new ErrorResponse("Error", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<?> create(AutomovilPostDTO automovil) {
		try {
			serviceDto.create(automovil);
			return new ResponseEntity<String>("El automóvil fue creado.", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<ErrorResponse>(new ErrorResponse("Error", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<?> getAutomovilById(Long id) {
		AutomovilDTO automovil = null;
		try {
			automovil = serviceDto.getAutomovilById(id);
			return new ResponseEntity<AutomovilDTO>(automovil, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<ErrorResponse>(new ErrorResponse("Error", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<?> deleteAutomovilById(Long id) {
		try {
			serviceDto.deleteAutomovilById(id);
			return new ResponseEntity<String>("El automóvil fue eliminado.", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<ErrorResponse>(new ErrorResponse("Error", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<?> updateAutomovil(Long id, AutomovilPostDTO automovil) {
		try {
			serviceDto.updateAutomovil(id, automovil);
			return new ResponseEntity<String>("El automóvil fue modificado.", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<ErrorResponse>(new ErrorResponse("Error", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

}
