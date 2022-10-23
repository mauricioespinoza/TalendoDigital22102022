package cl.monitor.DemoConsola;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestValidadorCalcComplejo extends ValidadorMargenComplejo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testFallido() {
		fail("Not yet implemented");
	}
	
	@Test
	void testMargenOK() {
		String resultado = Validador(10000.00, 100.00);
		assertEquals("MARGEN OK",resultado);
	}
	@Test
	void testMargenNOK() {
		String resultado = Validador(1.00, 100.00);
		assertEquals("ADVERTENCIA POSIBLE ERROR COSTO",resultado);
	}


}
