package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TwitterListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListModelTests extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	private TwitterListModel tweets;
	
	public TweetListModelTests() {
		super(LonelyTwitterActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
		tweets = new TwitterListModel();
	}

	public void tweetsListsInitailisation(){
		assertNotNull("Is my arraylist not initialised?", tweets);
	}
	
	public void testListCount(){
		NormalTweetModel tweet = new NormalTweetModel("hi");
		tweets.addTweet(tweet);
		assertEquals("Added a tweet", 1, tweets.getListLength());
		
	}
}
