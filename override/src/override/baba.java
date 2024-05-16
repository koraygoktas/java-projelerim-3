package override;

public class baba {

	private String name;
	private String field;
	private int salary;
	
	public baba(String name,String field,int salary)
	{
		this.name=name;
		this.field=field;
		this.salary=salary;
		
	}
	
	public baba(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
		this.field="bilgi yok";
		
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void showInfos(){
		System.out.println("\nbilgiler...\n");
		System.out.println("isim : "+this.name);
		System.out.println("alanı : "+this.field);
		System.out.println("maaşı : "+this.salary);
	}

}
