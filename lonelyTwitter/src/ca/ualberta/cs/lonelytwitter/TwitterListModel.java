package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

public class TwitterListModel {
	
	private ArrayList<LonelyTweetModel> tweets;
	private int count;
	
	public TwitterListModel(){
		count=0;
		tweets= new ArrayList<LonelyTweetModel>();
		}
	
	public int getListLength(){
		return count;
	}
	
	public void addTweet(LonelyTweetModel tweet){
		if(hasTweet(tweet)){
			throw new IllegalArgumentException();
		}
		tweets.add(tweet);
		count++;
	}

	/*not done
	public LonelyTweetModel[] gettweets(){
	}
	*/
	
	public boolean hasTweet(LonelyTweetModel tweet){
		return tweets.contains(tweet);
	}
	
	public void removeTweet(LonelyTweetModel tweet){
		tweets.remove(tweet);
	}
}
