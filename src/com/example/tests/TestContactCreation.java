package com.example.tests;

import org.testng.annotations.Test;

public class TestContactCreation extends TestBase {
@Test
public void shouldCreateContactWithValidData(){
Contact contact=new Contact().setFirstName("tester").setLastName("tester");
app.getContactHelper().createContact(contact);
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}