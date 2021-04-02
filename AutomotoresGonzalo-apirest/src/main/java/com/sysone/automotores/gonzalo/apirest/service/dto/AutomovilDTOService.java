package com.sysone.automotores.gonzalo.apirest.service.dto;

import java.util.List;

import com.sysone.automotores.gonzalo.apirest.models.dto.AutomovilDTO;
import com.sysone.automotores.gonzalo.apirest.models.dto.AutomovilPostDTO;

public interface AutomovilDTOService {

	
	public List<AutomovilDTO> getAutomoviles();
	
	public void create(AutomovilPostDTO automovil) throws Exception;
	
	public AutomovilDTO getAutomovilById(Long id);
	
	public void deleteAutomovilById(Long id);
	
	public void updateAutomovil(Long id, AutomovilPostDTO automovil) throws Exception;
}
