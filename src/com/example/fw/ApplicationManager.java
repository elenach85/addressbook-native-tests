package com.example.fw;

import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.Properties;

public class ApplicationManager {

	private Properties properties;
	private ContactHelper contactHelper;
	private ProcessHelper processHelper;
	private AutoItHelper autoitHelper;
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
		public AutoItHelper getAutoItHelper() {
		
			if (autoitHelper==null){
			autoitHelper=new AutoItHelper(this);
						}
				return autoitHelper;
			}
		public String getProperty(String key) {
			return properties.getProperty(key);
		}
	
		}


