class Contact:
    def __init__(self, name, phone_number):
        self.name = name
        self.phone_number = phone_number


class AddressBook:
    def __init__(self):
        self.contacts = []

    def addContact(self, name, phone_number):
        contact = Contact(name, phone_number)
        self.contacts.append(contact)

    def editContact(self, index, name, phone_number):
        if index >= 0 and index < len(self.contacts):
            self.contacts[index].name = name
            self.contacts[index].phone_number = phone_number

    def deleteContact(self, index):
        if index >= 0 and index < len(self.contacts):
            del self.contacts[index]

    def displayContacts(self):
        for i, contact in enumerate(self.contacts):
            print(f"{i+1}. {contact.name}, {contact.phone_number}")


def main():
    address_book = AddressBook()
    while True:
        print("1. Add contact\n2. Edit contact\n3. Delete contact\n4. Display contacts\n5. Quit")
        choice = input("Select an option: ")
        if choice == "1":
            name = input("Enter contact name: ")
            phone_number = input("Enter contact phone number: ")
            address_book.addContact(name, phone_number)
        elif choice == "2":
            address_book.displayContacts()
            index = int(input("Enter the number of contact to edit: ")) - 1
            name = input("Enter new contact name: ")
            phone_number = input("Enter new contact phone number: ")
            address_book.editContact(index, name, phone_number)
        elif choice == "3":
            address_book.displayContacts()
            index = int(input("Enter the number of contact to delete: ")) - 1
            address_book.deleteContact(index)
        elif choice == "4":
            address_book.displayContacts()
        elif choice == "5":
            break


def testLifecycle():
    print("Testing address book lifecycle...")
    address_book = AddressBook()
    assert len(address_book.contacts) == 0
    address_book.addContact("Test Name", "111222333")
    assert len(address_book.contacts) == 1
    assert address_book.contacts[0].name == "Test Name"
    assert address_book.contacts[0].phone_number == "111222333"
    address_book.editContact(0, "Modified Name", "999888777")
    assert address_book.contacts[0].name == "Modified Name"
    assert address_book.contacts[0].phone_number == "999888777"
    address_book.deleteContact(0)
    assert len(address_book.contacts) == 0
    print("All tests passed.")


# тест
testLifecycle()

# запуск
main()