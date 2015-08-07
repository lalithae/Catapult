package ham;

public class CatapultController {

	public static void main (String [] args){
		
	CatapultConfig cat1 = new Catapult();
	Inflamable cat2 = new EnemyCatapult();
	MyCatapult cat3 = new MyCatapult();
	EnemyCatapult cat4= new EnemyCatapult();
	
//	System.out.println("set angle");
//	System.out.println(cat3.getCurHealth() );
//	cat1.setAngle(30);
//	System.out.println(cat1.getAngle());
//	cat1.fire();
//	cat1.setShoot(true);
//	cat1.isHit(cat1.setRandom());
//	
//	System.out.println("..........");
//	cat1.reload();
//	cat1.setIsLoaded(true);
//	System.out.println("Re-loaded!!");
//	cat1.didHit();
//	cat2.setInflamable(true);
	System.out.println(cat3.getCurHealth() );
	System.out.println(cat3.getCurArmor() );
	
//	cat3.setdamage(cat3.getCurHealth(),cat3.getCurArmor(),50);
//	cat3.setCurHealth(cat3.getCurHealth());
//	cat3.setCurArmor(cat3.getCurArmor());
//	cat3.setAngle(500);
//	System.out.println(cat3.getAngle());
	System.out.println(cat3.getCurHealth() );
	System.out.println(cat3.getCurArmor() );
	cat3.setdamage(cat3.getCurHealth(),cat3.getCurArmor(),10);
	
	cat3.setdamage(cat3.getCurHealth(),cat3.getCurArmor(),50);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* My definition 
	 * use case is the documentations of interactions between user("actor") and the system that maps out how the user arrives at his/her intended goals, 
	 * it also shows how the sequence of information is handled by the system in negative ways.
	 * 
	 * 
	 * use case is document on how the user intends to use the system 
	   and how the sequence of information is handled by the system 
	   in both positive and negative ways.
	 * 
	 * 
	 * 
	 * */
	
	/*google 
	 * A use case is a methodology used in system analysis to identify, clarify, and organize system requirements.
	 * 
	 * 
	 * */
	
	
		
		
	}
}
