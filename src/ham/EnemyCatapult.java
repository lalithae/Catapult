package ham;

public class EnemyCatapult extends Catapult implements Inflamable{

	@Override
	public boolean setInflamable(boolean inflamable) {
		// TODO Auto-generated method stub
		
		if(inflamable == true){
			System.out.println("you cant burn this,yo!");
			return this.inflamable;
		}else{
			System.out.println("you can burn this");
			return this.inflamable;
			}
		
	}

}
 