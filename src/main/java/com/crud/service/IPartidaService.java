package com.crud.service;

import java.util.List;

import com.crud.dto.Partida;

public interface IPartidaService {
	public List<Partida> listarPartida();
	
	public Partida guardarPartida(Partida partida);
	
	public Partida partidaPorId(Long id);
	
	public Partida actualizarPartida(Partida partida);
	
	public void borrarPartida(Long id);
}
