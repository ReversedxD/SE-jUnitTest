package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addstring("Siddharth", "Malhotra");
		assertEquals("SiddharthMalhotra", result);
	}

}
