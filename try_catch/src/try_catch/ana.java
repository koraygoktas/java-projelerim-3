package try_catch;

import java.util.Scanner;

public class ana {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		/*
		System.out.println("program başladı");
		int a=1;
		try {
			a=2/0;
			System.out.println("okumaz burayı çünkü üstte hata yakaladı");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(a);
		System.out.println("program bitti");
		*/
		
		int[] arr=new int[3];
		try {
			arr[3]=10;
			//4.indise yani olmayan bir indise deger vermeye çalıştık
			//mesela üstte bir hata yok o zaman ondan sonra gelecek şeyleri de kontrol eder
			//mesela ondan sonra bir hata varsa onun hata adını da ilk catchin son parantezinin
			//yanına bir catch oluşturarak kontrol ettirebiliriz
			/*catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e.getMessage());
			}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		şeklinde mesela
			 * */
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());//hatanın sınıfını söyler
			//toString() çağırımında zaten hatanın da ne olduğunu söylüyor
			System.out.println(e.getMessage());//hatanın ne olduğunu söyler
		}
		
		System.out.println("program başladı");
		int a=1;
		try {
			a=2/1;
			System.out.println("bir sayi giriniz : ");
			int b=scanner.nextInt();//mesela buraya string girelim
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {//bu şekilde taradığımız hatalar dışında hata varsa onu buluyor
			System.out.println("bir hata var");
			System.out.println(e.toString());
		}finally {
			System.out.println("bu kısım sona yazılır ve hata olsa da olmasa da çalışır");
		}
		
	}

}
