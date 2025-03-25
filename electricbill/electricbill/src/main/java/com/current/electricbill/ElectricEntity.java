package com.current.electricbill;

import javax.persistence.Entity;

@Entity
public class ElectricEntity {

	private int serialNumber;
	
	private int billedUnits;
	
	private int meterUnits;
	
	private int subsidyPercent;
	
	private int latestBill;

	
	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getBilledUnits() {
		return billedUnits;
	}

	public void setBilledUnits(int billedUnits) {
		this.billedUnits = billedUnits;
	}

	public int getMeterUnits() {
		return meterUnits;
	}

	public void setMeterUnits(int unBilledUnits) {
		this.meterUnits = unBilledUnits;
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
