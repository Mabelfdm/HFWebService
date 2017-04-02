package com.example.helloworld.resources.soapclient;

import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.axis.client.Service;

public class ClientEntry extends Service {

	String endPoint = "http://192.168.1.119:8080/hhhh";
	static String remoteMethod = "tttt";
	static QName qName = new QName("http://com/",remoteMethod);

	private static final long serialVersionUID = 1L;

	public void callSoap() throws Exception {

		CommonStub helloPort = getStub();

		String ff = helloPort.callMethod("I am param", qName);
		System.out.print(ff);

	}

	public CommonStub getStub() throws Exception {

		CommonStub _stub = new CommonStub(new URL(endPoint), this);

		_stub.setPortName("DemoTestPortname");
		_stub.init(remoteMethod);
		return _stub;

	}

}
