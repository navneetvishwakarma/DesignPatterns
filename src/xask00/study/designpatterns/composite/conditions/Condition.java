package xask00.study.designpatterns.composite.conditions;

/**
 * A complex condition with nested condition expressions
 * @author visna03
 *
 */
public class Condition extends ConditionComponent {
	
	String joiner;
	
	public Condition(String operand1, String operator, String operand2) {
		this.operand1 = operand1;
		this.operator = operator;
		this.operand2 = operand2;
		this.joiner = "or";
	}
	
	public String getJoiner() {
		return joiner;
	}

	public void joinWith(String joiner) {
		this.joiner = joiner;
	}

	public void add(ConditionComponent conditionComp) {
		this.conditions.add(conditionComp);
	}
	
	public ConditionComponent remove(int i) {
		return this.conditions.remove(i);
	}
	
	public ConditionComponent remove(ConditionComponent conditionComp) {
		return this.conditions.remove(conditionComp) ? conditionComp : null;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		sb.append(this.print());
		for (ConditionComponent cc : this.conditions) {
			sb.append(" " + joiner + " ");
			sb.append(cc);
		}
		sb.append(")");
		return sb.toString();
	}

}
