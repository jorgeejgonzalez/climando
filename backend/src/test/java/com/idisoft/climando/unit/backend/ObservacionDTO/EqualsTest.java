package com.idisoft.climando.unit.backend.ObservacionDTO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.idisoft.climando.backend.ImagenDTO;
import com.idisoft.climando.backend.LocacionDTO;
import com.idisoft.climando.backend.ObservacionDTO;

public class EqualsTest {
	
	private ObservacionDTO o1;
	private ObservacionDTO o2;
	
	@Before
	public void setUp(){
		o1 = new ObservacionDTO(new LocacionDTO("maracaibo","zulia","venezuela"),
				new ImagenDTO("a", "b", "c"), 
				new ImagenDTO("c", "b", "a"), 
				"0", "0%", "0", "hoy");
	}

	@Test
	public void Equals_ObjetosIguales_True() {
		o2 = new ObservacionDTO(new LocacionDTO("maracaibo","zulia","venezuela"),
				new ImagenDTO("a", "b", "c"), 
				new ImagenDTO("c", "b", "a"), 
				"0", "0%", "0", "hoy");
		assertEquals(o1, o2);
	}
	
	@Test
	public void Equals_TiposDiferentes_False(){
		assertNotEquals(o1, "");
	}
	
	@Test
	public void Equals_LocacionesDiferentes_False(){
		o2 = new ObservacionDTO(new LocacionDTO("ojeda","zulia","venezuela"),
				new ImagenDTO("a", "b", "c"), 
				new ImagenDTO("c", "b", "a"), 
				"0", "0%", "0", "hoy");
		assertNotEquals(o1, o2);
	}
	
	@Test
	public void Equals_FechasDiferentes_False(){
		o2 = new ObservacionDTO(new LocacionDTO("maracaibo","zulia","venezuela"),
				new ImagenDTO("a", "b", "c"), 
				new ImagenDTO("c", "b", "a"), 
				"0", "0%", "0", "mañana");
		assertNotEquals(o1, o2);
	}

}
