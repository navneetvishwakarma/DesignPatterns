/**
 * 
 */
package xask00.study.designpatterns.adapter;

/**
 * @author visna03
 *
 */
public class EmployeeAdapterLDAP implements Employee {
	
	private EmployeeLDAP instance;
	
	public EmployeeAdapterLDAP(EmployeeLDAP instance) {
		this.instance = instance;
	}
	
	@Override
	public String getId() {
		return this.instance.getCn();
	}

	@Override
	public String getFirstName() {
		return this.instance.getGivenName();
	}

	@Override
	public String getLastName() {
		return this.instance.getSurName();
	}

	@Override
	public String getEmail() {
		return this.instance.getMail();
	}
	
	public String toString() {
		return "[" + this.getId() + ", " + this.getFirstName() + ", " + this.getLastName() + ", " + this.getEmail() + "]";
	}

}
