package throwhatasi;

public class ana {

	public static void main(String[] args) {
		int a=0;
		if(a==0)
		{
			System.out.println("bölen sıfıra eşit olamaz");
			throw new ArithmeticException("exception!!!");
		}
		//throw buraya yazılırsa program hata verir çünkü java o kadar akıllı ki
		// throwun bir koşulun vb bir şeyin içinde olup olmadığını biliyor
		
		System.out.println("kodun devamı");//bura çalışmaz
	}

}
