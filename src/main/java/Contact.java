public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void validateFirstName() {
        if(this.firstName.isBlank())
            throw new RuntimeException("First name cannot be null");
    }

    public void validatePhoneNumber() {
        if (this.phoneNumber.isBlank())
            throw new RuntimeException("Phone Number cannot be blank  ");
        if (this.phoneNumber.length()!=10)
            throw new RuntimeException("invalid phone number");
        if (!this.phoneNumber.matches("\\d+"))
            throw new RuntimeException("phone number should contain only digits ");
        if (this.phoneNumber.startsWith("0"))
            throw new RuntimeException("phone number never starts with 0");
    }

    public void validateLastName() {
if (this.lastName.isBlank())
    throw new RuntimeException("last name cannot be null");
    }
}
