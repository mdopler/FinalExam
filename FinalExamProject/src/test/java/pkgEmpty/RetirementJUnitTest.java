package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class RetirementJUnitTest {

	@Test
	public void TotalAmountSavedTest() {
		
		Retirement retirement = new Retirement(40, 0.07, 20, 0.02, 10000.0, 2642.0);
		
		assertEquals("1454485.55", String.format("%.2f", retirement.TotalAmountSaved()));
	}
	
	@Test
	public void AmountToSaveTest() {
		
		Retirement retirement = new Retirement(40, 0.07, 20, 0.02, 10000.0, 2642.0);
		
		assertEquals("554.13", String.format("%.2f", Math.abs(retirement.AmountToSave())));
	}

}
