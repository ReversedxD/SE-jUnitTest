package jUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AddNumbers {

	@Test
		public void test() {
			jUnitFunctions junit = new jUnitFunctions();
			int result = junit.addnumbers(50, 100);
			assertEquals (150, result);
	}

}
