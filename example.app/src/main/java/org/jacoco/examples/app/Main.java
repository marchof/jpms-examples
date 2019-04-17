package org.jacoco.examples.app;

import org.jacoco.examples.util.Calculator;

public class Main {

	public static void main(String[] args) {
		System.out.println(ProcessHandle.current().info().commandLine());
		
		System.out.println(Calculator.add(17, 25));
		
		System.out.println(Calculator.class.getModule());
	}

}
