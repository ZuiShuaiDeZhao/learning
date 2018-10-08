package com.zhaoyi.demo;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main oopCompareToFP = new Main();
		System.out.println("���������(�������)");
		System.out.println(oopCompareToFP.add(1, 1));
		System.out.println(oopCompareToFP.subtract(1, 1));
		System.out.println(oopCompareToFP.multiply(1, 1));
		System.out.println(oopCompareToFP.divide(1, 1));
		System.out.println("���������(�������)");
		System.out.println("����ʽ���(�����Ϊ)");
		System.out.println(oopCompareToFP.calculate(1, 1, (num1, num2) -> num1 + num2));
		System.out.println(oopCompareToFP.calculate(1, 1, (num1, num2) -> num1 - num2));
		System.out.println(oopCompareToFP.calculate(1, 1, (num1, num2) -> num1 * num2));
		System.out.println(oopCompareToFP.calculate(1, 1, (num1, num2) -> num1 / num2));
		System.out.println("����ʽ���(�����Ϊ)");
		System.out.println("������ʽ");
		System.out.println(oopCompareToFP.calculate(1, 1, "+"));
		System.out.println(oopCompareToFP.calculate(1, 1, "-"));
		System.out.println(oopCompareToFP.calculate(1, 1, "*"));
		System.out.println(oopCompareToFP.calculate(1, 1, "/"));
		System.out.println("������ʽ");
	}

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int divide(int num1, int num2) {
		return num1 / num2;
	}

	public int calculate(int num1, int num2, BiFunction<Integer, Integer, Integer> biFunction) {
		return biFunction.apply(num1, num2);
	}

	public int calculate(int num1, int num2, String operator) {
		int result = 0;
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("sorry,unknown operator!");
		}
		return result;
	}
}
