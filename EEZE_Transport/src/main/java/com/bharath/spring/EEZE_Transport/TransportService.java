package com.bharath.spring.EEZE_Transport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class TransportService {

	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	void registerBooking(Booking booking) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customerName : ");
		String customerName = sc.next();
		System.out.println("Enter the mobileNumber : ");
		long mobileNumber = sc.nextLong();
		System.out.println("Enter the destination : ");
		String destination = sc.next();
		System.out.println("Enter the Date : ");
		String date = sc.next();
		Date dateOfJourney = new SimpleDateFormat("dd-mm-yyy").parse(date);

		booking.setCustomerName(customerName);
		booking.setMobileNumber(mobileNumber);
		booking.setDestination(destination);
		booking.setDateOfJourney(dateOfJourney);

		calculateTravelCost(vehicle.getSource(), destination, dateOfJourney);
	}

	private void calculateTravelCost(String source, String destination, Date dateOfJourney) {
		boolean check = CheckAvailableDateForTravel(dateOfJourney);
		if (!check) {
			System.out.println("Invalid Travel Date");
		} else {
			System.out.println("Total travel cost is Rs. " + getCost(destination));
		}
	}

	private Double getCost(String destination) {
		Map<String, Double> map = vehicle.getDestinationMap();

		return map.get(destination);
	}

	private boolean CheckAvailableDateForTravel(Date dateOfJourney) {

		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String todayString = sdf.format(today);
		String dojString = sdf.format(dateOfJourney);

		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		cal.add(Calendar.DATE, 1);
		Date tomorrow = cal.getTime();
		String tomorrowString = sdf.format(tomorrow);
//		return dojString.equals(todayString) || dojString.equals(tomorrowString);
		return true;
	}

}
