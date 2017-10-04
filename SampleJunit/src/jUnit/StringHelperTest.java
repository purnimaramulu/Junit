package jUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Junit.StringHelper;

public class StringHelperTest {
	StringHelper help;
	
	@Before
	public void Before(){
	help = new StringHelper();
	
	}
	

	@Test
	public void testtruncateAInFirst2Positions() {
		
		assertEquals("CD", help.truncateAInFirst2Positions("AACD"));

	}
	@Test
	public void testtruncateAInFirstPositions(){
		assertEquals("CD", help.truncateAInFirst2Positions("ACD"));

		
	}
	
	
	
//	@Test
//	public void testtruncateAInLast2Positions(){
//		assertEquals("CDAA", help.truncateAInFirst2Positions("CDAA"));
//
//	}
//	@Test
//	public void testNopositions(){
//		assertEquals("BCD", help.truncateAInFirst2Positions("ABCD"));
//
//	}
//	@Test 
//	public void testforareFirstAndLastTwoCharactersTheSame(){
//		assertEquals(false,help.areFirstAndLastTwoCharactersTheSame("ABCD"));
//	}
//	@Test
//	public void testfor_NegitiveScenario(){
//		assertFalse("THis condition fails",false);
//	}
//	@Test
//	public void testIsItSunny() {
//		assertTrue(help.isItSunny());
//	}

}
