package ham;

public class CatapultController {

	public static void main (String [] args){
		
	Catapult cat = new Catapult();
	System.out.println("set angle");
	
	cat.setAngle(30);
	System.out.println(cat.getAngle());
	cat.fire();
	cat.setShoot(true);
	System.out.println("..........");
	cat.reload();
	cat.setIsLoaded(true);
	System.out.println("Re-loaded!!");
	cat.hit();
	
	/* My definition 
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
