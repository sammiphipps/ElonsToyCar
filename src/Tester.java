
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EltonsToyCar car = EltonsToyCar.buy(); 
		
		car.distanceDisplay();
		car.batteryDisplay();
		
		car.drive();
		car.drive();
		car.distanceDisplay();
		car.batteryDisplay();
		
		while(car.getBattery() != 0) {
			car.drive();
		}
		
		car.distanceDisplay();
		car.batteryDisplay();
	}

}
