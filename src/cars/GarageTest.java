package cars;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest {

	@Test
	public void firstCarByBrand() {
		Car car1 = new Car("BMW", "42abc75", 750000);
		Car car2 = new Car("Peugeot", "42abc75", 75000);
		Car car3 = new Car("Peugeot", "42abc75", 80000);
		Garage garage = new Garage();
		garage.add(car1);
		garage.add(car2);
		garage.add(car3);
		assertSame(car1, garage.firstCarByBrand("BMW"));
		assertSame(car2, garage.firstCarByBrand("Peugeot"));
	}

	@Test
	public void firstCarByBrand2() {
		Car car = new Car("Truc", "42abc75", 6000);
		Garage garage = new Garage();
		garage.add(car);
		assertNull(garage.firstCarByBrand("Bli"));
	}

	@Test(expected=NullPointerException.class)
	public void testWithNull() {
		Garage garage = new Garage();
		garage.add(null);
		garage.firstCarByBrand("Renault");
	}

	
	@Test
	public void getPrice() {
		Car car1 = new Car("BMW", "42abc75", 750000);
		Car car2 = new Car("Peugeot", "42abc75", 75000);
		Garage garage = new Garage();
		garage.add(car1);
		garage.add(car2);
		assertEquals(car1.getValue() + car2.getValue(), garage.getValue());
	}
	
	@Test
	public void testGetID() {
		Garage garage1 = new Garage();
		Garage garage2 = new Garage();
		assertEquals(garage1.getId(), 1);
		assertEquals(garage2.getId(), 2);
	}

}
