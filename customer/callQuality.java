package com.customer;

import java.io.Serializable;

public class callQuality implements Serializable
{
	   private int callId;
	   private int callDuration;  
	   private String callQualityGrade;
	   private String customerName;
	   
	   
	   
	   
	   
	public callQuality() {
		super();
		// TODO Auto-generated constructor stub
	}


	public callQuality(int callId, int callDuration, String callQualityGrade, String customerName) {
		super();
		this.callId = callId;
		this.callDuration = callDuration;
		this.callQualityGrade = callQualityGrade;
		this.customerName = customerName;
	}
	
	
	public int getCallId() {
		return callId;
	}
	public void setCallId(int callId) {
		this.callId = callId;
	}
	public int getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(int callDuration) {
		this.callDuration = callDuration;
	}
	public String getCallQualityGrade() {
		return callQualityGrade;
	}
	public void setCallQualityGrade(String callQualityGrade) {
		this.callQualityGrade = callQualityGrade;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	} 
	   
	   
	} 