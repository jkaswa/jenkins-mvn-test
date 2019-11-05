package com.javahelp.calculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculator {
    // Simple main method performing some calculations.
	public static void main(String[] args) {
		 String exp = "2 + 3 * 5";

	        Expression expression = new ExpressionBuilder(exp).build();
	        double ans = expression.evaluate();
	        System.out.println(ans);
	}

}
