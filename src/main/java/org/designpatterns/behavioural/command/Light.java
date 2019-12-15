package org.designpatterns.behavioural.command;

//receiver class
public class Light {
	
	private boolean isOn = false;
	public void toggle() {
		if (isOn) {
			off();
			isOn = false;
		}else {
			on();
			isOn = true;
		}
	}
  public void on() {
	  System.out.println("Light switched on ");
  }
  
  public void off() {
	  System.out.println("Light switched off ");
  }
}