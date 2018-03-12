package st.sonar.java.bugs;

public class AccessExpectedField {
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
