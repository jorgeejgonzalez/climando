package com.idisoft.climando.integration.backend.rest.RestClient;

import static org.junit.Assert.*;

import javax.ws.rs.core.Response;

import org.junit.Before;
import org.junit.Test;

import com.idisoft.climando.backend.rest.RestClient;

public class RealizarSolicitudJSonTest {

	RestClient client;
	
	@Before
	public void setUp(){
		client = new RestClient();		
	}
	
	@Test
	public void RealizarSolicitudJSon_SolicitudValida_NotNull(){
		String url = "http://api.wunderground.com/api/3c460ef202170d02/geolookup/conditions/forecast/q/Australia/Sydney.json";
		String respuesta = client.realizarSolicitudGetJSon(url);
		System.out.println(respuesta);
		assertNotNull(respuesta);		
	}
	
	@Test
	public void RealizarSolicitudJSon_EstatusNotOk_NotNull(){
		String url = "http://api.wunderground";
		String respuesta = client.realizarSolicitudGetJSon(url);
		System.out.println(respuesta);
		assertNull(respuesta);		
	}

}
