package com.thermal.gasbill;



import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="GAS_TABLE")
public class GasEntity {
	
	@Id
    @Column(name="CONSUMER_NUMBER")
	private int consumerNumber;
	
    @Column(name="BOOKED_CYLINDERS")
	private int bookedCylinders;
	
    @Column(name="CONSUMED_CYLINDERS")
	private int consumedCylinders;
    
    @Column(name="BOOKING_DATE")
	private LocalDate bookingDate;
	
    @Column(name="SUBSIDY_PERCENT")
	private int subsidyPercent;
	
    @Column(name="LATEST_BILL")
	private int latestBill;

	public int getConsumerNumber() {
		return consumerNumber;
	}

	public void setConsumerNumber(int consumerNumber) {
		this.consumerNumber = consumerNumber;
	}

	public int getBookedCylinders() {
		return bookedCylinders;
	}

	public void setBookedCylinders(int bookedCylinders) {
		this.bookedCylinders = bookedCylinders;
	}

	public int getConsumedCylinders() {
		return consumedCylinders;
	}

	public void setConsumedCylinders(int consumedCylinders) {
		this.consumedCylinders = consumedCylinders;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getSubsidyPercent() {
		return subsidyPercent;
	}

	public void setSubsidyPercent(int subsidyPercent) {
		this.subsidyPercent = subsidyPercent;
	}

	public int getLatestBill() {
		return latestBill;
	}

	public void setLatestBill(int latestBill) {
		this.latestBill = latestBill;
	}
	
}
