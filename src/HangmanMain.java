import words.*;
import java.util.Scanner;

public class HangmanMain 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the level you would like to play: easy, medium or hard: ");
		String level = input.nextLine();
		GenerateWord word = new GenerateWord(level);
		
		//testing
		System.out.println(word.getWord());
	}
}
