package com.idisoft.climando.unit.backend.ImagenDTO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.idisoft.climando.backend.ImagenDTO;

public class EqualsTest {
	
	private ImagenDTO i1;
	private ImagenDTO i2;
	
	@Before
	public void setUp(){
		i1 = new ImagenDTO("a","b","c");		
	}

	@Test
	public void Equals_ObjetosIguales_True() {
		i2 = new ImagenDTO("a","b","c");
		assertEquals(i1, i2);
	}
	
	@Test
	public void Equals_TiposDiferentes_False(){
		assertNotEquals(i1,"");
	}
	
	@Test
	public void Equals_URLDiferentes_False(){
		i2 = new ImagenDTO("b","b","c");
		assertNotEquals(i1, i2);
	}
	
	@Test
	public void Equals_TitulosDiferentes_False(){
		i2 = new ImagenDTO("a","a","c");
		assertNotEquals(i1, i2);
	}
	
	@Test
	public void Equals_EnlacesDiferentes_False(){
		i2 = new ImagenDTO("a","b","b");
		assertNotEquals(i1, i2);
	}
	
	

}
