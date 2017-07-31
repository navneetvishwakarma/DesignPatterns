package xask00.study.designpatterns.composite.conditions;

public class ConditionDemo {

	public static void main(String[] args) {
		
		Condition condition = new Condition("owner", "=", "Navneet");
		condition.joinWith("and");
		
		Condition c1 = new Condition("formName", "==", "SR");
		c1.joinWith("or");
		c1.add(new ConditionItem("formName", "==", "Incident"));
		
		condition.add(c1);
		
		Condition c2 = new Condition("priority", ">=", "1");
		c2.joinWith("or");
		c2.add(new ConditionItem("severity", "<", "3"));
		
		condition.add(c2);
		
		System.out.println(condition);
		

	}

}
