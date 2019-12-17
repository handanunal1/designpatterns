package org.designpatterns.behavioural.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String data) {
		super();
		this.data = data;
	}

	public boolean interpret(String context) {

		StringTokenizer st = new StringTokenizer(context);

		while (st.hasMoreElements()) {
			String test = st.nextToken();
			if (test.equals(data)) {
				return true;
			}

		}

		return false;
	}

}
