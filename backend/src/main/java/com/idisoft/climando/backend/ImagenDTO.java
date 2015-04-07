package com.idisoft.climando.backend;

import org.apache.commons.lang.builder.HashCodeBuilder;

import com.idisoft.climando.model.Imagen;

public class ImagenDTO implements Imagen {
	
	private static final int HASH_PRIME_MIN = 47;
	private static final int HASH_PRIME_MAX = 71;
	
	private String url;
	private String titulo;
	private String enlace;
	
	public ImagenDTO(final String url, final String titulo, final String enlace){
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
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Imagen){
			Imagen comparar = (Imagen) o;
			return url.equals(comparar.getURL()) && titulo.equals(comparar.getTitulo()) && enlace.equals(comparar.getEnlance());
		}
		return false;					
	}
	
	@Override
	public int hashCode(){
		return new HashCodeBuilder(HASH_PRIME_MIN,HASH_PRIME_MAX)
				.append(url)
				.append(titulo)
				.append(enlace)
				.toHashCode();
		
	}

}
