package ham;

public class EnemyCatapult extends Catapult implements Flamable {

	private boolean flamable;
	
	public EnemyCatapult() {
		
		System.out.println(this+": configured, and ready to go");
		this.setFlamability(false);// every enemy catapult is inflammable, unless specifically set otherwise.
	}

	@Override
	public void setFlamability(boolean flamability) {
		this.flamable = flamability;

	}

	@Override
	public boolean isFlamable() {
		return this.flamable;
	}
	
	

}
