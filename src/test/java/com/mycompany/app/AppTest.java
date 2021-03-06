package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	
	@Test
	public void checkAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(3,4);
		assertSame(result,7);
	}
	@Test
	public void checkSubtract() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(10,4);
		assertSame(result,6);
	}
	
	@Test
	public void checkMultiply() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(10,4);
		assertSame(result,40);
	}
	@Test
	public void checkDivide() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(12,4);
		assertSame(result,3);
	}
	@Test
	public void checkModulo() {
		Calculator calculator = new Calculator();
		int result = calculator.modulo(12,8);
		assertSame(result,4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//
//    @Before
//    public void setUpStreams() {
//        System.setOut(new PrintStream(outContent));
//    }
//
//    @Test
//    public void testAppConstructor() {
//        try {
//            new App();
//        } catch (Exception e) {
//            fail("Construction failed.");
//        }
//    }
//
//    @Test
//    public void testAppMain()
//    {
//        App.main(null);
//        try {
//            assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
//        } catch (AssertionError e) {
//            fail("\"message\" is not \"Hello World!\"");
//        }
//    }
//
//    @After
//    public void cleanUpStreams() {
//        System.setOut(null);
//    }

}
