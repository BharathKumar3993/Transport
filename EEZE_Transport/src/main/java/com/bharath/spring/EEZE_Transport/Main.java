package com.bharath.spring.EEZE_Transport;

import java.text.ParseException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws ParseException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/EEZE_Transport/config.xml");
		TransportService tp = (TransportService) context.getBean("transportService");
		Booking booking = new Booking();
		tp.registerBooking(booking);
	}

}