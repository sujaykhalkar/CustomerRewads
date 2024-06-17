package com.assignment.CustomerRewads.DAO;

public class RewardPoints {

	private String customerName;
    private int totalPoints;
    
     
	public RewardPoints(String customerName, int totalPoints) {
		super();
		this.customerName = customerName;
		this.totalPoints = totalPoints;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	 
}
