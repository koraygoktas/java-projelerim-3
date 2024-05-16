package paket2;
import paket1.horse;
//mesela a ve b sınıfları var ve a sınıfında protect metod veya değişken varsa b ayı miras alıp
// bu metod ve değişkenlere erişebilir
public class Animal {
	protected String name;//aynı paket içindeki sınıfların buna erişimine izin verir
	
	public Animal(String name) {
		
		this.name=name;
		
	}
	public void speak() {
		System.out.println(this.name+" konuşuyor");
	}
}
