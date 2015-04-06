package com.idisoft.climando.backend;

import com.idisoft.climando.model.Imagen;
import com.idisoft.climando.model.Locacion;
import com.idisoft.climando.model.Observacion;

public class ObservacionDTO implements Observacion {
	
	Locacion locacion;
	Imagen imagenPrincipal;
	Imagen icono;
	String temperatura;
	String humedad;
	String sensacionTermica;
	String fecha;	
	
	public ObservacionDTO(final Locacion locacion, final Imagen imagenPrincipal, final Imagen icono,
			final String temperatura, final String humedad, final String sensacionTermica, final String fecha){
		this.locacion = locacion;
		this.imagenPrincipal = imagenPrincipal;
		this.icono = icono;
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.sensacionTermica = sensacionTermica;
		this.fecha = fecha;
	}
	
	@Override
	public Locacion getLocacion() {
		return locacion;
	}

	@Override
	public Imagen getImagenPrincipal() {
		return imagenPrincipal;
	}

	@Override
	public Imagen getIcono() {
		return icono;
	}

	@Override
	public String getTemperatura() {
		return temperatura;
	}

	@Override
	public String getHumedad() {
		return humedad;
	}

	@Override
	public String getSensacionTermica() {
		return sensacionTermica;
	}

	@Override
	public String getFecha() {
		return fecha;
	}

}
