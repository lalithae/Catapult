package ham;
import java.util.Scanner;

public class CatapultController {

	public static void main(String[] args) {

		ICatapult mc = new MyCatapult();
		ICatapult ec = new EnemyCatapult();
	    IAmmo ammo = new Ammo();
	    Scanner input = new Scanner(System.in);
	    

	    System.out.println("Pleas Set type of Ammo: \n -wood \n -stone \n -motar");
		String ammoType = input.nextLine();
		ammo.create(ammoType);
		System.out.println("Pleas Set the angle of the catapult");
		float angle = input.nextFloat();
		mc.setAngle(angle);

		for(int i = 1 ; ec.getCurHealth() >= 0; i++){
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("attack number :"+ i);
				System.out.println("Hold angle at:"+ mc.getAngle());
				
				mc.setIsLoaded(true);
				mc.fire();
				ec.setdamage(ec.getCurHealth(), ec.getCurArmor(), ammo.getDamage());	
				mc.didHit();
				if(ec.getCurHealth()>=0){
					mc.reload();
				}
				System.out.println("------------------------------------------------------------------------------------------------");
			
		}
		System.out.println("You have distroyed enemy catapult");
		
		
	}

}
