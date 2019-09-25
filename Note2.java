package lesson1;

public class Note2 {

	private int id;
	private String name;
	private String secondName;
	private String phoneNumber;

	public Note2(int id, String name, String secondName, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.secondName = secondName;
		this.phoneNumber = phoneNumber;
	}

	public Note2(String name, String secondName, String phoneNumber) {
		this.name = name;
		this.secondName = secondName;
		this.phoneNumber = phoneNumber;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Note2: [" + getId() + " name = " + getName() + ", second name = " + getSecondName() + ", phone number = "
				+ getPhoneNumber() + "]";
	}

}
