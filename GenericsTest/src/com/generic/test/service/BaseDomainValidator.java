package com.generic.test.service;

import com.generic.test.bean.BaseDomain;
import com.generic.test.cons.Violations;
import com.generic.test.interfaces.Validator;

public abstract class BaseDomainValidator<T extends BaseDomain> implements Validator<T> {
		@Override
		public Violations validate(T ob) {
			// TODO Auto-generated method stub
			return null;
		}

}
