package model;

// Type your code
import java.time.LocalDate;
public class Bus{

	//instance variables/arguments
	private int noOfPersons;
	private String busType;
	private int rates;
	private LocalDate date;


	//getter and setter
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

	//constructor
	public Bus(int noOfPersons, int rates, String busType, LocalDate date) {
		super();
		this.noOfPersons = noOfPersons;
		this.busType = busType;
		this.rates = rates;
		this.date = date;
	}

} 