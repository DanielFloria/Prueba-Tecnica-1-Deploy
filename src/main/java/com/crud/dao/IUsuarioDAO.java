package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

}
