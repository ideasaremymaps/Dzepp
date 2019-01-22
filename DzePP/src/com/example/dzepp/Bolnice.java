package com.example.dzepp;

public class Bolnice {
	private String nameHospital;
	private String addressHospital;
	private String numberHospital;
	
	public Bolnice(String nameHospital, String addressHospital, String numberHospital) {
		this.nameHospital=nameHospital;
		this.addressHospital=addressHospital;
		this.numberHospital=numberHospital;
	}
	
	public String getNameHospital() {
		return nameHospital;
	}
	public void setNameHospital(String nameHospital) {
		this.nameHospital = nameHospital;
	}
	public String getAddressHospital() {
		return addressHospital;
	}
	public void setAddressHospital(String addressHospital) {
		this.addressHospital = addressHospital;
	}
	public String getNumberHospital() {
		return numberHospital;
	}
	public void setNumberHospital(String numberHospital) {
		this.numberHospital = numberHospital;
	}
	
}
