/**
 * 
 */
package xask00.study.designpatterns.adapter;

/**
 * @author visna03
 *
 */
public class EmployeeLDAP {
	
	private String cn;
	private String givenName;
	private String surName;
	private String mail;
	
	public EmployeeLDAP(String cn, String givenName, String surName, String mail) {
		this.cn = cn;
		this.givenName = givenName;
		this.surName = surName;
		this.mail = mail;
	}

	public String getCn() {
		return cn;
	}
	
	public void setCn(String cn) {
		this.cn = cn;
	}
	
	public String getGivenName() {
		return givenName;
	}
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String toString() {
		return "[" + this.cn + ", " + this.givenName + ", " + this.surName + ", " + this.mail + "]";
	}
	
}
