package ca.ualberta.cs.lonelytwitter;

public class Author extends User implements UserLike {

	public Author() {
		super();
	}

	public Author(String name) {
		super(name);
	}

	@Override
	public void setName(String name) {
		this.name=name;
	}
	

}
