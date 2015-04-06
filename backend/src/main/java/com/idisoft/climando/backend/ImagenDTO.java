package com.idisoft.climando.backend;

import com.idisoft.climando.model.Imagen;

public class ImagenDTO implements Imagen {
	
	private String url;
	private String titulo;
	private String enlace;
	
	private ImagenDTO(final String url, final String titulo, final String enlace){
		this.url = url;
		this.titulo = titulo;
		this.enlace = enlace;
		
	}

	@Override
	public String getURL() {
		return url;
	}

	@Override
	public String getTitulo() {
		return titulo;
	}

	@Override
	public String getEnlance() {
		return enlace;
	}

}
