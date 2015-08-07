package ham;

public class Character {
	
	private String name;
	private int age;
	private int speed;
	private float height;
	private int health;
    
	public void setName(String name){
		this.name = name;
	
	}  	 
	public String getName(){
		return this.name;
		
	} 	
	
	public void takeADump(){
		System.out.println("this character is taking a dump");
	}
    
 
}
