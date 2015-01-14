package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public abstract class UserList {
	private ArrayList <User> followers;

	public ArrayList<User> getFollowers() {
		return followers;
	}

	public void setFollowers(ArrayList<User> followers) {
		this.followers = followers;
	}

	public UserList(ArrayList<User> followers) {
		super();
		this.followers = followers;
	}
	
	public UserList() {
		super();
		this.followers = new ArrayList<User>();
	}
	
	public void AddFollower(User follower){
		
	}
}
