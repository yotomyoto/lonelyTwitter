package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTwitterModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTwitterModelTest(String name) {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void sampleTest()
	{
		assertTrue("my first number is smaller",greaterThan(5,6));
	}
	
	public boolean greaterThan(int i, int j)
	{
		if(i>j)
			return true;
		else
			return false;
	}

}
