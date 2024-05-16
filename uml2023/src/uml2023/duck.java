package uml2023;

public class duck extends Animal implements swimmable,flyable{
	@Override
	public void fly() {
		System.out.println("duck can fly");
	}
	@Override
	public void swim() {
		System.out.println("duck can swim");
	}
	@Override
	void move() {
		System.out.println("duck can move");
	}
}
