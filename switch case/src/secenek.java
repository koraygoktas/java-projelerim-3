import java.util.Scanner;

import javax.xml.transform.Source;

public class secenek {
	public static void main(String[] args) {
		int bakiye=1000;
		int islem;
		System.out.println("1-para göster");
		System.out.println("2-100 lira çek kalan bakiyeyi göster");
		System.out.println("3-tüm parayı çek ve bakiye göster");
		System.out.println("4-100 lira yatır");
		System.out.println("yapmak istediğiniz işlemi seçiniz:");
		Scanner scan =new Scanner(System.in);
		islem= scan.nextInt();
		switch (islem) {
		case 1: {
			System.out.println("hesabınızda "+bakiye+" lira vardır");
			break;
		}
		case 2: {
			bakiye-=100;
			System.out.println("hesabınızda "+bakiye+" lira vardır");
			break;
		}
		case 3: {
			bakiye-=bakiye;
			System.out.println("hesabınızda "+bakiye+" lira vardır");
			break;
		}
		case 4: {
			bakiye+=100;
			System.out.println("hesabınızda "+bakiye+" lira vardır");
			break;
		}
		default:
			System.out.println("geçersiz bakiye");
			break;
		}
	}
}
