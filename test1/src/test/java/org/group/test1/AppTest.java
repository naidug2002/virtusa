package org.group.test1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	
	 @Test
	    public void testMethod() {
	        App tester = new App(); // MyClass is tested

	        // assert statements
	        assertEquals("ten", tester.convert(10));
	        assertEquals("twenty", tester.convert(20));
	        assertEquals("thirty", tester.convert(30));
	        
	     
	    }
	
	
  }
