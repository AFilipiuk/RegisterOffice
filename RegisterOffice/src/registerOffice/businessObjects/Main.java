package registerOffice.businessObjects;

import registerOffice.businessObjects.cars.*;
import registerOffice.businessObjects.persons.*;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("Adam");
		Car c1= new PersonCar();
		Car c2 = new TruckCar();
		
		p.getCars().add(c1);
		p.getCars().add(c2);
		
		
		

	}

}
