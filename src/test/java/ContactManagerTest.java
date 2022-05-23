import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ContactManagerTest {

    private ContactManager contactManager;

    @BeforeEach
    public void setup() {
        contactManager = new ContactManager();
    }
    @Test
    public void addingContact() {
        contactManager.addContact("Vasiliy", "Petrov", "375445341232");
        assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1, contactManager.getAllContacts().size());
    }
    @Test
    public void checkIfFirstNameIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact(null, "Petrov", "375445341232");
        });
    }
    @Test
    public void checkIfLastNameisNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact("Vasiliy", null, "375445341232");
        });
    }
    @Test
    public void checkIfNumberIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact("Vasiliy", "Petrov", null);
        });
    }
}
