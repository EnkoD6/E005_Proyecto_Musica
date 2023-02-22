package com.ipartek.modelo.dto;

public class Usuario {
	private int id;
	private String usuario;
	private String password;
	private int fk_rol;
	
	public Usuario(int id, String usuario, String password, int fk_rol) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.fk_rol = fk_rol;
	}
	
	public Usuario() {
		super();
		this.id = 0;
		this.usuario = "";
		this.password = "";
		this.fk_rol = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFk_rol() {
		return fk_rol;
	}

	public void setFk_rol(int fk_rol) {
		this.fk_rol = fk_rol;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", password=" + password + ", fk_rol=" + fk_rol + "]";
	}

}
