class HotDog {
	public String bread;
	public boolean ketchup;
	public boolean mustard; 
	public boolean kraut;

	public HotDog(String bread){
		this.bread = bread;
	}

	public HotDog addKetchup() {
		this.ketchup = true;
		return this;
	}

	public HotDog addMustard() {
		this.mustard = true;
		return this;
	}

	public HotDog addKraut() {
		this.kraut = true;
		return this;
	}
}

public class HotDogMaker{
	public static void main(String[] args) {
		HotDog myLunch = new HotDog("gluten free")
		.addKetchup()
		.addMustard()
		.addKraut();
	}
}