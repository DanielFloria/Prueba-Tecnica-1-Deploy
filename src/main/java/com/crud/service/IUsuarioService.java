package com.crud.service;

import java.util.List;

import com.crud.dto.Usuario;

public interface IUsuarioService {
	public List<Usuario> listarUsuario();
	
	public Usuario guardarUsuario(Usuario usuario);
	
	public Usuario usuarioPorId(Long id);
	
	public Usuario actualizarUsuario(Usuario usuario);
	
	public void borrarUsuario(Long id);
}
