package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dto.Partida;
import com.crud.service.PartidaServiceImpl;

@RestController
@RequestMapping("/api")
public class PartidaController {
	
	@Autowired
	PartidaServiceImpl partidaServiceImpl;
	
	@PostMapping("/partidas")
	public Partida guardarPartida(@RequestBody Partida partida) {
		return partidaServiceImpl.guardarPartida(partida);
	}
	
	@GetMapping("/partidas")
	public List<Partida> listarPartidas() {
		return partidaServiceImpl.listarPartida();
	}
	
	@GetMapping("/partidas/{codigo}")
	public Partida partidaPorId(@PathVariable(name="codigo") Long id) {
		Partida partidaPorId = new Partida();
		partidaPorId = partidaServiceImpl.partidaPorId(id);
		
		return partidaPorId;
	}	
	
	@DeleteMapping("/partidas/{codigo}")
	public void borrarPartida(@PathVariable(name="codigo") Long id) {
		partidaServiceImpl.borrarPartida(id);
	}
}


