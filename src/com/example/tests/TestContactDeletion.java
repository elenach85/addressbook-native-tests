package com.example.tests;

import org.testng.annotations.Test;

public class TestContactDeletion extends TestBase{
	@Test
	public void shouldDeleteContact(){
	app.getContactHelper().deleteContact();
	}

	

	}
