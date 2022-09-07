public class SocialAccount {
	private String firstName, lastName, location, phoneNumber, email, profileURl, bio;
	private int age;
	private SocialAccount[] importedFriends;

	public SocialAccount(String firstName, String lastName, int age, String location, String phoneNumber, String email, String profileURl, String bio, SocialAccount[] importedFriends){
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.profileURl = profileURl;
		this.bio = bio;
		this.age = age;
		this.importedFriends = importedFriends;
	}
}
public class SocialAccountBuilder{
	private String firstName, lastName, location, phoneNumber, email, profileURl, bio;
	private int age;
	private SocialAccount[] importedFriends;

	public SocialAccountBuilder(String firstName, String lastName){
		assert firstName != null && lastName != null;
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// returns the social account so you can stack method calls on top 
	public SocialAccountBuilder setAge(int age)						{
		this.age = age;
		return this;
	}

	public SocialAccountBuilder setFirstName(String firstName) 		{
		this.firstName = firstName;
		return this;
	}

	public SocialAccountBuilder setLastName(String lastName) 		{
		this.lastName = lastName;
		return this;
	}

	public SocialAccountBuilder setLocation(String location) 		{
		this.location = location;
		return this;
	}

	public SocialAccountBuilder setPhoneNumber(String phoneNumber) 	{
		this.phoneNumber = phoneNumber;
		return this;
	}

	public SocialAccountBuilder setEmail(String email) 				{
		this.email = email;
		return this;
	}

	public SocialAccountBuilder setProfileURl(String profileURl) 	{
		this.profileURl = profileURl;
		return this;
	}

	public SocialAccountBuilder setBio(String bio) 					{
		this.bio = bio;
		return this;
	}
	
	public SocialAccount build(){
		// anything that hasnt been initialised will be made into null
		return new SocialAccount(firstName, lastName, location, phoneNumber, email, profileURl, bio, age, importedFriends);
	}

	public static void main(String[] args){
		// without the builder it  would be a pain to have all of the constructors like this in order as well
		SocialAccount bill = new SocialAccount("Bill", "Damon", 19, null, "314159265", null, null, "Small bio");
		
		//with the builder it can add everything it needs to without having to memorise where it goes in the constructor
		// you can set what you want wnd avoid everything else
		SocialAccount greg = new SocialAccountBuilder("GREG!", "GREG!")
		.setAge(20)
		.setEmail("greg!@gmail.com")
		.build();
	}
}