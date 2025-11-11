package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class CarsList {

	String make;
	int price;

	CarsList(String make, int price) {
		this.make = make;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Brand: " + make + ", Price: " + price;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<CarsList> Cars = new ArrayList<>();
		Cars.add(new CarsList("Hyundai", 1000000));
		Cars.add(new CarsList("BMW", 2000000));
		Cars.add(new CarsList("Maruti", 500000));

		for (CarsList car : Cars) {
			System.out.println(car);
		}
	}
}
