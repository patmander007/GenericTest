package com.generic.test.cons;

import java.util.ArrayList;
import java.util.List;

public class Violations {

	private List<Violation> violations;

//	private boolean isViolationFree;

	public Violations() {
		this.violations = new ArrayList<>();
	}
	
	public Violations(List<Violation> violations){
		this.violations = violations;
	}
	
	public List<Violation> getViolations() {
		return violations;
	}

	public void setViolations(List<Violation> violations) {
		this.violations = violations;
	}

	public boolean isViolationFree() {
		return violations.size() > 0;
	}
}