package com.idisoft.climando.backend;

import org.apache.commons.lang.builder.HashCodeBuilder;

import com.idisoft.climando.model.Locacion;

public class LocacionDTO implements Locacion {
	
	private static final int HASH_PRIME_MIN = 17;
	private static final int HASH_PRIME_MAX = 37;
	
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
		if(o instanceof Locacion){
			Locacion comparar = (Locacion) o;
			return ciudad.equals(comparar.getCiudad()) && estado.equals(comparar.getEstado()) && pais.equals(comparar.getPais());
		}		
		return false;
	}
	
	@Override
	public int hashCode(){
		return new HashCodeBuilder(HASH_PRIME_MIN, HASH_PRIME_MAX)
				.append(ciudad)
				.append(estado)
				.append(pais)
				.toHashCode();
	}

}
