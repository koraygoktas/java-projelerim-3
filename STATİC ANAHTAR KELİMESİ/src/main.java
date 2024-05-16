
public class main {

	public static void deneme() {
		System.out.println("deneme");
	}
	
	public static void main(String[] args) {
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		System.out.println("öğrenci sayısı : "+student1.no_of_students);
		/*mesela üstte oluşturduğumuz 3 nesne temsilcisini yorum
		 * satırı yapsak da printf içinde Student.no_of_students şeklinde
		 * çağırabiliriz çünkü staticler objelere özgü değildir
		 * sadece classa özgüdür.staticler bellekte sadece bir kere oluşur
		 * */
		System.out.println("ogrenci sayısı : "+Student.no_of_students);
		
		System.out.println(Student.deneme());
		
		/*static bir metod yalnızca static olan bir metodu çağırabilir
		 * mesela main static bir metod olduğundan deneme metodunu 
		 * static olarak oluşturmasaydık çağıramayacaktık*/
	}

}
