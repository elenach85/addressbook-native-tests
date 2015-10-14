package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactCreation extends TestBase {
@Test
public void shouldCreateContactWithValidData(){
Contact contact=new Contact().setFirstName(generateRandomString()).setLastName(generateRandomString())
.setEmailAddress(generateRandomString()).setStreetAddress(generateRandomString())
.setCity(generateRandomString()).setPostalCode(generateRandomString())
.setCountry(generateRandomString()).setPhone(generateRandomString())
.setFax(generateRandomString()).setMobile(generateRandomString())
.setWebPage(generateRandomString()).setNotes(generateRandomString())
.setInternetcont(generateRandomString());
app.getContactHelper().createContact(contact);
Contact createdContact=app.getContactHelper().getFirstContact(contact);
Assert.assertEquals(contact, createdContact);
}
}
