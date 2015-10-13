package com.example.fw;

import com.example.tests.Contact;

public class ContactHelper extends HelpersBase {
	public ContactHelper(ApplicationManager applicationManager) {
		super(applicationManager);
		
	}

	public void createContact(Contact contact) {
	initContactCreation();
	fillContactForm(contact);
	confirmContactCreation();
	}
	


	private void initContactCreation() {
		manager.getAutoItHelper().winWaitAndActivate("AddressBook Portable","" , 5000)
		.focus("TRbButton4")
		.click("TRbButton4")
		.winWaitAndActivate("Add Contact","", 5000);
		}
	
	private void fillContactForm(Contact contact) {
		manager.getAutoItHelper()
		.send("TDBEdit12", contact.firstname)
		.send("TDBEdit11", contact.firstname)
		.send("TDBEdit10", contact.email);
	}

	private void confirmContactCreation() {
		manager.getAutoItHelper().click("Save")
		.winWaitAndActivate("AddressBook Portable","" , 5000);
	}
	
	public Contact getFirstContact(Contact contact) {
	manager.getAutoItHelper().focus("TListView1")
	.send("{DOWN}{SPACE}")
	.click("Edit")
	.winWaitAndActivate("Update Contact","", 5000);
	Contact contact1=new Contact()
    .setFirstName(manager.getAutoItHelper().getText("TDBEdit12"))
    .setLastName(manager.getAutoItHelper().getText("TDBEdit11"))
    .setEmailAddress(manager.getAutoItHelper().getText("TDBEdit10"));
	manager.getAutoItHelper().click("Cancel").winWaitAndActivate("AddressBook Portable","" , 5000);
		return contact1;
	}

}
