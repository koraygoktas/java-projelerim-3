package uml2023;

public class fish extends Animal implements swimmable {
	@Override
	public void swim() {
		System.out.println("fish can swim");
	}
	@Override
	public void move() {
		System.out.println("fish can move");
	}
}
