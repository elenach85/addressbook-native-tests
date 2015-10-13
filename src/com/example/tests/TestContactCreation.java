package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactCreation extends TestBase {
@Test
public void shouldCreateContactWithValidData(){
Contact contact=new Contact().setFirstName("firstname tester").setLastName("lastname tester").setEmailAddress("test@gmail.com");
app.getContactHelper().createContact(contact);
Contact createdContact=app.getContactHelper().getFirstContact(contact);
Assert.assertEquals(contact, createdContact);
}
}
