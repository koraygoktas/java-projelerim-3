package ;



public class ana {

	public static void main(String[] args) {
		baba cocuk1=new baba("Koray","yazılım",58000);//anne sınıfının constructorı çağırıldı
		//cocuk1 sınıf nesnesi temsilcisi
		cocuk1.showInfos();
		
		evlat cocuk2=new evlat("Gülşah","sosyoloji", 60000,20);
		cocuk2.showInfos();
		
		baba cocuk3=new baba("beşir", 30000);
		cocuk3.showInfos();
		cocuk2.raiseSalary(1000);

	}

}
