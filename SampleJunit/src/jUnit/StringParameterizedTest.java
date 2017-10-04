package jUnit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.Junit.StringHelper;
@RunWith(Parameterized.class)
public class StringParameterizedTest {
	StringHelper help = new StringHelper();
    
	
	private String input;
	private String expectedOutput;
	
	@Parameters
	public static Collection<String[]> Parameters(){
		
		String expectedOutputs[][]= {{"AACD","CD"}, {"ACD","CD"}};
		
		
		return Arrays.asList(expectedOutputs);
		}

	@Test
	public void testtruncateAInFirst2Positions() {
		
		assertEquals(expectedOutput, help.truncateAInFirst2Positions(input));

		}
	public StringParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
		}

	@Test
	public void testtruncateAInFirstPositions(){
		assertEquals(expectedOutput, help.truncateAInFirst2Positions(input));
		
		}
	


}
