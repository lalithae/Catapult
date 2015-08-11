package ham;

public class CatapultController {

	public static void main(String[] args) {

		ICatapult mc = new MyCatapult();
		ICatapult ec = new EnemyCatapult();
		
		String response = ec.isFlamable()?"Yes":"No";
		
		System.out.println("Is, enemy catapult flamable? "+response);
		

	}

}
