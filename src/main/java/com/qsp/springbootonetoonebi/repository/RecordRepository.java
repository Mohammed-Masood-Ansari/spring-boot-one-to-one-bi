package com.qsp.springbootonetoonebi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.springbootonetoonebi.dto.Record;

public interface RecordRepository extends JpaRepository<Record, Integer> {

}
