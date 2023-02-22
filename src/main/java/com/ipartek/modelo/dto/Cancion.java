package com.ipartek.modelo.dto;

public class Cancion {
	private int id;
	private String titulo;
	private String enlace;
	private int fk_usuario;
	
	public Cancion(int id, String titulo, String enlace, int fk_usuario) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.enlace = enlace;
		this.fk_usuario = fk_usuario;
	}
	
	public Cancion() {
		super();
		this.id = 0;
		this.titulo = "";
		this.enlace = "";
		this.fk_usuario = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public int getFk_usuario() {
		return fk_usuario;
	}

	public void setFk_usuario(int fk_usuario) {
		this.fk_usuario = fk_usuario;
	}

	@Override
	public String toString() {
		return "Cancion [id=" + id + ", titulo=" + titulo + ", enlace=" + enlace + ", fk_usuario=" + fk_usuario + "]";
	}
	

}
