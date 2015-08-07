package ham;

public class KidDreamer extends Character {

	private String smell;
	private boolean isDamaged;
	private int damageLevel;
	
	public KidDreamer(){
		System.out.println("running");
	}
	
	public void setSmell(String smell){
		this.smell=smell;		
	}
	
	public String getSmell(){
		return this.smell;
	}
	
	public boolean isDamaged(){
		return this.isDamaged;
	}
	
	public void setIsdamaged( boolean isDamaged){
		this.isDamaged = isDamaged;
	}
	
	public void setDamage(int damageLevel){
		this.damageLevel = damageLevel;
		
		this.setIsdamaged(true);
	}
	
	public void takeADump(){
		System.out.println("kid dreamer is taking a dump");
	}
	
	
	
	
}
