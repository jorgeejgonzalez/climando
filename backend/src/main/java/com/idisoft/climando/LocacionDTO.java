package com.idisoft.climando;

import com.idisoft.climando.model.Locacion;

public class LocacionDTO implements Locacion {
	
	private String ciudad;
	private String estado;
	private String pais;
	
	public LocacionDTO(final String ciudad, final String estado, final String pais){
		this.ciudad = ciudad;
		this.estado = estado;
		this.pais = pais;
	}

	@Override
	public String getCiudad() {
		return ciudad;
	}

	@Override
	public String getEstado() {
		return estado;
	}

	@Override
	public String getPais() {
		return pais;
	}

}
