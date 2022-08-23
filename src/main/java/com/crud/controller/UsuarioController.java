package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dto.Usuario;
import com.crud.service.UsuarioServiceImpl;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
	
	@PostMapping("/usuarios")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImpl.guardarUsuario(usuario);
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> listarUsuarios() {
		return usuarioServiceImpl.listarUsuario();
	}
	
	@GetMapping("/usuarios/{codigo}")
	public Usuario usuarioPorId(@PathVariable(name="codigo") Long id) {
		Usuario usuarioPorId = new Usuario();
		usuarioPorId = usuarioServiceImpl.usuarioPorId(id);
		
		return usuarioPorId;
	}	
	
	@PutMapping("/usuarios/{codigo}")
	public Usuario actualizarUsuario(@PathVariable(name="codigo") Long id, @RequestBody Usuario usuario) {
		Usuario usuarioSeleccionado = new Usuario();
		Usuario usuarioActualizado = new Usuario();
		
		usuarioSeleccionado = usuarioServiceImpl.usuarioPorId(id);
		
		usuarioSeleccionado.setUsername(usuario.getUsername());
		usuarioSeleccionado.setPassword(usuario.getPassword());
		usuarioSeleccionado.setRole(usuario.getRole());
		usuarioSeleccionado.setSteamUser(usuario.getSteamUser());
		
		usuarioActualizado = usuarioServiceImpl.actualizarUsuario(usuarioSeleccionado);
		
		return usuarioActualizado;
	}
	
	@DeleteMapping("/usuarios/{codigo}")
	public void borrarUsuario(@PathVariable(name="codigo") Long id) {
		usuarioServiceImpl.borrarUsuario(id);
	}
}
