package com.crud.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "role")
	private String role;
	@Column(name = "steam_user")
	private String steamUser;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	private List<Partida> partidas;

	public Usuario() {
		
	}
	
	public Usuario(Long id, String username, String password, String role, String steamUser) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.role= role;
		this.steamUser = steamUser;
	}
	
	
	
	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getSteamUser() {
		return steamUser;
	}
	
	public void setSteamUser(String steamUser) {
		this.steamUser = steamUser;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Partida")
	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
	
}
