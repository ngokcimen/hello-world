import java.util.Scanner;

public class IkiKelime
{
	public static void main(String[] args)
	{
		System.out.println("İki kelime giriniz :");
		Scanner keyboard = new Scanner(System.in);
		String kelime1 = keyboard.next();
		String kelime2 = keyboard.next();

		System.out.println(kelime1 + " " + kelime1.length());
		System.out.println(kelime2 + " " + kelime2.length());

		kelime1 = kelime1.toLowerCase();
		kelime2 = kelime2.toLowerCase();

		if(kelime1.equals(kelime2))
		{
			System.out.println("true");
		}else
		{
			System.out.println("false");
		};


	}
}