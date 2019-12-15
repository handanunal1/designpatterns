package org.designpatterns.behavioural.chainofresponsibility;

public class CEO extends Handler{

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEOS can approve anything!");
		
	}

	
	

}
