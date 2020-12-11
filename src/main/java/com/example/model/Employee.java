package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "emp_tab")
public class Employee {

	@Id
	@GeneratedValue
	private Integer empNo;
	@Column(name = "emp_name_col",length = 10,nullable = false)
	private String empName;
	@Column(name = "emp_address_col",length = 25,nullable = false)
	private String empAddress;
	
}
