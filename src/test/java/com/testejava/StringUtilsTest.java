package com.testejava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
public class StringUtilsTest {
	
	@Test
	public void testConcatenate() {
		
		StringUtils util = new StringUtils();
		
		String res = util.concatenate("Comida", "Categoria");
		
		assertArrayEquals("ComidaCategoria", res);
		
	}

	private void assertArrayEquals(String string, String res) {
			
	}
	
}
