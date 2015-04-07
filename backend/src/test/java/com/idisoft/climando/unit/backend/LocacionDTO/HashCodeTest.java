package com.idisoft.climando.unit.backend.LocacionDTO;

import static org.junit.Assert.*;

import org.junit.Test;

import com.idisoft.climando.backend.LocacionDTO;

public class HashCodeTest {
	
	private LocacionDTO l1;
	private LocacionDTO l2;

	@Test
	public void HashCode_ObjetosIguales_HashIgual() {
		l1 = new LocacionDTO("maracaibo","zulia","venezuela");
		l2 = new LocacionDTO("maracaibo","zulia","venezuela");
		assertEquals(l1.hashCode(), l2.hashCode());
	}
	
	@Test
	public void HashCode_CiudadDiferente_HashDiferente() {
		l1 = new LocacionDTO("maracaibo","zulia","venezuela");
		l2 = new LocacionDTO("ojeda","zulia","venezuela");
		assertNotEquals(l1.hashCode(), l2.hashCode());
	}
	
	@Test
	public void HashCode_EstadoDiferente_HashDiferente() {
		l1 = new LocacionDTO("maracaibo","zulia","venezuela");
		l2 = new LocacionDTO("maracaibo","merida","venezuela");
		assertNotEquals(l1.hashCode(), l2.hashCode());
	}
	
	@Test
	public void HashCode_PaisDiferente_HashDiferente() {
		l1 = new LocacionDTO("maracaibo","zulia","venezuela");
		l2 = new LocacionDTO("maracaibo","zulia","colombia");
		assertNotEquals(l1.hashCode(), l2.hashCode());
	}

}
