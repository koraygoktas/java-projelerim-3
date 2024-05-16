package paket1;
//CLASLLARIMIZI SADECE PUBLİC VEYA DEFAULT YAPABİLİRİZ
//PRİVATE VEYA PROTECTED OLAMAZ
import paket2.Animal;

public class main {

	public static void main(String[] args) {
		Animal animal=new Animal("hayvan");
		//System.out.println(animal.name);
		//yazdıramıyoruz çünkü aynı paket içinde değil
		Animal at=new horse("yıldız");
		at.speak();
		
	}

}
