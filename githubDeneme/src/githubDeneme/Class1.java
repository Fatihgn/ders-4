package githubDeneme;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		System.out.println("*************************");
		System.out.println("Test sinavina hosgeldiniz");
		System.out.println("*************************");
		int cevap1;
		int cevap2;
		int cevap3;
	    int cevap4;
	    int sayacdogru=0;
	    int [] dizi1 =new int[5];
	    dizi1 = new int [] {1,2,3,3,3};
	    
		Scanner sc=new Scanner(System.in);
		int [] dizi = new int[5];
		System.out.println("Birinci Soru=");
		System.out.println("Hangi ülke en çok sera gazı yaymaktadır?");
		System.out.println("1-Cin\n"+"2-Hindistan\n"+"3-Amerika\n"+"4-Japonya\n");
		System.out.println("Cevap = ");
		dizi[0]=sc.nextInt();
		if(dizi[0]==1)
		{
			System.out.println("dogru bildiniz...");
			sayacdogru++;
		}
		else
		{
			System.out.println("yanlis bildiniz...");
			
		}
		System.out.println("Ikinci Soru=");
		System.out.println("Hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?");
		System.out.println("1-Jüpiter\n"+"2-Venüs\n"+"3-Mars\n"+"4-Merkür\n");
		System.out.println("Cevap = ");
		dizi[1]=sc.nextInt();
		if(dizi[1]==2)
		{
			System.out.println("dogru bildiniz...");
			sayacdogru++;
		}
		else
		{
			System.out.println("yanlis bildiniz...");
			
		}
		System.out.println("Ucüncü soru =");
		System.out.println("Hangi tür ampul en az enerjiyi tüketir?");
		System.out.println("1-Akkor Ampul\n"+"2-Halojen Ampul\n"+"3-Kompakt Floresan Ampul\n"+"4-Normal Ampul\n");
		System.out.println("Cevap = ");
		dizi[2]=sc.nextInt();
		if(dizi[2]==3)
		{
			System.out.println("dogru bildiniz...");
			sayacdogru++;
		}
		else
		{
			System.out.println("yanlis bildiniz...");
			
		}
		System.out.println("Dorduncu soru =");
		System.out.println("İklim değişikliği nedeniyle yılda kaç kişi ölmektedir?");
		System.out.println("1-1500\n"+"2-100.000\n"+"3-150.000\n"+"4-500.000\n");
		System.out.println("Cevap = ");
		dizi[3]=sc.nextInt();
		if(dizi[3]==3)
		{
			System.out.println("dogru bildiniz...");
			sayacdogru++;
		}
		else
		{
			System.out.println("yanlis bildiniz...");
			
		}
		System.out.println("Besinci soru =");
		System.out.println("Küresel ısınmaya karşı en savunmasız hayvan hangisidir?");
		System.out.println("1-Kar Leoparı\n"+"2-Kutup Ayısı\n"+"3-Deniz Gergedanı\n"+"4-Tukan\n");
		System.out.println("Cevap = ");
		dizi[4]=sc.nextInt();
		if(dizi[4]==3)
		{
			System.out.println("dogru bildiniz...");
			sayacdogru++;
		}
		else
		{
			System.out.println("yanlis bildiniz...");
			
		}
		System.out.println("***********************");
		for(int i=0;i<5;i++)
		{
			System.out.println("Cevap Anahtari = "+dizi1[i]);
			//1 2 3 3 3
		}
		System.out.println("************************");
		for(int i=0;i<5;i++)
		{
			System.out.println("Senin Cevaplarin = " +dizi[i]);
		}
		switch(sayacdogru){
			case 1:
				System.out.println("Bilgilerini tazeleme zamani");
				break;
			case 2:
				System.out.println("Bilgilerini tazeleme zamani");
				break;
			case 3:
				System.out.println("Bilgilerini tazeleme zamani");
				break;
			case 4:
				System.out.println("Cok iyi");
				break;
			case 5:
				System.out.println("Mukemmeeeeel");
				break;
				
			
		}
		
		
		
		
		
		
		
		

	}

}
