package ham;

public class CatapultController {

	public static void main (String [] args){
		
	CatapultConfig cat1 = new Catapult();
	Inflamable cat2 = new EnemyCatapult();
	MyCatapult cat3 = new MyCatapult();
	EnemyCatapult cat4= new EnemyCatapult();
		
	System.out.println("Note:Catapult 2 is Inflamable.");
	cat2.setInflamable(true);
	System.out.println("Game Set!");
		for(int count = 0; count <30; count++){
			
			if( count%2==0 ){
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("********************");
				System.out.println("Catapult 1's Turn" );
				System.out.println("Turn Number:"+ count);
				System.out.println("********************");
				cat3.setIsLoaded(true);
				System.out.println("Set Angle is:");
				cat3.setAngle(cat3.setRandom());
				System.out.println(cat3.getAngle());
				System.out.println("Aim!!");
				cat3.fire();
				cat3.setShoot(true);		
				if(cat3.setRandom()%2==0){
					cat3.didHit();
				cat4.setdamage(cat4.getCurHealth(),cat4.getCurArmor(),cat4.setRandom());
				}else{
					System.out.println(" miss");
				}
				if(cat4.getCurHealth() <= 0){
					System.out.println("+++++++*****<<<<Cataplt 1 is destroyed, Congradulations Catapult 2>>>>*****+++++++ ");
					return;
				}
				cat3.reload();
				cat3.setIsLoaded(true);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			}
			else{
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("********************");
				System.out.println("Catapult 2's Turn");
				System.out.println("Turn Number:"+ count);
				System.out.println("********************");		
				cat4.setIsLoaded(true);
				System.out.println("Set Angle is:");
				cat4.setAngle(cat4.setRandom());
				System.out.println(cat4.getAngle());
				System.out.println("Aim!!");
				cat4.fire();
				cat4.setShoot(true);
				if(cat4.setRandom()%2==0){
					cat4.didHit();
				cat3.setdamage(cat3.getCurHealth(),cat3.getCurArmor(),cat3.setRandom());
				}else{
					System.out.println(" miss");
				}
				if(cat3.getCurHealth() <= 0){
					System.out.println("+++++++*****<<<<Cataplt 1 is destroyed, Congradulations Catapult 2>>>>*****+++++++ ");
					return;
				}
				cat4.reload();
				cat4.setIsLoaded(true);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			}
			
		}

}
	
}


	
	
		
		
