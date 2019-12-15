package org.designpatterns.behavioural.command;
// Invoker class
public class Switch {

	public void storeAndExecute(Command command) {
		
			command.execute();
		
		
	}

}
