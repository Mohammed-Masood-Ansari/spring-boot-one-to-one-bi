package com.qsp.springbootonetoonebi.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Cricketers {

	@Id
	@Column(name = "cricketersid")
	private int cricketersId;
	@Column(name = "cricketersname")
	private String cricketersName;
	@Column(name = "cricketersage")
	private int cricketersAge;
	@Column(name = "cricketerscountry")
	private String cricketersCountry;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "recordid")
	@JsonBackReference
	private Record record;

	public int getCricketersId() {
		return cricketersId;
	}

	public void setCricketersId(int cricketersId) {
		this.cricketersId = cricketersId;
	}

	public String getCricketersName() {
		return cricketersName;
	}

	public void setCricketersName(String cricketersName) {
		this.cricketersName = cricketersName;
	}

	public int getCricketersAge() {
		return cricketersAge;
	}

	public void setCricketersAge(int cricketersAge) {
		this.cricketersAge = cricketersAge;
	}

	public String getCricketersCountry() {
		return cricketersCountry;
	}

	public void setCricketersCountry(String cricketersCountry) {
		this.cricketersCountry = cricketersCountry;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	
	
}
