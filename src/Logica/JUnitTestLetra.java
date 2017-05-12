package Logica;

import static org.junit.Assert.*;

import org.junit.Test;

import Logica.CalcularLetra;

public class JUnitTestLetra {


	@Test
	public void devolverLetra(){
		CalcularLetra c = new CalcularLetra("21010117");
		assertEquals('P',c.devolverLetra());
	}
}
