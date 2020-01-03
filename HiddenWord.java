import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class HiddenWord {
	
	private String hiddenWord;
	
	public HiddenWord(String hiddenWord) {
		this.hiddenWord = hiddenWord.toUpperCase();
	}
	
	public String getHiddenWord() {
		return hiddenWord;
	}
	
	public String getHint(String guess) {
		guess = guess.toUpperCase();
		String hint = "";
		
		for (int i = 0; i < guess.length(); i++) {
			
			if (i == guess.length()) {
				if (hiddenWord.endsWith(guess.substring(i))) {
					hint += guess.substring(i);
				}
			} else {
				if (hiddenWord.substring(i, i + 1).equals(guess.substring(i, i + 1))) {
					hint += guess.substring(i, i + 1);
				} else if (hiddenWord.contains(guess.substring(i, i + 1))) {
					hint += "+";
				} else {
					hint += "*";
				}
			}
		}
		
		return hint;
	}
	
//	public boolean checkGuess(String guess) {
//		if (guess.equals.(this.hiddenWord)) {
//			return true;
//		}
//		return false;
//	}
	
}