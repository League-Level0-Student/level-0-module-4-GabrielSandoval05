package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What kind of pet would you like to buy? We have ancient beasts, doggos, catos, turts, and budgies!");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=0;i<6;i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.

			int task = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Pet Time o(^▽^)o", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Do a trick!", "Give them necessary items for consumption", "Cuddle" }, null);
System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
if(task == 0) {
	trick();
}
if(task == 1) {
	feed();
}
if(task == 2) {
	cuddle();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(happinessLevel == 5) {
	JOptionPane.showMessageDialog(null, "You have sucessfully overloaded your companion's heart with affection (づ｡◕‿‿◕｡)づ");
	break;
}
		}

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void feed() {
		JOptionPane.showMessageDialog(null, "Noise of affection and gratitude");
		happinessLevel++;
	}
	public static void trick() {
		JOptionPane.showMessageDialog(null, "Through telepathy: Do you enjoy my suffering h00man?");
	happinessLevel++;
	}
	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "heartfelt gaze of comfort and affection");
	happinessLevel++;
	}
	
}