package xask00.study.designpatterns.composite.conditions;

import java.util.ArrayList;
import java.util.List;

public abstract class ConditionComponent {
	
	String operand1;
	String operand2;
	String operator;
	
	List<ConditionComponent> conditions = new ArrayList<>();
	
	public String getOperand1() {
		return operand1;
	}
	public void setOperand1(String operand1) {
		this.operand1 = operand1;
	}
	
	public String getOperand2() {
		return operand2;
	}
	public void setOperand2(String operand2) {
		this.operand2 = operand2;
	}
	
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public abstract String toString();
	
	public String print() {
		return new StringBuilder().append("(")
				.append(operand1)
				.append(" ").append(operator).append(" ")
				.append(operand2)
				.append(")").toString();
	}

}
