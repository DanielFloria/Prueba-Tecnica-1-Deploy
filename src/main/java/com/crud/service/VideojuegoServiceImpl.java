package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.IVideojuegoDAO;
import com.crud.dto.Videojuego;

@Service
public class VideojuegoServiceImpl implements IVideojuegoService {

	@Autowired
	IVideojuegoDAO iVideojuegoDAO;
	
	
	@Override
	public List<Videojuego> listarVideojuego() {
		return iVideojuegoDAO.findAll();
	}

	@Override
	public Videojuego guardarVideojuego(Videojuego videojuego) {
		return iVideojuegoDAO.save(videojuego);
	}

	@Override
	public Videojuego videojuegoPorId(Long id) {
		return iVideojuegoDAO.findById(id).get();
	}

	@Override
	public Videojuego actualizarVideojuego(Videojuego videojuego) {
		return iVideojuegoDAO.save(videojuego);
	}

	@Override
	public void borrarVideojuego(Long id) {
		iVideojuegoDAO.deleteById(id);
		
	}

}
