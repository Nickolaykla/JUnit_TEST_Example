import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {

    Map<String, Contact> contacts = new ConcurrentHashMap<>();

    public Collection<Contact> getAllContacts() {
        return contacts.values();
    }

    public void addContact(String firstName, String lastName, String phoneNumber) {
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        validateContact(contact);
        checkContactExist(contact);
        contacts.put(generateKey(contact), contact);
    }
    public void checkContactExist(Contact contact) {
        if(contacts.containsKey(generateKey(contact)))
            throw new RuntimeException("Contact already exists");
    }
    private void validateContact(Contact contact) {
        contact.validateFirstName();
        contact.validateLastName();
        contact.validatePhoneNumber();
    }
    private String generateKey(Contact contact) {
        return String.format("%s-%s", contact.getFirstName(), contact.getLastName());
    }
}
