package com.example.fw;

import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.Properties;

public class ApplicationManager {

	public Properties properties;
	private ContactHelper contactHelper;
	private ProcessHelper processHelper;
	public  ApplicationManager(Properties properties) throws IOException{
		this.properties = properties;
		String command;
		command=properties.getProperty("app.path");
		start();
	}
		public void stop() {	
			getProcessHelper().stopAppUnderTest();	
		}
	
		public void start() throws IOException {	
	   	getProcessHelper().startAppUnderTest();	
		}
	
		public ContactHelper getContactHelper() {
		
		if (contactHelper==null){
		contactHelper=new ContactHelper(this);
					}
			return contactHelper;
		}
		public ProcessHelper getProcessHelper() {
			if (processHelper==null){
			processHelper=new ProcessHelper(this);
						}
				return processHelper;
			}
}

