package com.daxiafreeman.demoforoffer.demoforoffer;

import junit.framework.TestCase;

public class ExactdivisionUntilTest extends TestCase {
	
	public void testDoExactdivision() {
		//judge the loop 100 times, indicating that the program has no abnormal interruption
		assertEquals(100,new ExactdivisionUntil().doExactdivision());
	}
	public void testDoExactdivisionAddRequirements() {
		//judge the loop 100 times, indicating that the program has no abnormal interruption
		assertEquals(100,new ExactdivisionUntil().doExactdivisionAddRequirements());
	}

}
