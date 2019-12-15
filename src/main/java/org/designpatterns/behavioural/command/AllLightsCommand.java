package org.designpatterns.behavioural.command;

import java.util.List;

public class AllLightsCommand implements Command {

	private List<Light> lights;
	
	public AllLightsCommand(List <Light>lights) {
		this.lights = lights;
	}
	
	public void execute() {
	for(Light light : lights) {
		light.toggle();
	}

	}

}