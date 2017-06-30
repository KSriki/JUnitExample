import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {


	@Test
	public void testAddition(){
		Calculator calc = new Calculator();
		assertTrue(calc.handleOperation(42,1,-23)== 19);
		assertTrue(calc.handleOperation(42,1,23)== 65);
		
	}
	
	@Test
	public void testSubtraction(){
		Calculator calc = new Calculator();
		assertTrue(calc.handleOperation(20,2, 52)== -32);
		assertTrue(calc.handleOperation(63,2, 13)== 50);
	
	}
	
	@Test
	public void testDivision() {
		
		Calculator calc = new Calculator();
		assertTrue(calc.handleOperation(120, 4, 10)== 12);
		assertTrue(calc.handleOperation(52, 4, 0)== Double.MAX_VALUE);
		
	}
	
	@Test
	public void testMultiplication(){
		Calculator calc = new Calculator();
		assertTrue(calc.handleOperation(33,3, 3)== 99);
	
	}
	
	@Test
	public void testModulus(){
		Calculator calc = new Calculator();
		assertTrue(calc.handleOperation(100,5, 3) == 1);
		assertTrue(calc.handleOperation(131, 5, 0)== Double.MAX_VALUE);
		
	}

}
