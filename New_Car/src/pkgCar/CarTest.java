package pkgCar;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
	
	@Test
	public void TestPayment() {
		
		Car newCar = new Car(35000.0, 0.0, 60, 0.1);
		
		assertEquals(743.65, newCar.monthlyPayment(), 0.1);
		assertEquals(9618.79, newCar.totalInterest(), 0.1);
		
		}
	
	public static void main(String[] args) {
		Car newCar = new Car(35000.0, 0.0, 60, 0.1);
		System.out.println(newCar.monthlyPayment());
		System.out.println(newCar.totalInterest());
	}

	}

