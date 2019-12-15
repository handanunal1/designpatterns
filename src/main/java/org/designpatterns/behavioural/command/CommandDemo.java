package org.designpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
	public static void main(String[] args) {
		Light light = new Light();

		Light bedroomlight = new Light();
		Light kitchenLight = new Light();

		Switch lightSwitch = new Switch();

		Command onCommand = new OnCommand(light);
		Command toggleCommand = new ToggleCommand(light);
//	lightSwitch.storeAndExecute(onCommand);

//	lightSwitch.storeAndExecute(toggleCommand);
//	lightSwitch.storeAndExecute(toggleCommand);
//	lightSwitch.storeAndExecute(toggleCommand);

		List<Light> lights = new ArrayList<Light>();
		lights.add(kitchenLight);
		lights.add(bedroomlight);
		Command allLightsCommand = new AllLightsCommand(lights);
	
		toggleCommand = new ToggleCommand(bedroomlight);
		
		lightSwitch.storeAndExecute(toggleCommand);
		lightSwitch.storeAndExecute(allLightsCommand);
	}
}
