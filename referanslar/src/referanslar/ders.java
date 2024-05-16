package referanslar;

public class ders {

	public static void main(String[] args) {
		ders101 car1= new ders101("kırmızı","megane",4,2012);
		ders101 car2=car1;
		//car2 de car 1 in bellekte gösterdiği objeyi gösteriyor
		car2.showInfos();
		/*ders101 car3= null;
		car3.showInfos();*/
		//bunda bir problem yok çünkü bellekte boş bi yeri tuttuk
		//ama göster dediğimizde zamanlama hatası gösterecektir
		String s1= new String("koray");
		String s2= new String("koray");
		if(s1==s2)
		{
			System.out.println("eşit");
		}
		else {
			System.out.println("eşit değil");
		}
		//yukardaki gibi == ile sorgularsan bunlar bellekte farklı
		//objeleri tuttuğu için eşit değil çıkar
		if(s1.equals(s2))
		{
			System.out.println("eşit");
		}
		else {
			System.out.println("eşit değil");
		}
		//bu şekilde sorgularsak içindeki değerlerin aynı olup olmadığına bakar
	}

}
