package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.IPartidaDAO;
import com.crud.dto.Partida;

@Service
public class PartidaServiceImpl implements IPartidaService {

	@Autowired
	IPartidaDAO iPartidaDAO;
	
	
	@Override
	public List<Partida> listarPartida() {
		return iPartidaDAO.findAll();
	}

	@Override
	public Partida guardarPartida(Partida partida) {
		return iPartidaDAO.save(partida);
	}

	@Override
	public Partida partidaPorId(Long id) {
		return iPartidaDAO.findById(id).get();
	}

	@Override
	public Partida actualizarPartida(Partida partida) {
		return iPartidaDAO.save(partida);
	}

	@Override
	public void borrarPartida(Long id) {
		iPartidaDAO.deleteById(id);
		
	}

}
