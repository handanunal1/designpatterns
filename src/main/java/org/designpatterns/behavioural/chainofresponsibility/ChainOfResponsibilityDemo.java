package org.designpatterns.behavioural.chainofresponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Director eleni = new Director();
		VP kostas = new VP();
		CEO jeff = new CEO();

		eleni.setSuccessor(kostas);
		kostas.setSuccessor(jeff);

		Request request = new Request(RequestType.CONFERENCE, 500);
		eleni.handleRequest(request);

		request = new Request(RequestType.PURCHASE, 1000);
		eleni.handleRequest(request);

		request = new Request(RequestType.PURCHASE, 1499);
		eleni.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1500);
		eleni.handleRequest(request);
	}

}
