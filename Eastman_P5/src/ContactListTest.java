import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ContactListTest {
    ContactList contact = new ContactList();

    @Test
    public void clearClears() throws Exception{
        ArrayList<ContactItem> list = new ArrayList<>();
        ContactItem i = new ContactItem("First", "Last", "000-000-0000", "first@first.com");
        list.add(i);
        list.add(i);
        list.add(i);
        list.clear();

        assertEquals(0, list.size());

    }

    @Test
    public void addingThreeElementsIncreasesSize() throws Exception{
        ArrayList<ContactItem> list = new ArrayList<>();
        ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
        list.add(i);
        list.add(i);
        list.add(i);

        assertEquals(3, list.size());
    }




    @Test
    public void addingContactIncreasesSize() throws Exception{
        ArrayList<ContactItem> list = new ArrayList<>();
        ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
        list.add(i);

        assertEquals(1, list.size());
    }


    @Test
    public void editWorks() throws Exception{
        ArrayList<ContactItem> list = new ArrayList<>();
        ContactItem i = new ContactItem("First", "Last", "000-000-0000","yes@yes.com");
        list.add(i);
        int index = 0;
        ContactItem l = new ContactItem("Last", "First", "333-333-3333", "no@no.com");
        list.set(index, l);
        assertNotEquals(list.add(i), list.set(index, l));
    }

    @Test
    public void validFirstNameReturnsFalseWithInvalidFirstName(){
        assertFalse(contact.validFirstName(""));
    }

    @Test
    public void validFirstNameReturnsTrueWithValidFirstName(){
        assertTrue(contact.validFirstName("First"));
    }

    @Test
    public void validLastNameReturnsFalseWithInvalidLastname(){
        assertFalse(contact.validLastName(""));
    }

    @Test
    public void validLastNameReturnsTrueWithValidLastname(){
        assertTrue(contact.validLastName("Last"));
    }

    @Test
    public void validPhoneNumberReturnsFalseWithInvalidPhoneNumberFormat(){
        assertFalse(contact.validPhoneNumber("00000000000"));
    }

    @Test
    public void validPhoneNumberReturnsFalseWithInvalidPhoneNumber(){
        assertFalse(contact.validPhoneNumber(""));
    }

    @Test
    public void validPhoneNumberReturnsTrueWithValidPhoneNumber(){
        assertTrue(contact.validPhoneNumber("000-000-0000"));
    }

    @Test
    public void validEmailReturnsFalseWithInvalidEmail(){
        assertFalse(contact.validEmail(""));
    }



    @Test
    public void validEmailReturnsTrueWithValidEmail(){
        assertTrue(contact.validEmail("yes@yes.com"));
    }

    @Test
    public void checksForContact() throws Exception{
        ArrayList<ContactItem> contact = new ArrayList<>();
        ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
        String message = "message";
        contact.add(i);
        contact.remove(i);
        if(contact.size() == 0)
            message = "no contact present";
        assertEquals("no contact present", message);
    }










}
