package com.sysone.automotores.gonzalo.apirest.service.dto.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sysone.automotores.gonzalo.apirest.models.dto.AutomovilDTO;
import com.sysone.automotores.gonzalo.apirest.models.dto.AutomovilPostDTO;
import com.sysone.automotores.gonzalo.apirest.service.AutomovilService;
import com.sysone.automotores.gonzalo.apirest.service.dto.AutomovilDTOService;
import com.sysone.automotores.gonzalo.apirest.service.impl.translator.TranslatorAutomovil;

@Service
public class AutomovilDTOServiceImpl implements AutomovilDTOService {

	@Autowired
	private AutomovilService service;

	@Override
	public List<AutomovilDTO> getAutomoviles() {
		return TranslatorAutomovil.getAutomovilDTOList(service.getAutomoviles());
	}

	@Override
	public void create(AutomovilPostDTO automovil) throws Exception {
		if ((automovil.getAireAcondicionado().equals("SI") || automovil.getAireAcondicionado().equals("NO"))
				&& (automovil.getTechoCorredizo().equals("SI") || automovil.getTechoCorredizo().equals("NO"))
				&& (automovil.getFrenosAbs().equals("SI") || automovil.getFrenosAbs().equals("NO"))
				&& (automovil.getAirbag().equals("SI") || automovil.getAirbag().equals("NO"))
				&& (automovil.getLlantasAlineacion().equals("SI") || automovil.getLlantasAlineacion().equals("NO")) ) {

			service.create(TranslatorAutomovil.getAutomovil(automovil));
		} else {
			throw new Exception(
					"Solo se aceptan valores SI/NO para los campos techo corredizo, airbag, freno abs, aire acondicionado, llantas de alineación.");
		}
	}

	@Override
	public AutomovilDTO getAutomovilById(Long id) {
		return TranslatorAutomovil.getAutmovilDTO(service.getAutomovilById(id));
	}

	@Override
	public void deleteAutomovilById(Long id) {
		service.deleteAutomovilById(id);

	}

	@Override
	public void updateAutomovil(Long id, AutomovilPostDTO automovil) throws Exception {
		if ((automovil.getAireAcondicionado().equals("SI") || automovil.getAireAcondicionado().equals("NO"))
				&& (automovil.getTechoCorredizo().equals("SI") || automovil.getTechoCorredizo().equals("NO"))
				&& (automovil.getFrenosAbs().equals("SI") || automovil.getFrenosAbs().equals("NO"))
				&& (automovil.getAirbag().equals("SI") || automovil.getAirbag().equals("NO"))
				&& (automovil.getLlantasAlineacion().equals("SI") || automovil.getLlantasAlineacion().equals("NO"))) {

			service.updateAutomovil(id, TranslatorAutomovil.getAutomovil(automovil));
		} else {
			throw new Exception(
					"Solo se aceptan valores SI/NO para los campos techo corredizo, airbag, freno abs, aire acondicionado, llantas de alineación.");
		}

	}

}
