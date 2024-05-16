
public class Student {

	public static int no_of_students=0;
	//staticler objelere özgü değildir classlara özgüdür
	public Student() {
		no_of_students++;
	}
	public static String deneme()
	{
		return "statik metod";
	}
}
