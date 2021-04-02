package com.sysone.automotores.gonzalo.apirest.service;

import java.util.List;

import com.sysone.automotores.gonzalo.apirest.models.entity.Automovil;

public interface AutomovilService {

	public List<Automovil> getAutomoviles();
	
	public Automovil create(Automovil auto);
	
	public Automovil getAutomovilById(Long id);
	
	public void deleteAutomovilById(Long id);
	
	public Automovil updateAutomovil(Long id, Automovil automovil);
	
}
