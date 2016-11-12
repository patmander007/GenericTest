package com.generic.test.sample;

public class NumericFxns<T extends Number> {
	private T num;

	public NumericFxns(T n) {
		num = n;
	}

	
	public double fraction(){
		return num.doubleValue() - num.intValue();
	}
	
	public double reciprocal(){
		return 1/num.doubleValue();
	}
}
