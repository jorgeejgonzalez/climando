package com.idisoft.climando.model;

public interface Observacion {
	
	public Locacion getLocacion();
	public Imagen getImagenPrincipal();	
	public Imagen getIcono();
	public String getTemperatura();
	public String getHumedad();
	public String getSensacionTermica();
	public String getFecha();

}
