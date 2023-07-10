
public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("Take that!");
		this.energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("Yummy!");
		this.energyLevel += 10;
	}
	public void climb() {
		System.out.println("Can't catch me!");
		this.energyLevel -= 10;
	}
}
