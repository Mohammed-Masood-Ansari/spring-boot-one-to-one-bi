package com.qsp.springbootonetoonebi.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Record {

	@Column(name = "recordid")
	@Id
	private int recordId;
	@Column(name = "recordrun")
	private long recordRun;
	@Column(name = "recordmatches")
	private int recordMatches;
	@Column(name = "recordhundreds")
	private int recordHundreds;
	
	@OneToOne(mappedBy = "record")
	@JsonManagedReference
	private Cricketers cricketers;

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public long getRecordRun() {
		return recordRun;
	}

	public void setRecordRun(long recordRun) {
		this.recordRun = recordRun;
	}

	public int getRecordMatches() {
		return recordMatches;
	}

	public void setRecordMatches(int recordMatches) {
		this.recordMatches = recordMatches;
	}

	public int getRecordHundreds() {
		return recordHundreds;
	}

	public void setRecordHundreds(int recordHundreds) {
		this.recordHundreds = recordHundreds;
	}

	public Cricketers getCricketers() {
		return cricketers;
	}

	public void setCricketers(Cricketers cricketers) {
		this.cricketers = cricketers;
	}
	
	
	
}
