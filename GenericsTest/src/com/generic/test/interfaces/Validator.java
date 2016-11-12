package com.generic.test.interfaces;

import com.generic.test.cons.Violations;

public interface Validator<T> {

	public Violations validate(T ob);
	
}
