package com.taylor.calculator1;

public class Calculator implements java.io.Serializable {
	
	private double operand1;
	private double operand2;
	private String operation;
	private double results;
	private double runOperation;
	
	public Calculator() {
		
	}

	public Calculator(double operand1, double operand2, String operation, double results, double runOperation) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operation = operation;
		this.results = results;
		this.runOperation = runOperation;
	}
	
	public void setOperandOne(double num) {
		operand1 = num;
	}
	
	public void setOperandTwo(double num) {
		operand2 = num;
	}
	
	public void setOperation(String op) {
		operation = op;
		if (operation == "+") {
			runOperation = operand1 + operand2;
		}else {
			runOperation = operand1 - operand2;
		}
		
	}

	
	public void returnOperation() {
		 results = runOperation;
	}
	
	public double getResults() {
		return results;
	}



}
