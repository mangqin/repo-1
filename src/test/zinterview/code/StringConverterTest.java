package test.zinterview.code;

import static org.junit.Assert.assertEquals;

import java.security.InvalidParameterException;

import org.junit.Test;

import main.zInterview.code.StringConverter;

public class StringConverterTest {
	
	@Test
	public void testConvert() {

	    long v = StringConverter.toLong("998109");
	    assertEquals(v, 998109);

	    v = StringConverter.toLong("-11234");
	    assertEquals(v, -11234);

	    v = StringConverter.toLong("0");
	    assertEquals(v, 0);

	    v = StringConverter.toLong("123,21");
	    assertEquals(v,12321);

	}

	@Test(expected=InvalidParameterException.class)
	public void testInvalidParameterException() {
		StringConverter.toLong("xys9h");
	}

		@Test(expected=InvalidParameterException.class)
	public void testInvalidParameterException2() {
	    StringConverter.toLong("-3355$$");
	}



}
