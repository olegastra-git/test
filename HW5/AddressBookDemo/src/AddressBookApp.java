import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class AddressBookApp {

    static class Contact {
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    static class AddressBook {
        private List<Contact> contacts;

        public AddressBook() {
            contacts = new ArrayList<>();
        }

        public void addContact(String name, String phoneNumber) {
            Contact contact = new Contact(name, phoneNumber);
            contacts.add(contact);
        }

        public void editContact(int index, String name, String phoneNumber) {
            if (index >= 0 && index < contacts.size()) {
                Contact contact = contacts.get(index);
                contact.setName(name);
                contact.setPhoneNumber(phoneNumber);
            }
        }

        public void deleteContact(int index) {
            if (index >= 0 && index < contacts.size()) {
                contacts.remove(index);
            }
        }

        public List<Contact> getContacts() {
            return contacts;
        }

        public void displayContacts() {
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                System.out.println((i + 1) + ". " + contact.getName() + ", " + contact.getPhoneNumber());
            }
        }
    }

    public static class AddressBookTest {
        @Test
        public void listContactsTest() {
            AddressBook addressBook = new AddressBook();
            addressBook.addContact("Contact 1", "111111111");
            addressBook.addContact("Contact 2", "222222222");

            List<Contact> contacts = addressBook.getContacts();
            Assert.assertEquals(2, contacts.size());
            Assert.assertEquals("Contact 1", contacts.get(0).getName());
            Assert.assertEquals("111111111", contacts.get(0).getPhoneNumber());
            Assert.assertEquals("Contact 2", contacts.get(1).getName());
            Assert.assertEquals("222222222", contacts.get(1).getPhoneNumber());
        }
    }

    public static void main(String[] args) {
    }
}