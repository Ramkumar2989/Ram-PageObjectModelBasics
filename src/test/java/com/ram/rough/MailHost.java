package com.ram.rough;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.ram.utilities.MonitoringMail;

public class MailHost {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub

		MonitoringMail mail = new MonitoringMail();
		String messageBody="http://"+InetAddress.getLocalHost().getHostAddress()+ ":8080/job/PageObjectModel/Extent_20Reports/";
		System.out.println(messageBody);
	}

}
