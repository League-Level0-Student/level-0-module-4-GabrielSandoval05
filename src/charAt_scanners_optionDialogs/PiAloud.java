package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.io.IOException;
import java.util.Scanner;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
	// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.
String pi = "3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964428810975665933446128475648233786783165271201909145648566923460348610454326648213393607260249141273724587006606315588174881520920962829254091715";
	// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
System.out.println(pi.charAt(200));
System.out.println(pi.charAt(100));

	// 4. Print ALL the digits of of Pi (hint: use a loop)
for (int i = 0; i <499 ; i++) {
	System.out.println(pi.charAt(i));
	speak(pi.charAt(i));
}
	// 5. Use the speak() method to speak all the digits of Pi.


	// [ADVANCED]
	// *6. Get a character from the user using the getInputFromUser() method
getInputFromUser();
	// *7. Compare the users' char to the next digit of Pi

	// *8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println
	}
	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


