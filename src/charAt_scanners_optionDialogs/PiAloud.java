package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.io.IOException;
import java.util.Scanner;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
	// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.
String pi = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917";
	// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
System.out.println(pi.charAt(200));
System.out.println(pi.charAt(100));

	// 4. Print ALL the digits of of Pi (hint: use a loop)
for (int i = 0; i <346 ; i++) {
	char c = getInputFromUser();
	if(c == pi.charAt(i)) {
		System.out.println("correct!");
	}
	else {
		System.out.println("incorrect, sorry...");
		System.exit(0);
	}
	System.out.println(pi.charAt(i));
	speak(pi.charAt(i));
}
	// 5. Use the speak() method to speak all the digits of Pi.


	// [ADVANCED]
	// *6. Get a character from the user using the getInputFromUser() method
 getInputFromUser();
	// *7. Compare the users' char to the next digit of Pi
//if(getInputFromUser(); =1) {
	//System.out.println("Correct!");
	//}
//else {
	//System.out.println("Incorrect. Sorry");
//}
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


