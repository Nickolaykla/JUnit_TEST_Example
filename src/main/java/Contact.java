public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
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
        if(this.firstName.isBlank()) {
            throw new RuntimeException("First name cannot be empty");
        }
    }
    public void validateLastName() {
        if(this.lastName.isBlank()) {
            throw new RuntimeException("Last name cannot be empty");
        }
    }
    public void validatePhoneNumber() {
        if (this.phoneNumber.isBlank()) {
            throw new RuntimeException("Phonenumber cannot be empty");
        }
        if(this.phoneNumber.length() != 12) {
            throw new RuntimeException("Number should be 12 digits long");
        }
        if(!this.phoneNumber.matches("\\d+")) {
            throw new RuntimeException("Number should contain only digits");
        }
        if(!this.phoneNumber.startsWith("3")) {
            throw new RuntimeException("Number should start with 3");
        }
    }
}

