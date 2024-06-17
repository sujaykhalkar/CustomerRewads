package com.assignment.CustomerRewads.DAO;

public class Transaction {
	
	    private Long id;
	    private String customerName;
	    private double amount;
	    
	    
	    
	    public Transaction(Long id, String customerName, double amount) {
			super();
			this.id = id;
			this.customerName = customerName;
			this.amount = amount;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		
	    

}
