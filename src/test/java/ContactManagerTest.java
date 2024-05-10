import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {
//    @AfterAll
//    @AfterEach
//    @Test
//    @BeforeEach
//    @BeforeAll
    @AfterEach
    public  void displayAfterEachStatement(){
        System.out.println("this will be executed every time after each test case gets executed---AfterEach");
    }

    @AfterAll
    public static void displayAfterAllStatements(){
        System.out.println("this will be executed after executing all test cases--AfterAll");
    }

    @BeforeAll
    public static void displayBeforeAllStatements(){
        System.out.println("this will be executed before all the Test cases---BeforeAll");
    }

    @BeforeEach
    public void displayBeforeEachStatement(){
        System.out.println("this will be executed each time before each tests gets executed---BeforeEach");
    }
    @Test
    @DisplayName("ShouldCreateContact")
    public void shouldCreateContact() {
        ContactManager contactmanager = new ContactManager();
        contactmanager.addContact("Narendra", "Modi", "7298923278");
        Assertions.assertFalse(contactmanager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactmanager.getAllContacts().size());
    }

    @Test
    @DisplayName("Should not create contact when first name is null")
    public void shouldThrowRunTimeExceptionWhenFirstNameIsNull() {
        ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class, () -> contactManager.addContact(null, "Bosco", "9876543210"));

    }

    @Test
    @DisplayName("shouldNotCreateContactWhenNumberIsNull")
    public void shouldThrowRuntimeExceptionWhenNumberIsNull(){
        ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class,()-> contactManager.addContact("Mitchel","stark",null));

    }

    @Test
    @DisplayName("Should not create contact when last value is null ")
    public void shouldThrowRunTimeExceptionWhenLastNameIsNull() {
        ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class, () -> contactManager.addContact("Das", null, "8765432109"));

    }

}

