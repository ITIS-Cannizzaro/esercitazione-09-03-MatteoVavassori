import java.util.Scanner;

public class vavassorimatteo
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			case 1:
				esercizio();
				break;
			case 2:

				break;
			case 3:

				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println();
		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	static void esercizio()
	{
		double [] a = new double [6];
		for(int i=0; i<a.length; i++) {
			System.out.println("inserire un numero");
			a[i] = in.nextDouble();}
		double [] b = new double [3];
		int k=1;
		int i = 0;
		for(int j=0; j<b.length; j++){
			b[j] = a[i] * a[k];
			i += 2;
			k += 2;
		}
		for(int j=0; j<b.length; j++)
		System.out.println(b[j]);
	}
}
