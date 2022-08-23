package com.crud.service;

import java.util.List;

import com.crud.dto.Sala;

public interface ISalaService {
	public List<Sala> listarSala();
	
	public Sala guardarSala(Sala sala);
	
	public Sala salaPorId(Long id);
	
	public Sala actualizarSala(Sala sala);
	
	public void borrarSala(Long id);
}
