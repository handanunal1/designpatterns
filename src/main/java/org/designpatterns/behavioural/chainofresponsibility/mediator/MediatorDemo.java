package org.designpatterns.behavioural.chainofresponsibility.mediator;

public class MediatorDemo {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Light beddroomLight = new Light ("Bedroom");
		Light kitchenLight = new Light("Kitchen");
		mediator.registerLight(beddroomLight);
		mediator.registerLight(kitchenLight);

		Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
		turnOnAllLightsCommand.execute();
	}

}
