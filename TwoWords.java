/* the user enters two words if they enter the same words, it prints true
and prints the length of the word next to the entered two words. If the 
entered words are not the same it prints false and again prints the length 
of the words next to them. Last edited 29.09.17
*/
import java.util.Scanner;

public class TwoWords {
	public static void main(String[] args) {
		System.out.println("Enter two words please :");
		Scanner keyboard = new Scanner(System.in);
		String word1 = keyboard.next(); //entering the words
		String word2 = keyboard.next();

		System.out.println(word1 + " " + word1.length()); //prints the entered words and their lengths
		System.out.println(word2 + " " + word2.length());

		word1 = word1.toLowerCase(); 
		word1 = word2.toLowerCase();/*makes sure there are no issues because of 
		the words entered differently with capital letters */

		if(word1.equals(word2))	{ //checks the words are same or not depending on that prints true or false 
			System.out.println("true");
		}else
		{
			System.out.println("false");
		};


	}
}
