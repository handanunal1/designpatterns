package org.designpatterns.behavioural.iterator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
	
		BikeRepository repo = new BikeRepository();
		repo.addBike("Cervelo");
		repo.addBike("Fuji");
		repo.addBike("Scott");
		
		Iterator <String> bikeIterator = repo.iterator();
		while(bikeIterator.hasNext()) {
			
			System.out.println(bikeIterator.next());
		}

	}

}
