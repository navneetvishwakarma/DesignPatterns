package xask00.study.designpatterns.composite.conditions;

public class ConditionItem extends ConditionComponent {
	
	public ConditionItem(String operand1, String operator, String operand2) {
		this.operand1 = operand1;
		this.operator = operator;
		this.operand2 = operand2;
	}

	@Override
	public String toString() {
		return this.print();
	}
	
}
