import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Applications {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main (String args[]) {
		HiddenWord puzzle = new HiddenWord("HARPS");
		
		System.out.print("Guess a " + puzzle.getHiddenWord().length() + " letter long word: ");
		String guess = in.nextLine();
		
		while (!guess.equals(puzzle.getHiddenWord())) {
			System.out.println("\nHint:" + puzzle.getHint(guess));
			System.out.print("\nGuess a " + puzzle.getHiddenWord().length() + " letter long word: ");
			guess = in.nextLine();
		}
	}
}