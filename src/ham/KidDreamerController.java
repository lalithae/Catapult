package ham;

public class KidDreamerController {

	public static void main(String[] args){
				
		KidDreamer kidD = new KidDreamer();
		
		kidD.setSmell("better");
		System.out.println(kidD.getSmell());
		
		kidD.setDamage(10);
		System.out.println(kidD.isDamaged());
		
		kidD.setName("kevin");
		System.out.println(kidD.getName());
		
		kidD.takeADump();
		
	}
	
	
}
