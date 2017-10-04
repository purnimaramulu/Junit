package jUnit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Junit.StringHelper;

public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void BeforeClass(){
		System.out.println("BeforeClass executed first");
	}
	
	@Before
	public void setup(){
		System.out.println("before executed");
	}
	
	@Test
	public void test1() {
		
		System.out.println("test1 executed");

	}
	
	@Test
	public void test2() {
		
		System.out.println("test2 executed");

	}
	
	@After
	public void tearDown() {
		
		System.out.println("After is executed");

	}
	@AfterClass
	public static void AfterClass() {
		
		System.out.println("AfterClass is executed last");

	}
	
	//Arrays.sort method
	
	@Test
	public void Arraysort(){
		int[] arr = {11,2,3};
		
		int[] expected = {2,3,11};
		
		Arrays.sort(arr);
		
		assertArrayEquals(expected,arr);
	}
	
	//handling exceptons
	@Test(expected= NullPointerException.class)
	public void Arraysort_null(){
		int[] arr = null;
		Arrays.sort(arr);
	}
	
	@Test(timeout = 10)
	public void Arraysort_Performance(){
		int[] arr = {1,2,3,4};
		for(int i = 1; i<=100000; i++){
			arr[0] =1;
			Arrays.sort(arr);
			
		}
	
	}
	
}
