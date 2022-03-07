package com.mortgage.managerservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "loanDetails")
public class LoanDetails {
	
	@Id
	@Column(name = "customer_id")
	@ApiModelProperty(notes = "ID of the customer",name="customerId",required=false,value="Auto generated")
	private int customerId;
	
	@Column(name = "type_Of_Mortgage")
	@ApiModelProperty(notes = "Type of mortgage which customer want",name="TypeOfMortgage",required=true)
	private String type_Of_Mortgage;
	
	@Column(name = "acc_no")
	@ApiModelProperty(notes = "accNo of the customer",name="AccNo",required=true,value="Accept only number")
	private int accNo;
	
	@Column(name = "total_Loan_Ammount")
	@ApiModelProperty(notes = "Total loan ammount of the customer",name="TotalLoanAmmount",required=true)
	private long total_Loan_Ammount;
	
	@Column(name = "Tenture")
	@ApiModelProperty(notes = "Tenture of loan",name="Tenture",required=true)
	private int Tenture;
	
	@Column(name = "start_Date")
	@ApiModelProperty(notes = "Start date of tenture",name="StartDate",required=true,value="Accept only date")
	private String startDate;
	
	@Column(name = "end_Date")
	@ApiModelProperty(notes = "End date of tenture",name="EndDate",required=true,value="Accept only date")
	private String endDate;
	
	@Column(name = "outstanding_Charges")
	@ApiModelProperty(notes = "outstanding Charges ",name="OutstandingCharges",required=true)
	private double outstandingCharges;
	
	@Column(name = "loan_Status")
	@ApiModelProperty(notes = "Showing loan status",name="LoanStatus",required=true)
	private String loanStatus;
	
	
	
	public LoanDetails() {
		super();
	
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getType_Of_Mortgage() {
		return type_Of_Mortgage;
	}



	public void setType_Of_Mortgage(String type_Of_Mortgage) {
		this.type_Of_Mortgage = type_Of_Mortgage;
	}



	public int getAccNo() {
		return accNo;
	}



	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public long getTotal_Loan_Ammount() {
		return total_Loan_Ammount;
	}



	public void setTotal_Loan_Ammount(long total_Loan_Ammount) {
		this.total_Loan_Ammount = total_Loan_Ammount;
	}



	public int getTenture() {
		return Tenture;
	}



	public void setTenture(int tenture) {
		Tenture = tenture;
	}



	public String getStartDate() {
		return startDate;
	}



	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}



	public String getEndDate() {
		return endDate;
	}



	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}



	public double getOutstandingCharges() {
		return outstandingCharges;
	}



	public void setOutstandingCharges(double outstandingCharges) {
		this.outstandingCharges = outstandingCharges;
	}



	public String getLoanStatus() {
		return loanStatus;
	}



	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	
	

}
