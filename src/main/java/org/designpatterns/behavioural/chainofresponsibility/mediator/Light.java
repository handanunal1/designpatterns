package org.designpatterns.behavioural.chainofresponsibility.mediator;

public class Light {
	private boolean isOn = false;
	private String location = "";

	public Light() {

	}

	public Light(String location) {
		this.location = location;
	}

	public boolean isOn() {
		return isOn;
	}
	public void toggle() {
		if (isOn) {
			off();
			isOn = false;
		}else {
			on();
			isOn = true;
		}
	}
	private void off() {
		// TODO Auto-generated method stub

	}
	
	  public void on() {
		  System.out.println(location + " Light switched on ");
	  }

}
