package com.cg.ibs.cardmanagement.cardbean;

import java.math.BigInteger;
import java.util.Date;

public class DebitCardBean {
	
	private BigInteger debitCardNumber;
	private boolean debitCardStatus;
	private String nameOnDebitCard;
	private int debitCvvNum;
	private int debitCurrentPin;
	private Date debitDateOfExpiry;
	public BigInteger getDebitCardNumber() {
		return debitCardNumber;
	}
	public void setDebitCardNumber(BigInteger debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}
	public boolean isDebitCardStatus() {
		return debitCardStatus;
	}
	public void setDebitCardStatus(boolean debitCardStatus) {
		this.debitCardStatus = debitCardStatus;
	}
	public String getNameOnDebitCard() {
		return nameOnDebitCard;
	}
	public void setNameOnDebitCard(String nameOnDebitCard) {
		this.nameOnDebitCard = nameOnDebitCard;
	}
	public int getDebitCvvNum() {
		return debitCvvNum;
	}
	public void setDebitCvvNum(int debitCvvNum) {
		this.debitCvvNum = debitCvvNum;
	}
	public int getDebitCurrentPin() {
		return debitCurrentPin;
	}
	public void setDebitCurrentPin(int debitCurrentPin) {
		this.debitCurrentPin = debitCurrentPin;
	}
	public Date getDebitDateOfExpiry() {
		return debitDateOfExpiry;
	}
	public void setDebitDateOfExpiry(Date debitDateOfExpiry) {
		this.debitDateOfExpiry = debitDateOfExpiry;
	}

}
