package com.current.electricbill;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ELECTRIC_TABLE")
public class ElectricEntity {
	
	@Id
    @Column(name="SERIAL_NUMBER")
	private int serialNumber;
	
    @Column(name="BILLED_UNITS")
	private int billedUnits;
	
    @Column(name="METER_UNITS")
	private int meterUnits;
	
    @Column(name="SUBSIDY_PERCENT")
	private int subsidyPercent;
	
    @Column(name="LATEST_BILL")
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
