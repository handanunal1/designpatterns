package org.designpatterns.behavioural.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo {

	public static void main(String[] args) {
		String input = "Lions and tigers and bears!";
		Pattern p = Pattern.compile("(lion|cat|dog|wolf|tiger|bear|Lion)");
		Matcher m = p.matcher( input);
	
	while(m.find()){
		System.out.println("Found a  "+ m.group() + ".");
	}
	}

}
