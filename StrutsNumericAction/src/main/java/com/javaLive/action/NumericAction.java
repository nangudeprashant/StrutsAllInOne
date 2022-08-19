package com.javaLive.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class NumericAction extends ActionSupport {
	private int number1, number2;
	private double result;
	// @Override
	/*
	 * public String execute() throws Exception { this.setResult(number1+number2);
	 * return ActionSupport.SUCCESS; }
	 */

	public String add() throws Exception {
		this.setResult(number1 + number2);
		return ActionSupport.SUCCESS;
	}

	public String sub() throws Exception {
		this.setResult(number1 - number2);
		return ActionSupport.SUCCESS;
	}

	public String mul() throws Exception {
		this.setResult(number1 * number2);
		//return ActionSupport.SUCCESS;
		throw new NullPointerException();
	}

	public String div() throws Exception {
		this.setResult(number1 / number2);
		return ActionSupport.SUCCESS;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void validate() {// this method is used to validate the fields of JSP.
		if (this.getNumber1() == 0) {
			addFieldError("number1", "Number1 is required.");
		}

		if (this.getNumber2() == 0) {
			addFieldError("number2", "Number2 is required.");
		}
	}
}