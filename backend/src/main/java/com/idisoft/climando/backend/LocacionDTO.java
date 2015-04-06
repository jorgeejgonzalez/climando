package com.idisoft.climando.backend;

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
	
	@Override
	public boolean equals(Object o){
		boolean check = false;
		if(o instanceof Locacion){
			Locacion comparar = (Locacion) o;
			check = ciudad.equals(comparar.getCiudad()) && estado.equals(comparar.getEstado()) && pais.equals(comparar.getPais());
		}		
		return check;
	}

}
