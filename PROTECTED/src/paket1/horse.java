package paket1;
import paket2.Animal;
public class horse extends Animal {
	public horse(String name) {
		super(name);
	}
	public void speak() {
		System.out.println(this.name+" gülümsüyor");
	}
}
