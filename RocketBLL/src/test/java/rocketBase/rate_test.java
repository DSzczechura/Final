package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	@Test
	public void test_get_rate(){
		try {
			assertEquals(RateBLL.getRate(700), 4, 0.01);
		} catch (RateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetPayment() {
		double r = 0.04/12.0;
		double n = 360.0;
		double p = 300000.0;
		double f = 0;
		boolean t = false;
		
		double payment = RateBLL.getPayment(r, n, p, f, t);
		assertEquals(payment, 1432.25, 0.01);
	}
	
	//TODO - RocketBLL rate_test
		//		Check to see if a RateException is thrown if there are no rates for a given
		//		credit score
	
	@Test (expected = RateException.class)
	public void test_rate_exception() throws Exception {
		assertEquals(RateBLL.getRate(700), 0, 0.01);
	}

}
