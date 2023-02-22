package com.qsp.springbootonetoonebi.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.springbootonetoonebi.dto.Cricketers;
import com.qsp.springbootonetoonebi.dto.Record;
import com.qsp.springbootonetoonebi.repository.CricketersRepository;

@Repository
public class CricketersDao {
	@Autowired
	CricketersRepository repository;
	
	public void insertCricketers(Cricketers cricketers) {
		repository.save(cricketers);
	}
	
	//getCricketersDetailsAnditsRecords
	
	public Record getAllDataCricketersRecord(int id) {
		
		Optional<Cricketers> optional=repository.findById(id);
		
		if(optional.isPresent()) {
			
		   return optional.get().getRecord();
		}else {
			return null;
		}
	}
	
	
}
