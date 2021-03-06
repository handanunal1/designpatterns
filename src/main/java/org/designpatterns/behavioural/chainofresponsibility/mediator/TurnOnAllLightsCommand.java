package org.designpatterns.behavioural.chainofresponsibility.mediator;

public class TurnOnAllLightsCommand implements Command {

	
	private Mediator med;
	
	
	public TurnOnAllLightsCommand(Mediator med) {
		super();
		this.med = med;
	}


	@Override
	public void execute() {
	
		med.turnOnAllLights();
	}

}
