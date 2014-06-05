package ca.bcit.comp2613.a00703441.util;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

import ca.bcit.comp2613.carsales.model.Customer;

public class CustomerUtil {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 100; i++) {
			Random rand = new Random();
			float randUUID = rand.nextFloat();
			String randomString = UUID.randomUUID().toString();
			if (randUUID > 0.001) {
				count++;
			}
			System.out.println(randUUID + ":" + randomString);
		}
		System.out.println("Generated count of numbers > 0.001: " + count);
	}

}