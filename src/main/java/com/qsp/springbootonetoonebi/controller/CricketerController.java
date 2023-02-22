package com.qsp.springbootonetoonebi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.springbootonetoonebi.dto.Cricketers;
import com.qsp.springbootonetoonebi.dto.Record;
import com.qsp.springbootonetoonebi.service.CricketerService;

@RestController
public class CricketerController {

	@Autowired
	CricketerService cricketerService;

	@PostMapping("/saveCricketerRecord")
	public void insertCricketers(@RequestBody Cricketers cricketers) {
		cricketerService.insertCricketers(cricketers);
	}

	@GetMapping("/getAllDataCricketersRecore/{id}")
	public Record getAllDataCricketersRecord(@PathVariable int id) {

		return cricketerService.getAllDataCricketersRecord(id);
	}
}
