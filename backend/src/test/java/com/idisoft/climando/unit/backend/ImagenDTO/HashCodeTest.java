package com.idisoft.climando.unit.backend.ImagenDTO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.idisoft.climando.backend.ImagenDTO;

public class HashCodeTest {

	private ImagenDTO i1;
	private ImagenDTO i2;
	
	@Before
	public void setUp(){
		i1 = new ImagenDTO("a","b","c");		
	}
	
	@Test
	public void HashCode_ObjetosIguales_HashIgual(){
		i2 = new ImagenDTO("a","b","c");
		assertEquals(i1.hashCode(), i2.hashCode());
	}
	
	@Test
	public void HashCode_URLDiferente_HashDiferente(){
		i2 = new ImagenDTO("b","b","c");
		assertNotEquals(i1.hashCode(), i2.hashCode());
	}
	
	@Test
	public void HashCode_TituloDiferente_HashDiferente(){
		i2 = new ImagenDTO("a","a","c");
		assertNotEquals(i1.hashCode(), i2.hashCode());
	}
	
	@Test
	public void HashCode_VinculoDiferente_HashDiferente(){
		i2 = new ImagenDTO("a","b","b");
		assertNotEquals(i1.hashCode(), i2.hashCode());
	}
	
}
