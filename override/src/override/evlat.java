package override;

public class evlat extends baba{
	private int yas;
	
	public evlat(String name,String field,int salary,int yas) {
		super(name, field, salary);
		this.yas=yas;

		
	}
	public void raiseSalary(int amount)
	{
		System.out.println("çalışanlara "+amount+" tl zam yapıldı");
	}
	@Override
	public void showInfos() {
		/*System.out.println("\nbilgiler...\n");
		System.out.println("isim : "+getName());
		System.out.println("alanı : "+getField());
		System.out.println("maaşı : "+getSalary());
		System.out.println("yaşı : "+yas);
		bu şekilde kullanabiliriz ama daha pratik bi yolu aşağıda*/
		super.showInfos();
		System.out.println("yaşı : "+yas);
	}

}
