package com.javalec.ex;

public class Calculation {
	private int firstNum;
	private int secondNum;
		
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add()
	{
		System.out.println("add");
		System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
	}
	
	public void substract()
	{
		System.out.println("substract");
		System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
	}
	
	public void multi()
	{
		System.out.println("multi");
		System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
	}
	
	public void divide()
	{
		System.out.println("divide");
		System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
	}
}
