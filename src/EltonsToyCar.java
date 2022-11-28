
public class EltonsToyCar {
	private int distance = 0; 
	private int battery = 100; 
	
	public static EltonsToyCar buy() {
		return new EltonsToyCar(); 
	}
	
	public int getDistance() {
		return this.distance; 
	}
	
	public int getBattery() {
		return this.battery; 
	}
	
	public void distanceDisplay() {
		System.out.println("Driven " + this.distance + " meters"); 
	}
	
	public void batteryDisplay() {
		if (this.battery == 0) {
			System.out.println("Battery empty"); 
		} else {
			System.out.println("Battery at " + this.battery + "%"); 	
		}
	}
	
	public void drive() {
		if (this.battery != 0) {
			this.distance += 20; 
			this.battery -= 1; 
		}
	}
	
}
