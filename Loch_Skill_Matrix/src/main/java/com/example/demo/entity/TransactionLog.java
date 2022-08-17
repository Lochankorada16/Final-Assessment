package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "loch_trans_log")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransactionLog {

	@Id
	@Column(name = "transaction_id")
	int transactionId;
	
	@Column(name = "user_login_id")
	int userLoginId;
	
	@Column(name = "api_ope_name")
	String apiOperationName;
	
	@Column(name = "request")
	String request;
	
	@Column(name = "response")
	String response;
	
	@Column(name = "created_time")
	LocalTime createdTime;
	
	@Column(name = "created_date")
	LocalDate createdDate;
}
