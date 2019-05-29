package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
		// 1. Get 2 numbers from the user and convert them to integer.
String answer = JOptionPane.showInputDialog("Enter a different number pls");
int numbers = Integer.parseInt(answer);
String response = JOptionPane.showInputDialog("Another number pls -_-");
int memes = Integer.parseInt(response);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What operation?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if(operation == 0) {
		add(numbers,memes);
}
if(operation == 1) {
subtract(numbers,memes);
}
if(operation == 2) {
multiply(numbers,memes);
}
if(operation == 3) {
divide(numbers,memes);
}
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	public static void add(int num1, int num2) {
		JOptionPane.showMessageDialog(null, "The equation is " + num1 + "+" + num2 + "=" +(num1+num2));
	}
	public static void subtract(int num1, int num2) {
		JOptionPane.showMessageDialog(null, "The equation is " + num1 + "-" +num2 + "=" +(num1-num2));
	}
	public static void multiply(int num1, int num2) {
		JOptionPane.showMessageDialog(null, "The equation is " + num1 + "*" + num2 + "=" +(num1*num2));
	}
	public static void divide(int num1, int num2) {
		JOptionPane.showMessageDialog(null, "The equation is " +num1 + "/" + num2 + "=" +(num1/num2));
	}

	// 4. Create similar methods for subtraction, multiplication and division.
}
