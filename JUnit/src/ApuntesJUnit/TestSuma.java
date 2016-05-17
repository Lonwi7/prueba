package ApuntesJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSuma {
	Suma obj= new Suma();
	Suma obj1=new Suma();
	@Test
	public void testSuma() {
		double resultado=obj.suma(5, 7);
		assertEquals("Resultado esperado: 12", 12,resultado,0.1);
		
	}
	@Test
	public void testIncrementa(){
		double resultado2=obj1.incrementar(5);
		assertEquals("Resultao esperado: 6", 17, resultado2,0.1);
	}

}
