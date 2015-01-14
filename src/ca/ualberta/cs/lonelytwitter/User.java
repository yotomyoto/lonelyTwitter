package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User {
	protected String name;
	protected FollowerList followers;

	public String getName() {
		return name;
	}

	public abstract void setName(String name) throws IOException;

	public User(String name) {
		super();
		this.name = name;
	}
	
	public User() {
		super();
		this.name="anonymous";
	}

	public FollowerList getFollowers() {
		return followers;
	}

	public void setFollowers(FollowerList followers) {
		this.followers = followers;
	}
	
	
	
}