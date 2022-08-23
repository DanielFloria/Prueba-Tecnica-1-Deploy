package com.crud.service;

import java.util.List;

import com.crud.dto.Videojuego;

public interface IVideojuegoService {

	public List<Videojuego> listarVideojuego();
	
	public Videojuego guardarVideojuego(Videojuego videojuego);
	
	public Videojuego videojuegoPorId(Long id);
	
	public Videojuego actualizarVideojuego(Videojuego videojuego);
	
	public void borrarVideojuego(Long id);
}
