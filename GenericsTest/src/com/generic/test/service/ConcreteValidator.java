package com.generic.test.service;

import com.generic.test.bean.ConcreteDomain;
import com.generic.test.cons.Violations;

public class ConcreteValidator extends BaseDomainValidator<ConcreteDomain> {

	@Override
	public Violations validate(ConcreteDomain ob) {
		Violations violations = new Violations();
		ob.getBaseIntProp();
		ob.getBaseIntProp();
		ob.getConcreteIntProp();
		ob.getConcreteStringProp();
		
		super.validate(ob);
		
		return violations;
	}

}
