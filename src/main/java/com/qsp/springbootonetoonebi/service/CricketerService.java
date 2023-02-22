package com.qsp.springbootonetoonebi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.springbootonetoonebi.dao.CricketersDao;
import com.qsp.springbootonetoonebi.dto.Cricketers;
import com.qsp.springbootonetoonebi.dto.Record;

@Service
public class CricketerService {

	@Autowired
	CricketersDao cricketersDao;
	
	public void insertCricketers(Cricketers cricketers) {
		cricketersDao.insertCricketers(cricketers);
	}
	
	public Record getAllDataCricketersRecord(int id) {
		
		return cricketersDao.getAllDataCricketersRecord(id);
	}
}
