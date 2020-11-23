import org.junit.Test;

import java.lang.reflect.Array;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ContactItemTest {
    ContactList list  = new ContactList();

    @Test
    public void constructorFailsWithBlankFirstName() {
        try{
            ContactItem i = new ContactItem("", "yes", "000-000-0000", "yes@yes.com");
            fail();
        }catch(Exception e){
            assertEquals("invalid first name", e.getMessage());
        }
    }

    @Test
    public void editingFailsWithBlankFirstName(){
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String firstName = "";
            String lastName = "Last";
            String phoneNumber = "000-000-0000";
            String email = "yes@yes.com";
            int index = 0;
            list.editContact(index,firstName, lastName, phoneNumber, email);
            fail();

        }catch(Exception e){
            assertEquals("invalid first name", e.getMessage());
        }
    }


    @Test
    public void editingFailsWithInvalidFirstName() {
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String firstName = "first";
            String lastName = "Last";
            String phoneNumber = "000-000-0000";
            String email = "yes@yes.com";
            int index = 0;
            list.editContact(index,firstName, lastName, phoneNumber, email);
            fail();

        }catch(Exception e){
            assertEquals("invalid first name", e.getMessage());
        }
    }

    @Test
    public void editingSucceedsWithValidFirstName() {
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String firstName = "First";
            String lastName = "Last";
            String phoneNumber = "000-000-0000";
            String email = "yes@yes.com";
            int index = 0;
            ContactItem l = new ContactItem(firstName, lastName, phoneNumber, email);
            contact.set(index, l);
            assertEquals("First", contact.get(index).firstName);


        }catch(Exception e){
            fail();
        }

    }













    @Test
    public void constructorFailsWithLowercaseFirstName(){

        try{

            ContactItem i = new ContactItem("first", "last", "000-000-0000", "yes@yes.com" );
            fail();
        }catch(Exception e){
            assertEquals("invalid first name", e.getMessage());
        }
    }

    @Test
    public void constructorSucceedsWithUppercaseFirstName(){
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void constructorFailsWithBlankLastName() {
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "", "000-000-0000", "yes@yes.com");
            contact.add(i);
            fail();
        }catch(Exception e){
            assertEquals("invalid last name", e.getMessage());
        }
    }
    @Test
    public void constructorFailsWithLowercaseLastName() {
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            fail();
        }catch(Exception e){
            assertEquals("invalid last name", e.getMessage());
        }
    }

    @Test
    public void constructorSucceedsWithUppercaseLastName(){
        try {
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);

    }catch(Exception e){
            fail();
        }

    }
    @Test
    public void editingFailsWithBlankLastName(){
        try {
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String lastName = "";
            int index = 0;
            ContactItem l = new ContactItem("First", lastName, "000-000-0000", "yes@yes.com");
            contact.set(index, l);
            fail();
        }catch(Exception e){
            assertEquals("invalid last name", e.getMessage());
        }

    }

    @Test
    public void editingFailsWithInvalidLastName() {
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String lastName = "last";
            int index = 0;
            ContactItem l = new ContactItem("First", lastName, "000-000-0000", "yes@yes.com");
            contact.set(index, l);
            fail();
        }catch(Exception e){
            assertEquals("invalid last name", e.getMessage());
        }
    }

    @Test
    public void editingSucceedsWithValidLastName(){
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First",  "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String lastName = "Last";
            int index = 0;
            ContactItem l = new ContactItem("First", lastName, "000-000-0000", "yes@yes.com");
            contact.set(index, l);
            assertEquals("Last", contact.get(index).lastName);
        }catch(Exception e){
            fail();
        }
    }




    @Test
    public void constructorFailsWithBlankPhoneNumber (){
        try {
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "", "yes@yes.com");
            contact.add(i);
            fail();
        }catch(Exception e){
            assertEquals("invalid phone number", e.getMessage());
        }
    }

    @Test
    public void constructorFailsWithInvalidPhoneNumberFormat(){
        try {
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000/000/0000", "yes@yes.com");
            contact.add(i);
            fail();
        }catch(Exception e){
            assertEquals("invalid phone number", e.getMessage());
        }
    }

    @Test
    public void constructorFailsWithInvalidPhoneNumber(){
        try {
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "(000)000-00000", "yes@yes.com");
            contact.add(i);
            fail();
        }catch(Exception e){
            assertEquals("invalid phone number", e.getMessage());
        }
    }


    @Test
    public void constructorSucceedsWithValidPhoneNumber() {
        try{
            ArrayList<ContactItem> contact =  new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);

        }catch(Exception e){
            fail();
        }
    }


    @Test
    public void editingFailsWithBlankPhoneNumber(){
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String phoneNumber = "";
            int index = 0;
            ContactItem l = new ContactItem("First", "Last", phoneNumber, "yes@yes.com");
            contact.set(index, l);
            fail();
        }catch(Exception e){
            assertEquals("invalid phone number", e.getMessage());
        }
    }

    @Test
    public void editingFailsWithInvalidPhoneNumberFormat(){
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String phoneNumber = "000/000/0000";
            int index = 0;
            ContactItem l = new ContactItem("First", "Last", phoneNumber, "yes@yes.com");
            contact.set(index, l);
            fail();

        }catch(Exception e){
            assertEquals("invalid phone number", e.getMessage());
        }
    }

    @Test
    public void editingFailsWithInvalidPhoneNumber() {
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String phoneNumber = "(000)000-0000";
            int index = 0;
            ContactItem l = new ContactItem("First", "Last", phoneNumber, "yes@yes.com");
            contact.set(index, l);
            fail();


        }catch(Exception e){
            assertEquals("invalid phone number", e.getMessage());
        }
    }


    @Test
    public void editingSucceedsWithValidPhoneNumber() {
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String phoneNumber = "000-000-0000";
            int index = 0;
            ContactItem l = new ContactItem("First", "Last", phoneNumber, "yes@yes.com");
            contact.set(index, l);
            assertEquals("000-000-0000", contact.get(index).phoneNumber);


        }catch (Exception e){
            fail();
        }
    }








    @Test
    public void constructorFailsWithBlankEmail(){
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "");
            contact.add(i);
            fail();
        }catch(Exception e){
            assertEquals("invalid email", e.getMessage());
        }
    }

    @Test
    public void constructorFailsWithNoAtSymbol() {
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First","Last", "000-000-0000", "yesyes.com");
            contact.add(i);
            fail();
        }catch(Exception e){
            assertEquals("invalid email", e.getMessage());
        }
    }


    @Test
    public void constructorFailsWithNoSimpleCharactersInEmail(){
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "@.");
            contact.add(i);
            fail();
        }catch(Exception e) {
            assertEquals("invalid email", e.getMessage());
        }
    }

    @Test
    public void constructorSucceedsWithValidEmail() {
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
        }catch(Exception e){
            fail();
        }
    }


    @Test
    public void editingFailsWithBlankEmail(){
        try {
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String email = "";
            int index = 0;
            ContactItem l = new ContactItem("First", "Last", "000-000-0000", email);
            contact.set(index, l);
            fail();
        }catch(Exception e){
            assertEquals("invalid email", e.getMessage());
        }
    }



    @Test
    public void editingFailsWithNoAtSymbol() {
        try {
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String email = "yesyes.com";
            int index = 0;
            ContactItem l = new ContactItem("First", "Last", "000-000-0000", email);
            contact.set(index, l);
            fail();
        }catch (Exception e){
            assertEquals("invalid email", e.getMessage());
        }
    }


    @Test
    public void editingFailsWithNoLetterCharacters() {
        try {
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String email = "@.";
            int index = 0;
            ContactItem l = new ContactItem("First", "Last", "000-000-0000", email);
            contact.set(index, l);
            fail();
        }catch (Exception e){
            assertEquals("invalid email", e.getMessage());
        }
    }


    @Test
    public void editingSucceedsWithValidEmail() {
        try{
            ArrayList<ContactItem> contact = new ArrayList<>();
            ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
            contact.add(i);
            String email = "no@no.com";
            int index = 0;
            ContactItem l = new ContactItem("First", "Last", "000-000-0000", email);
            contact.set(index, l);
            assertEquals("no@no.com", contact.get(index).email);
        }catch(Exception e){
            fail();
        }
    }



    @Test
    public void editingFirstNameWithExpectedFirstName() throws Exception{
        ArrayList<ContactItem> contact = new ArrayList<>();
        ContactItem i = new ContactItem("First","Last","000-000-0000", "yes@yes.com");
        contact.add(i);
        int index = 0;
        String firstName = "Name";
        ContactItem l = new ContactItem(firstName, "Last", "000-000-0000", "yes@yes.com");

        contact.set(0, l);

        assertEquals("Name", contact.get(index).firstName);

    }

    @Test
    public void editingLastNameWithExpectedLastName() throws Exception{
        ArrayList<ContactItem> contact = new ArrayList<>();
        ContactItem i = new ContactItem("First", "Fast", "000-000-0000", "yes@yes.com");
        contact.add(i);
        int index = 0;
        String lastName = "Last";
        ContactItem l = new ContactItem("First",lastName, "000-000-0000", "yes@yes.com");
        contact.set(index, l);
        assertEquals("Last", contact.get(index).lastName);


    }

    @Test
    public void editingPhoneNumberWithExpectedPhoneNumber() throws Exception {
        ArrayList<ContactItem> contact = new ArrayList<>();
        ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
        contact.add(i);
        int index = 0;
        String phoneNumber = "900-300-2333";
        ContactItem l = new ContactItem("First", "Last", phoneNumber, "yes@yes.com");
        contact.set(index, l);
        assertEquals("900-300-2333", contact.get(index).phoneNumber);
    }

    @Test
    public void editingEmailWithExpectedPhoneNumber() throws Exception {
        ArrayList<ContactItem> contact = new ArrayList<>();
        ContactItem i = new ContactItem("First", "Last", "000-000-0000", "yes@yes.com");
        contact.add(i);
        int index = 0;
        String email = "no@no.com";
        ContactItem l = new ContactItem("First", "Last", "000-000-0000", email);
        contact.set(index, l);
        assertEquals("no@no.com", contact.get(index).email);

    }







}
