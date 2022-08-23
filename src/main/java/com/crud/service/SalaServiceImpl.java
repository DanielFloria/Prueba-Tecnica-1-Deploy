package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.ISalaDAO;
import com.crud.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService {

	@Autowired
	ISalaDAO iSalaDAO;
	
	@Override
	public List<Sala> listarSala() {
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaPorId(Long id) {
		return iSalaDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public void borrarSala(Long id) {
		iSalaDAO.deleteById(id);
		
	}

}
