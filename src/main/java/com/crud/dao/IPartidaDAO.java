package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Partida;

public interface IPartidaDAO extends JpaRepository<Partida, Long>{

}
