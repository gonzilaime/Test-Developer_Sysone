package com.sysone.automotores.gonzalo.apirest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sysone.automotores.gonzalo.apirest.models.entity.Automovil;
import com.sysone.automotores.gonzalo.apirest.service.AutomovilService;

@SpringBootTest
class AutomotoresGonzaloApirestApplicationTests {

	@Autowired
	private AutomovilService service;

	Automovil auto = new Automovil();

	@Test
	void contextLoads() {
	}

	@Test
	public void testObtenerTotalAutomovil() {

		auto = new Automovil(1L, "sedan", true, false, true, true, true);
		assertEquals(275000, auto.calcularTotal(auto));
	}

	@Test
	public void testObtenerAutomoviles() {
		List<Automovil> listaAutomoviles = new ArrayList<Automovil>();
		listaAutomoviles = service.getAutomoviles();
		assertEquals(service.getAutomoviles().size(), listaAutomoviles.size());
	}

	@Test
	public void testCrearAutomovil() {
		auto = new Automovil(1L, "sedan", true, false, true, true, true);
		service.create(auto);

	}

	@Test
	public void testObtenerAutomovilPorId() {
		Automovil autoFamily = new Automovil("familiar", true, false, false, false, false);
		Automovil autoCreado = service.create(autoFamily);
		Automovil autoObtenido = service.getAutomovilById(autoCreado.getId());
		assertEquals(autoCreado.getId(), autoObtenido.getId());
	}
	
	@Test
	public void testEliminarAutomovil() {
		List<Automovil> listaAutomoviles = new ArrayList<Automovil>();
		listaAutomoviles = service.getAutomoviles();
		Integer cantidadAutomoviles = listaAutomoviles.size();
		service.deleteAutomovilById(1L);
		assertEquals(cantidadAutomoviles - 1, service.getAutomoviles().size());
	}

}
