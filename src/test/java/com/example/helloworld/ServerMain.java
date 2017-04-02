package com.example.helloworld;

public class ServerMain {

	public static void main(String... strings) {

		HelloWorldApplication a = new HelloWorldApplication();
		

//	    String CONFIG_PATH = ResourceHelpers.resourceFilePath("example.yml");
		
		try {
			a.run(new String[]{"server","example.yml"});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
