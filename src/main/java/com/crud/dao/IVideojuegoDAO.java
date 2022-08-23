package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Videojuego;

public interface IVideojuegoDAO extends JpaRepository<Videojuego, Long> {

}
