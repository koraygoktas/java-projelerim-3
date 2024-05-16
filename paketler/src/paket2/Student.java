package paket2;

public class Student {//eğer bunu public değil de default yaparsak
	//başka paketlerden çağıramıyoruz import etsek bile
	//sadece kendi paketi içerisinde sınıflarda kullanılabilir oluyor
	//mesela classı public ama study metodunu default yaparsak biz bu classtan obje üretebiliriz
	//ama study metoduna başka paketten erişemeyiz
	
	private String name;
	
	public Student(String name) {
		this.name=name;
	}
	public void study() {
		System.out.println(this.name+" çalışıyor...");
	}
}
