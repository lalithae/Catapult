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
		System.out.println("Angle set to:\n"+ mc.getAngle());
		
		while(ec.getCurHealth()>=0)
			ec.setdamage(ec.getCurHealth(), ec.getCurArmor(), ammo.getDamage());
	
		
		
		
	}

}
