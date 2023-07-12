package mukemmel;
import java.util.Scanner;
public class mukSayi {

	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		int n, toplam=0;
		
		System.out.print("Sayi giriniz: ");
		n = sca.nextInt();
		
		for(int i=1; i<n; i++) 
		{
			if(n%i==0) 
			{
				toplam=toplam+i;
			}
		}
		
		if(n==toplam) 
		{
			System.out.println(n + " mukemmel sayidir.");
		}else {
			System.out.println(n + " mukemmel sayi degildir.");
		}
	}
}