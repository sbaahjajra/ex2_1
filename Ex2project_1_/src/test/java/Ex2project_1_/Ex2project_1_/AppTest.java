package Ex2project_1_.Ex2project_1_;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
	//min
	@Test
	public void checkmin() {
		String exp_result = "F";
		String result = App.numberToChar(1) ;
		assertEquals(exp_result,result);				
	}
	
	//min+1
	@Test
	public void checkminplos1() {
		String exp_result = "F";
		String result = App.numberToChar(2) ;
		assertEquals(exp_result,result);				
	}

	//nominal

	@Test
	public void checknominal() {
		String exp_result = "F";
		String result = App.numberToChar(30) ;
		assertEquals(exp_result,result);				
	}
	
	//max
	@Test
	public void checkmax() {
		String exp_result = "F";
		String result = App.numberToChar(49) ;
		assertEquals(exp_result,result);				
	}
	
	//max-1
	@Test
	public void checkmaxminos1() {
		String exp_result = "F";
		String result = App.numberToChar(48) ;
		assertEquals(exp_result,result);				
	}
}
