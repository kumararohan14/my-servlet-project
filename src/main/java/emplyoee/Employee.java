 package emplyoee;

public class Employee {
	private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String nic;
    private String username;
    private String password;
    private String gender;
    private String accountStatus;
	
   
    

	public Employee(String firstName, String lastName, String email, String nic, String username, String password,String gender, String accountStatus) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nic = nic;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.accountStatus = accountStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}
	
	
	
    
    

}
