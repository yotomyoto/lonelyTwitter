package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class lonelyTweetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	private int count;
	
	public lonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	/*public void testFail(){
		fail("This is a failed test");
	}*/
	
	public void testEqual(){
		Date date=new Date(12313);
		NormalTweetModel normal = new NormalTweetModel("test tweet", date);
		NormalTweetModel secondTweet = new NormalTweetModel("test tweet");
		assertFalse("Different Tweets are not equal", normal.equals(secondTweet));
		normal = new NormalTweetModel("test tweet2", date);
		secondTweet = new NormalTweetModel("test tweet", date);
		assertFalse("Different Tweets are not equal", normal.equals(secondTweet));
		normal = new NormalTweetModel("test tweet", date);
		secondTweet = new NormalTweetModel("test tweet", date);
		assertTrue("Similar tweets are not different", normal.equals(secondTweet));
		ImportantTweetModel important = new ImportantTweetModel("test tweet",date);
		assertFalse("Tweets of different type are not equal", important.equals(normal));
	}
	
	public boolean greaterThan(int i, int j)
	{
		if(i>j)
			return true;
		else
			return false;
	}
	
	public void testTrue(){
		assertEquals("They are not Equal", 5,5);
	}
}
