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
	
	public String tostring() {
		return "serialized object";
	}
	
	public String hashcode() {
		return "abja6vuyvd8vbshdjusd76svdy";
	}
	
	public boolean equal() {
		return false;
	}
	
}
