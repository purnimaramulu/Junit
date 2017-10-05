package jUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
//import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import org.hamcrest.collection.IsEmptyCollection;
import static org.hamcrest.Matchers.hasProperty;

import com.Junit.Login;
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
	
	@Test
	public void testtruncateAInLast2Positions(){
		assertEquals("CDAA", help.truncateAInFirst2Positions("CDAA"));

	}
	@Test
	public void testNopositions(){
		assertEquals("BCD", help.truncateAInFirst2Positions("ABCD"));

	}
	@Test 
	public void testforareFirstAndLastTwoCharactersTheSame(){
		assertEquals(false,help.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void testfor_NegitiveScenario(){
		assertFalse("THis condition fails",false);
	}
	@Test
	public void testIsItSunny() {
		assertTrue(help.isItSunny());
	}
	
	@Test  
	public void testFindMax(){  
	     System.out.println("test case find max");  
	     assertEquals(4,help.findMax(new int[]{1,3,4,2}));  
	     assertEquals(0,help.findMax(new int[]{-12,-3,-4,-2}));  
	}  

	
	@Test 
	public void Array() {
		String[] expectedOutput = {"one", "two", "three"};
		String[] input = {"one", "two", "three"};
		assertArrayEquals(expectedOutput, input);
	    
	 }
	
	@Test
	public void isBoolean(){
		
		assertTrue(help.isEvenNumber(4));
		assertTrue(help.isOddNumber(3));
		
	}

	@Test
	public void isBooleanFalse(){
		
		assertFalse(help.isEvenNumber(3));
		assertFalse(help.isOddNumber(4));
		
	}
	
	@Test
	public void sameValue(){
		
		assertSame(4,4);
	}
	
	@Test
	public void notSameValue(){
		
		assertNotSame(4,2);
	
	}

	@Test
	public void objectNotNull(){
		
		assertNotNull("Newly created object should not be null", new Object());
	}
	@Test
	public void checkNull(){
		
		assertNull("This should evaluate to null",null);
	}
	
	@Test(expected = ArithmeticException.class)
	public void exceptionTest(){
	    float temp = 5 / 0;
	}
	
	@Test
	public void testEmptyCollection() {
	    Collection collection = new ArrayList();
	    assertNotNull(collection);
	    assertTrue(collection.isEmpty());
	  }
	 
	 @Test
	 public void testAssertList() {
	   
		 List<String> actual = Arrays.asList("a", "b", "c");
	    	
		 List<String> expected = Arrays.asList("a", "b", "c");
	         
		 assertThat(actual, is(expected));
	        
		 assertThat(actual, hasItems("b"));
	         
		 System.out.println(actual.contains(expected));
	        
		 assertThat(actual.size(), is(3));
	        
		 assertThat(actual, contains("a", "b", "c"));
	         
		 assertThat(actual, containsInAnyOrder("c", "b", "a"));
	         
		 assertThat(actual, not(IsEmptyCollection.empty()));
	         
		 assertThat(new ArrayList<>(), IsEmptyCollection.empty());

	    }
	  

	    @Test
	    public void Asserlist() {

	    	List<Login> list = Arrays.asList(
	    	
	    	new Login("purnima", 99),
	    	new Login("puri", 20)
	        
	    	);
	    	      //test equals  
	     assertThat(list, hasItems(
	    	 new Login("purnima", 99),
	    	 new Login("puri", 20)
	    	   
	    	));
      
	    }

}
