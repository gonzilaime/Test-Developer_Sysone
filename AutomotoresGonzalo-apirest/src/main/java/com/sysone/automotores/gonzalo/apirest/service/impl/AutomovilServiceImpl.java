package com.sysone.automotores.gonzalo.apirest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sysone.automotores.gonzalo.apirest.dao.AutomovilDAO;
import com.sysone.automotores.gonzalo.apirest.models.entity.Automovil;
import com.sysone.automotores.gonzalo.apirest.service.AutomovilService;

@Service
public class AutomovilServiceImpl implements AutomovilService {

	@Autowired
	private AutomovilDAO daoInstance;

	@Override
	@Transactional(readOnly = true)
	public List<Automovil> getAutomoviles() {
		return (List<Automovil>) daoInstance.findAll();
	}

	@Override
	@Transactional
	public Automovil create(Automovil auto) {
		return daoInstance.save(auto);
	}

	@Override
	@Transactional(readOnly = true)
	public Automovil getAutomovilById(Long id) {
		return daoInstance.findById(id).get();
	}

	@Override
	@Transactional
	public void deleteAutomovilById(Long id) {
		daoInstance.deleteById(id);
	}

	@Override
	@Transactional
	public Automovil updateAutomovil(Long id, Automovil automovil) {
		Automovil oldAutomovil = daoInstance.findById(id).get();
		if(oldAutomovil != null) {
			automovil.setId(oldAutomovil.getId());
		}
		return daoInstance.save(automovil);
	}

}
