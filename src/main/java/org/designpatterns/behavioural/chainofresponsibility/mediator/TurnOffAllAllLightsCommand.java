package org.designpatterns.behavioural.chainofresponsibility.mediator;

public class TurnOffAllAllLightsCommand implements Command {

	private Mediator med;
	
	
	public TurnOffAllAllLightsCommand(Mediator med) {
		super();
		this.med = med;
	}


	@Override 
	public void execute() {
		med.turnoffAllLights();

	}

}
