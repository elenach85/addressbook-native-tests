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
	
	public void deleteContact() {
	initContactDeletion();
	confirmContactDeletion();

	}

	private void confirmContactDeletion() {
		manager.getAutoItHelper().click("TButton2")
		.winWaitAndActivate("AddressBook Portable","" , 5000);
		
	}

	private void initContactDeletion() {
		manager.getAutoItHelper().winWaitAndActivate("AddressBook Portable","" , 5000)
		.focus("TListView1")
		.send("{DOWN}{SPACE}");		
		manager.getAutoItHelper().click("Delete")
		.winWaitAndActivate("Confirm","", 5000);
		
	}


	private void initContactCreation() {
		manager.getAutoItHelper().winWaitAndActivate("AddressBook Portable","" , 5000)
		.focus("Add")
		.click("Add")
		.winWaitAndActivate("Add Contact","", 5000);
		}
	
	private void fillContactForm(Contact contact) {
		manager.getAutoItHelper()
		.send("TDBEdit12", contact.firstname)
		.send("TDBEdit11", contact.lastname)
		.send("TDBEdit10", contact.email)
		.send("TDBEdit8",contact.street)
		.send("TDBEdit7",contact.city)
		.send("TDBEdit6",contact.code)
		.send("TDBEdit5",contact.country)
		.send("TDBEdit4",contact.phone)
		.send("TDBEdit3",contact.fax)
		.send("TDBEdit2",contact.mobile)
		.send("TDBEdit1",contact.page)
		.send("TDBEdit9",contact.icont)
		.send("TRxRichEdit1",contact.notes);
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
    .setEmailAddress(manager.getAutoItHelper().getText("TDBEdit10"))
    .setStreetAddress(manager.getAutoItHelper().getText("TDBEdit8"))
    .setCity(manager.getAutoItHelper().getText("TDBEdit7"))
    .setPostalCode(manager.getAutoItHelper().getText("TDBEdit6"))
    .setCountry(manager.getAutoItHelper().getText("TDBEdit5"))
    .setPhone(manager.getAutoItHelper().getText("TDBEdit4"))
    .setFax(manager.getAutoItHelper().getText("TDBEdit3"))
    .setMobile(manager.getAutoItHelper().getText("TDBEdit2"))
    .setWebPage(manager.getAutoItHelper().getText("TDBEdit1"))
    .setInternetcont(manager.getAutoItHelper().getText("TDBEdit9"))
    .setNotes(manager.getAutoItHelper().getText("TRxRichEdit1"));
	manager.getAutoItHelper().click("Cancel").winWaitAndActivate("AddressBook Portable","" , 5000);
		return contact1;
	}

}
