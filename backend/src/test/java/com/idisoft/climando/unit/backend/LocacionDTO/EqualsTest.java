package com.idisoft.climando.unit.backend.LocacionDTO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.idisoft.climando.backend.LocacionDTO;


public class EqualsTest {

	private LocacionDTO l1;
	private LocacionDTO l2;
	
	@Before
	public void setUp(){
		l1 = new LocacionDTO("maracaibo","zulia","venezuela");
	}
	
	@Test
	public void Equals_ObjectsEquals_True() {
		l2 = new LocacionDTO("maracaibo","zulia","venezuela");
		assertTrue(l1.equals(l2));
	}
	
	@Test
	public void Equals_DifferentTypes_False(){
		assertFalse(l1.equals(""));
	}
	
	@Test
	public void Equals_CiudadDiferente_False(){
		l2 = new LocacionDTO("ojeda","zulia","venezuela");
		assertFalse(l1.equals(l2));
	}
	
	@Test
	public void Equals_EstadoDiferente_False(){
		l2 = new LocacionDTO("maracaibo","aragua","venezuela");
		assertFalse(l1.equals(l2));
	}
	
	@Test
	public void Equals_PaisDiferente_False(){
		l2 = new LocacionDTO("maracaibo","zulia","colombia");
		assertFalse(l1.equals(l2));
	}

}
