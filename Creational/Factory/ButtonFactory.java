class Button{}

class IOSButton extends Button{ }

class AndroidButton extends Button{ }

// Without Factory
public class ButtonFactory {
	public Button createButton(String os){
		if (os.equals("ios")) {
			return new IOSButton();
		} 
		else {
			return new AndroidButton();
		}
	}
	public static void main(String[] args){
		// Without factory
		Button button1 = os == "ios" ? new IOSButton() : new AndroidButton();
		Button button2 = os == "ios" ? new IOSButton() : new AndroidButton();

		// With Factory
		ButtonFactory factory = new ButtonFactory();
		Button btn1 = factory.createButton(os);
		Button btn2 = factory.createButton(os);
	}
}