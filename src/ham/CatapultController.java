package ham;
import java.util.Scanner;

public class CatapultController {

	public static void main(String[] args) {

		ICatapult mc = new MyCatapult();
		ICatapult ec = new EnemyCatapult();
	
	//	String response = ec.isFlamable()?"Yes":"No";
//		mc.setAngle(90); 
//		mc.getAngle();
//		mc.setAmmoType("Stone");
//		mc.getAmmoType();
//		ec.setAmmoType("wood");
//		ec.getAmmoType();
		
	//	System.out.println("Is, enemy catapult flamable? "+response);
		System.out.println("--------------------------------------------------------------my catapult set up ----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Pleas Set type of Ammo: \n -wood \n -stone \n -motar");
		mc.setAmmoType(mc.getStringInput());
		System.out.println("Pleas Set angle");
	//	
		mc.setAngle(mc.getNumericalInput());
		System.out.println("Angle set to:\n"+ mc.getAngle());
		System.out.println("--------------------------------------------------------------my catapult set up ----------------------------------------------------------------------------------------------------------------------");
		
//		System.out.println("--------------------------------------------------------------Enemy catapult set up ----------------------------------------------------------------------------------------------------------------------");
//		System.out.println("Pleas Set type of Ammo: \n -wood \n -stone \n -motar");
//		ec.setAmmoType(ec.getStringInput());
//		System.out.println("Pleas Set angle");
//	//	
//		ec.setAngle(ec.getNumericalInput());
//		System.out.println("Angle set to:\n"+ ec.getAngle());
//		System.out.println("--------------------------------------------------------------Enemy catapult set up ----------------------------------------------------------------------------------------------------------------------");
//		
		
		System.out.println("Aim!!");
		mc.fire();
		for(int count = 1; ec.getCurHealth() >=0; count++){
			System.out.println("Shoot number:"+ count);
		ec.setdamage(ec.getCurHealth(),ec.getCurArmor(),mc.getDamage());
	
		
		}

		if (mc.getCurHealth() <= 0){
			System.out.println("enemy catapult wins");
		}
		else if(ec.getCurHealth() <= 0 ){
			System.out.println("my catapult wins ");
			
		}
//}
		
		
	}

}
