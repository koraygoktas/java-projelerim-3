
public class metod {

	public static void main(String[] args) {
		String s1="koray";
		String s2= new String("koray") ;
		String s3= new String("koray");
		String s4="gülşah";
		System.out.println(s2.length());
		System.out.println("3. indeksteki karakter:"+s2.charAt(3));
		System.out.println("son karakter:"+s2.charAt(s2.length()-1));
		System.out.println(s2.startsWith("ko"));
		System.out.println(s2.endsWith("ay"));
		if(s1==s3) {
			System.out.println("eşit");
		}
		else {
			System.out.println("değil");
		}
		if(s1.equals(s3))
		{
			System.out.println("eşittt");
		}
		if(s1==s4) {
			System.out.println("eşitmiş");
		}
		else {
			System.out.println("değilmiş");
		}
		if(s2.equals(s3))
			System.out.println("tabi eşit");
		else
			System.out.println("tabi değil");
		if(s2==s3)
			System.out.println("tabi eşit");
		else
			System.out.println("tabi değil");
		s2=s3;
		if(s2==s3)
			System.out.println("tabi eşit");
		else
			System.out.println("tabi değil");
		//eğer s2 yi mesela s1 gibi oluştursaydık ikisi de bellekte 
		//aynı yeri gösterirlerdi ama s2 ile s3 mesela bellekte farklı
		//yerleri gösteriyorlar
	}

}
