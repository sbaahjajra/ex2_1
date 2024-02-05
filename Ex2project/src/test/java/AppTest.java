


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Ex2project.Ex2project.App;

/**
 * Unit test for simple App
 */
public class AppTest 
{
	@Test
	public void checkmin() {
		String exp_result = "F";
		String result = App.numberToChar(1) ;
		assertEquals(exp_result,result);				
	}
	
	@Test
	public void checkminplos1() {
		String exp_result = "F";
		String result = App.numberToChar(2) ;
		assertEquals(exp_result,result);				
	}
	

	@Test
	public void checknominal() {
		String exp_result = "F";
		String result = App.numberToChar(30) ;
		assertEquals(exp_result,result);				
	}
	@Test
	public void checkmax() {
		String exp_result = "F";
		String result = App.numberToChar(49) ;
		assertEquals(exp_result,result);				
	}
	@Test
	public void checkmaxminos1() {
		String exp_result = "F";
		String result = App.numberToChar(48) ;
		assertEquals(exp_result,result);				
	}

}

