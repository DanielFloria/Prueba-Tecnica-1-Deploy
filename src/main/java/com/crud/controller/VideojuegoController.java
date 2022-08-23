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

import com.crud.dto.Videojuego;
import com.crud.service.VideojuegoServiceImpl;

@RestController
@RequestMapping("/api")
public class VideojuegoController {
	
	@Autowired
	VideojuegoServiceImpl videojuegoServiceImpl;
	
	@PostMapping("/videojuegos")
	public Videojuego guardarVideojuego(@RequestBody Videojuego videojuego) {
		return videojuegoServiceImpl.guardarVideojuego(videojuego);
	}
	
	@GetMapping("/videojuegos")
	public List<Videojuego> listarVideojuegos() {
		return videojuegoServiceImpl.listarVideojuego();
	}
	
	@GetMapping("/videojuegos/{codigo}")
	public Videojuego videojuegoPorId(@PathVariable(name="codigo") Long id) {
		Videojuego videojuegoPorId = new Videojuego();
		videojuegoPorId = videojuegoServiceImpl.videojuegoPorId(id);
		
		return videojuegoPorId;
	}	
	
	@PutMapping("/videojuegos/{codigo}")
	public Videojuego actualizarVideojuego(@PathVariable(name="codigo") Long id, @RequestBody Videojuego videojuego) {
		Videojuego videojuegoSeleccionado = new Videojuego();
		Videojuego videojuegoActualizado = new Videojuego();
		
		videojuegoSeleccionado = videojuegoServiceImpl.videojuegoPorId(id);
		
		videojuegoSeleccionado.setNombre(videojuego.getNombre());
		videojuegoSeleccionado.setCalificacionEdad(videojuego.getCalificacionEdad());
		
		videojuegoActualizado = videojuegoServiceImpl.actualizarVideojuego(videojuegoSeleccionado);
		
		return videojuegoActualizado;
	}
	
	@DeleteMapping("/videojuegos/{codigo}")
	public void borrarVideojuego(@PathVariable(name="codigo") Long id) {
		videojuegoServiceImpl.borrarVideojuego(id);
	}
}