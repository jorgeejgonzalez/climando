package com.idisoft.climando.unit.backend.ObservacionDTO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.idisoft.climando.backend.ImagenDTO;
import com.idisoft.climando.backend.LocacionDTO;
import com.idisoft.climando.backend.ObservacionDTO;

public class HashCodeTest {

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
	public void HashCode_ObjetosIguales_HashIgual(){
		o2 = new ObservacionDTO(new LocacionDTO("maracaibo","zulia","venezuela"),
				new ImagenDTO("a", "b", "c"), 
				new ImagenDTO("c", "b", "a"), 
				"0", "0%", "0", "hoy");
		assertEquals(o1.hashCode(), o2.hashCode());
	}
	
	@Test
	public void HashCode_LocacionesDiferentes_HashDiferentes(){
		o2 = new ObservacionDTO(new LocacionDTO("maracaiboo","zulia","venezuela"),
				new ImagenDTO("a", "b", "c"), 
				new ImagenDTO("c", "b", "a"), 
				"0", "0%", "0", "hoy");
		assertNotEquals(o1.hashCode(), o2.hashCode());
	}
	
	@Test
	public void HashCode_ImagenesPrincipalesDiferentes_HashDiferentes(){
		o2 = new ObservacionDTO(new LocacionDTO("maracaibo","zulia","venezuela"),
				new ImagenDTO("a", "a", "c"), 
				new ImagenDTO("c", "b", "a"), 
				"0", "0%", "0", "hoy");
		assertNotEquals(o1.hashCode(), o2.hashCode());
	}
	
	@Test
	public void HashCode_IconosDiferentes_HashDiferentes(){
		o2 = new ObservacionDTO(new LocacionDTO("maracaibo","zulia","venezuela"),
				new ImagenDTO("a", "b", "c"), 
				new ImagenDTO("c", "c", "a"), 
				"0", "0%", "0", "hoy");
		assertNotEquals(o1.hashCode(), o2.hashCode());
	}
	
	@Test
	public void HashCode_TemperaturasDiferentes_HashDiferentes(){
		o2 = new ObservacionDTO(new LocacionDTO("maracaibo","zulia","venezuela"),
				new ImagenDTO("a", "b", "c"), 
				new ImagenDTO("c", "b", "a"), 
				"1", "0%", "0", "hoy");
		assertNotEquals(o1.hashCode(), o2.hashCode());
	}
	
	@Test
	public void HashCode_HumedadDiferentes_HashDiferentes(){
		o2 = new ObservacionDTO(new LocacionDTO("maracaibo","zulia","venezuela"),
				new ImagenDTO("a", "b", "c"), 
				new ImagenDTO("c", "b", "a"), 
				"0", "1%", "0", "hoy");
		assertNotEquals(o1.hashCode(), o2.hashCode());
	}
	
	@Test
	public void HashCode_SensacionesTermicasDiferentes_HashDiferentes(){
		o2 = new ObservacionDTO(new LocacionDTO("maracaibo","zulia","venezuela"),
				new ImagenDTO("a", "b", "c"), 
				new ImagenDTO("c", "b", "a"), 
				"0", "0%", "1", "hoy");
		assertNotEquals(o1.hashCode(), o2.hashCode());
	}
	
	@Test
	public void HashCode_FechasDiferentes_HashDiferentes(){
		o2 = new ObservacionDTO(new LocacionDTO("maracaibo","zulia","venezuela"),
				new ImagenDTO("a", "b", "c"), 
				new ImagenDTO("c", "b", "a"), 
				"0", "0%", "0", "mañana");
		assertNotEquals(o1.hashCode(), o2.hashCode());
	}

}
