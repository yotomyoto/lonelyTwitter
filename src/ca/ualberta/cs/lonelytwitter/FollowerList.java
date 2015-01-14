package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public abstract class FollowerList extends UserList {
	private ArrayList <User> favorites;

	public ArrayList<User> getFavorites() {
		return favorites;
	}

	public void setFavorites(ArrayList<User> favorites) {
		this.favorites = favorites;
	}
	
}
