package co.udea.edu.empresariales.romanconverter;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanConverterTest {

	RomanConverter romanConverter = new RomanConverter();

	@Test
	public void invalidNumberZero() {
		String result = this.romanConverter.convertNumber(0);
		assertEquals("INVALID NUMBER", result);
	}

	@Test
	public void invalidNumberGreaterThanOneThousand() {
		String result = this.romanConverter.convertNumber(1001);
		assertEquals("INVALID NUMBER", result);
	}

	@Test
	public void lessThanThree() {
		String result = this.romanConverter.convertNumber(3);
		assertEquals("III", result);
	}

	@Test
	public void four() {
		String result = this.romanConverter.convertNumber(4);
		assertEquals("IV", result);
	}

	@Test
	public void five() {
		String result = this.romanConverter.convertNumber(5);
		assertEquals("V", result);
	}

	@Test
	public void eight() {
		String result = this.romanConverter.convertNumber(8);
		assertEquals("VIII", result);
	}

	@Test
	public void nine() {
		String result = this.romanConverter.convertNumber(9);
		assertEquals("IX", result);
	}

	@Test
	public void betweenTenAndOneHundred() {
		String result = this.romanConverter.convertNumber(51);
		assertEquals("LI", result);
	}

	@Test
	public void betweenOneHundredAndFiveHundreed() {
		String result = this.romanConverter.convertNumber(179);
		assertEquals("CLXXIX", result);
	}
	
	@Test
	public void betweenFiveHundredAndOneThousand() {
		String result = this.romanConverter.convertNumber(933);
		assertEquals("CMXXXIII", result);
	}
}
