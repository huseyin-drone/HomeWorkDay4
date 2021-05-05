package objects;

public class Gamer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String emailAdress;
	private String nationalityId;
	private int yearOfBirth;
	private int cardNumber;
	private String userName;
	private int password;
	
	public Gamer(int id, String firstName, String lastName, String emailAdress, String nationalityId, int yearOfBirth,
			int cardNumber, String userName, int password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAdress = emailAdress;
		this.nationalityId = nationalityId;
		this.yearOfBirth = yearOfBirth;
		this.cardNumber = cardNumber;
		this.userName = userName;
		this.password = password;
	}


	public int getCardNumber() {
		return cardNumber;
	}


	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public String getUserName() {
		return userName;
	}

	public int getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	

}
