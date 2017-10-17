package cars;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void testGetBrand() {
		Car car  = new Car("BMW", "55abc75", 20000);
		assertEquals("BMW", car.getBrand());
	}

	@Test
	public void testGetValue() {
		Car car  = new Car("Peugeot", "55abc75", 12000);
		assertEquals(12000, car.getValue());
	}

	@Test
	public void testVetuste() {
		Car car  = new Car("Peugeot", "55abc75", 12000, 2);
		assertEquals(10000, car.getValue());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testInvalidValue() {
		new Car("Truc", "55abc75", -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testTooOld() {
		new Car("Peugeot", "55abc75", 12000, 200);
	}

	@Test(expected = NullPointerException.class)
	public void newCarNoBrand() {
		new Car(null, "55abc75", 20000);
	}
	
	@Test(expected = NullPointerException.class)
	public void newCarNoPlate() {
		new Car("bla", null, 20000);
	}
	@Test(expected = NullPointerException.class)
	public void newCarNoBrand2() {
		new Car(null, "55abc75", 20000, 2);
	}
	
	@Test(expected = NullPointerException.class)
	public void newCarNoPlate2() {
		new Car("BM", null, 20000, 2);
	}
}

