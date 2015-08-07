package haminterface;

public class myCatapulty implements Catapulty{

	@Override
	public float setAngle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String fire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setShoot() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String reload() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setIsLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getHit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int damage(int curHealth, int curArmor, int damage) {
		curArmor = curArmor - damage;
		curHealth = curHealth - curArmor;
		if(curHealth >0){
			
			return curHealth;
		}else{
			return 0;
			}
		
	}

}
