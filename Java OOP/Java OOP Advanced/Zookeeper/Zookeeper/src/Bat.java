public class Bat extends Mammal{
	public int energyLevel = 300;
	
	public void fly() {
		System.out.println("We fly!");
		this.energyLevel -=50;
	}
	
	public void eatHumans() {
		System.out.println("Tastes like chicken!");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("Die!");
		this.energyLevel -= 100;
	}
}
