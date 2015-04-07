package com.idisoft.climando.backend.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;


public class RestClient {
	public String realizarSolicitudGetJSon(final String uri) {
		
		HttpClient cliente = HttpClientBuilder.create().build();
		
		HttpGet solicitud = new HttpGet(uri);
		
		solicitud.addHeader("accept", "application/json");
		try{
			HttpResponse respuesta = cliente.execute(solicitud);
			
			if(respuesta.getStatusLine().getStatusCode() != HttpStatus.SC_OK){
				throw new ClientProtocolException();
			}
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(respuesta.getEntity().getContent()));
			
			String retorno="";
			String linea;
			while((linea = bufferedReader.readLine()) != null)
				retorno+=linea+"\n";
			return retorno;
			
		} catch(ClientProtocolException ex){
			
		} catch(IOException ex){
			
		}
		
		return null;
	}
	


}
