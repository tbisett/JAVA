package com.taylor.calculator1;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.setOperandOne(10.5);
		calc.setOperandTwo(5.2);
		calc.setOperation("+");
		calc.returnOperation();
		System.out.println(calc.getResults());

	}

}
