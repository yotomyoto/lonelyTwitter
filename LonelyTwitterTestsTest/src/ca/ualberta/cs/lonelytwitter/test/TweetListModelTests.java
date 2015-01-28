package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TwitterListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListModelTests extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListModelTests() {
		super(LonelyTwitterActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void tweetsListsInitailisation(){
		TwitterListModel tweets = new TwitterListModel();
		assertNotNull("Is my arraylist not initialised?", tweets);
	}
	
	public void testListCount(){
		TwitterListModel tweets= new TwitterListModel();
		NormalTweetModel tweet = new NormalTweetModel("hi");
		tweets.addTweet(tweet);
		assertEquals("Added a tweet", 1, tweets.getListLength());
		
	}
}
