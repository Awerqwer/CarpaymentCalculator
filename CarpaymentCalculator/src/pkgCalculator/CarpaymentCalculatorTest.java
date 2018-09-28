package pkgCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarpaymentCalculatorTest {

	@Test
	public void monthlyCarPayment_Test1() {

		

		CarPayment c1 = new CarPayment(35000,0,60,0.1);

		double mcp = c1.MP();

		

		assertTrue(Math.abs(mcp-743.65)<0.01);

	}
	@Test

	public void totalInterest_Test1() {

		

		CarPayment c1 = new CarPayment(35000,0,60,0.1);

		double ti = c1.TI();

		

		assertTrue(Math.abs(ti-9618.79)<0.01);
	}

}
