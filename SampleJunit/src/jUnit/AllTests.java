package jUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ QuickBeforeAfterTest.class, StringHelperTest.class, StringParameterizedTest.class })
public class AllTests {

	
}
