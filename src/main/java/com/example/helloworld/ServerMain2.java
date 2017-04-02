package com.example.helloworld;

import com.example.helloworld.resources.soapclient.ClientEntry;

public class ServerMain2 {

	public static void main(String... strings) {

		HelloWorldApplication a = new HelloWorldApplication();
		

//	    String CONFIG_PATH = ResourceHelpers.resourceFilePath("example.yml");
		
		try {
			a.run(new String[]{"server","example.yml"});
			
			try {
				new ClientEntry().callSoap();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
