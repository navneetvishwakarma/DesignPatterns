/**
 * 
 */
package xask00.study.designpatterns.adapter;

/**
 * @author visna03
 *
 */
public class EmployeeDB implements Employee {
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	
	

	public EmployeeDB(String id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String getEmail() {
		return this.email;
	}
	
	public String toString() {
		return "[" + this.id + ", " + this.firstName + ", " + this.lastName + ", " + this.email + "]";
	}

}
