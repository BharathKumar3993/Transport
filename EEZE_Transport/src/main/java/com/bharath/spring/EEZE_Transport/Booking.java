package com.bharath.spring.EEZE_Transport;

import java.util.Date;

public class Booking {
	private String customerName;
	private long mobileNumber;
	private String destination;
	private Date dateOfJourney;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	@Override
	public String toString() {
		return "Booking [customerName=" + customerName + ", mobileNumber=" + mobileNumber + ", destination="
				+ destination + ", dateOfJourney=" + dateOfJourney + "]";
	}
}
