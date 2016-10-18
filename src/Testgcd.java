import static org.junit.Assert.*;

import org.junit.Test;


public class Testgcd {

	@Test
	public void test() {
		 	assertEquals(3, Gdc.solve_gdc(6, 15));
	      	assertEquals(42, Gdc.solve_gdc(42, 42));
	        assertEquals(1, Gdc.solve_gdc(97, 23));
	        assertEquals(1, Gdc.solve_gdc(1, 8));
	        assertEquals(20, Gdc.solve_gdc(40, 100));
	        assertEquals(2, Gdc.solve_gdc(1000, 666));
	}

}
