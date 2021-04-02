package com.sysone.automotores.gonzalo.apirest.service.impl.translator;

import java.util.ArrayList;
import java.util.List;

import com.sysone.automotores.gonzalo.apirest.models.dto.AutomovilDTO;
import com.sysone.automotores.gonzalo.apirest.models.dto.AutomovilPostDTO;
import com.sysone.automotores.gonzalo.apirest.models.entity.Automovil;

public class TranslatorAutomovil {

	public static AutomovilDTO getAutmovilDTO(Automovil entity) {
		AutomovilDTO auto = new AutomovilDTO();
		if (entity != null) {
			auto.setId(entity.getId());
			auto.setModelo(entity.getModelo());
			if (entity.isTechoCorredizo()) {
				auto.setTechoCorredizo("SI");
			} else {
				auto.setTechoCorredizo("NO");
			}
			if (entity.isAireAcondicionado()) {
				auto.setAireAcondicionado("SI");
			} else {
				auto.setAireAcondicionado("NO");
			}
			if (entity.isFrenosAbs()) {
				auto.setFrenosAbs("SI");
			} else {
				auto.setFrenosAbs("NO");
			}
			if (entity.isAirbag()) {
				auto.setAirbag("SI");
			} else {
				auto.setAirbag("NO");
			}
			if (entity.isLlantasAlineacion()) {
				auto.setLlantasAlineacion("SI");
			} else {
				auto.setLlantasAlineacion("NO");
			}
			auto.setValor(entity.getImporte());
		}
		return auto;
	}

	public static List<AutomovilDTO> getAutomovilDTOList(List<Automovil> listaAutomoviles) {
		List<AutomovilDTO> listaAutoDto = new ArrayList<AutomovilDTO>();
		if (listaAutomoviles != null) {
			for (Automovil auto : listaAutomoviles) {
				listaAutoDto.add(TranslatorAutomovil.getAutmovilDTO(auto));
			}
		}
		return listaAutoDto;
	}

	public static Automovil getAutomovil(AutomovilPostDTO automovil) {
		Automovil entity = new Automovil();
		if (automovil.getModelo() != null) {

			entity.setModelo(automovil.getModelo());

			if (automovil.getTechoCorredizo().equals("SI")) {
				entity.setTechoCorredizo(true);
			} else {
				entity.setTechoCorredizo(false);
			}

			if (automovil.getAireAcondicionado().equals("SI")) {
				entity.setAireAcondicionado(true);
			} else {
				entity.setAireAcondicionado(false);
			}

			if (automovil.getFrenosAbs().equals("SI")) {
				entity.setFrenosAbs(true);
			} else {
				entity.setFrenosAbs(false);
			}

			if (automovil.getAirbag().equals("SI")) {
				entity.setAirbag(true);
			} else {
				entity.setAirbag(false);
			}

			if (automovil.getLlantasAlineacion().equals("SI")) {
				entity.setLlantasAlineacion(true);
			} else {
				entity.setLlantasAlineacion(false);
			}
			entity.setImporte(entity.calcularTotal(entity));
		}
		return entity;
	}

}
