package com.example.fw;

import java.io.IOException;

public class ProcessHelper extends HelpersBase {

	private Process process;
	public ProcessHelper(ApplicationManager applicationManager) {
		super(applicationManager);	
	}
public void startAppUnderTest() throws IOException{
	//String command="D:\\SSuiteAddressBookPro2\\AddressBook.exe";
String command=manager.properties.getProperty("app.path");
process = Runtime.getRuntime().exec(command);	
}
public void stopAppUnderTest(){
process.destroy();	
}
}