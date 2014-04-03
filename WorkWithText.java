package laba3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;

public class WorkWithText {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Enter text: ");
		// String text = scan.nextLine();
		String text = ("Among the most exciting new applications of the computer is the ability to bring together information that exists in a variety of forms. New computer tools, often using combinations of hardware and software, are now providing better ways to bring together information that is stored on other media in the form of graphics, sound, and video. ");
		String words[] = { "computer", "sound", "bring", "new" };
		int[] counts = { 0, 0, 0, 0 };
		for (int i = 0; i < words.length; i++) {
			counts[i] = check(text, words[i]);
		}
		output(words, counts);
	}

	public static int check(String text, String word) {
		int count = 0;
		String regex = "[' ^]?" + word + "[^.,:;?!'/ -]?"; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		while (m.find()) {
			count++;

		}
		return count;
	}
	public static void output(String[] words, int[] counts) {
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i] + " " + counts[i]);
		}
	}
}
