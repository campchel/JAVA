import java.util.ArrayList;
import java.util.Random;
public class TestPuzzling {
    
	public static void main(String[] args) {
		Puzzling generator = new Puzzling();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    
	}

    
}

