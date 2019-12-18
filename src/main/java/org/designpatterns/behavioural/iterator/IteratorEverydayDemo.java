package org.designpatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Bryan");
		names.add("Handan");
		names.add("Arya");
		Iterator<String> namesItr = names.iterator();

		for (String string : names) {
			System.out.println(string);
		}
		
		
		for(int i = 0; i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		while (namesItr.hasNext()) {
			String name = namesItr.next();
			System.out.println(name);
			namesItr.remove();
		}
		System.out.println("Names size:" + names.size());
	}

}
