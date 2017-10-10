package jUnit;

import static org.junit.Assert.*;


import static java.lang.System.getProperties;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.naming.NameNotFoundException;

import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.*;
//import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import org.hamcrest.collection.IsEmptyCollection;
import org.hamcrest.collection.IsMapContaining;

import static org.hamcrest.Matchers.hasProperty;
import org.junit.rules.Timeout;

import com.Junit.Login;
import com.Junit.MessageUtil;
import com.Junit.StringHelper;

import jdk.nashorn.internal.ir.annotations.Ignore;

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
	    
	    @Test
	    public void testAssertMap() {
	    	 Map<String, String> map = new HashMap<>();
	         map.put("j", "java");
	         map.put("c", "c++");
	         map.put("p", "python");
	         map.put("n", "node");
	        

	         Map<String, String> expected = new HashMap<>();
	         expected.put("n", "node");
	         expected.put("c", "c++");
	         expected.put("j", "java");
	         expected.put("p", "python");

	        
	        assertThat(map, is(expected));

	        assertThat(map.size(),is(4));
	        
	        assertThat(map, IsMapContaining.hasEntry("n", "node"));
	        
	        assertThat(map, not(IsMapContaining.hasEntry("r", "ruby")));
	        
	        assertThat(map, IsMapContaining.hasKey("j"));
	        
	        assertThat(map, IsMapContaining.hasValue("java"));

	    }
	    
	    @Rule
	    public ExpectedException thrown = ExpectedException.none();
	    
	    @Test
	    public void testDivisionWithException() {

	        thrown.expect(ArithmeticException.class);
	        thrown.expectMessage(containsString("/ by zero"));

	        int i = 1 / 0;

	    }

//	    @Rule
//	    public Timeout globalTimeout = Timeout.seconds(10);
//	    
//	    @Test
//	    public void testSlowMethod() throws InterruptedException {
//	    
//	        TimeUnit.SECONDS.sleep(5000);
//	    }
	   
	    

	    String message = "Purnima";	
	    MessageUtil messageUtil = new MessageUtil(message);
	    	   
	    @Ignore
	    @Test
	    public void testPrintMessage() {
	    	
	    	message = "Purnima";
	    	
	    	
	    	assertEquals(message,messageUtil.printMessage());
	    }

	    @Test
	    public void testSalutationMessage() {
	    	
	    	message = "Hi!" + "Purnima";
	    	
	    	
	    	assertEquals(message,messageUtil.salutationMessage());
	    }
	    		
	    private  OutputStream Content = new ByteArrayOutputStream();

	    @Before
	    public void setUpStreams() {
	        System.setOut(new PrintStream(Content));
	    }
	    
	    @After
	    public void cleanUpStreams() {
	        System.setOut(null);
	    }
	    
	    @Test
	    public void out() {
	        System.out.print("hello");
	        assertEquals("hello", Content.toString());
	    }


}
