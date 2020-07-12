package model;

public class CriminalDetails {
	private String criminalName;
	private int criminalAge;
	private String criminalAddress;
	private String criminalArrestDate;
	private String criminalIdentificationMarks;
	private String crimeType;
	private int yearsServed;
	private int criminalId;
	
	public int getCriminalId() {
		return criminalId;
	}
	public void setCriminalId(int criminalId) {
		this.criminalId = criminalId;
	}
	public String getCriminalName() {
		return criminalName;
	}
	public void setCriminalName(String criminalName) {
		this.criminalName = criminalName;
	}
	public int getCriminalAge() {
		return criminalAge;
	}
	public void setCriminalAge(int criminalAge) {
		this.criminalAge = criminalAge;
	}
	public String getCriminalAddress() {
		return criminalAddress;
	}
	public void setCriminalAddress(String criminalAddress) {
		this.criminalAddress = criminalAddress;
	}
	public String getCriminalArrestDate() {
		return criminalArrestDate;
	}
	public void setCriminalArrestDate(String criminalArrestDate) {
		this.criminalArrestDate = criminalArrestDate;
	}
	public String getCriminalIdentificationMarks() {
		return criminalIdentificationMarks;
	}
	public void setCriminalIdentificationMarks(String criminalIdentificationMarks) {
		this.criminalIdentificationMarks = criminalIdentificationMarks;
	}
	public String getCrimeType() {
		return crimeType;
	}
	public void setCrimeType(String crimeType) {
		this.crimeType = crimeType;
	}
	public int getYearsServed() {
		return yearsServed;
	}
	public void setYearsServed(int yearsServed) {
		this.yearsServed = yearsServed;
	}
	
	public CriminalDetails(String criminalName, int criminalAge, String criminalAddress, String criminalArrestDate,
			String criminalIdentificationMarks, String crimeType, int yearsServed,int criminalId) {
		super();
		this.criminalName = criminalName;
		this.criminalAge = criminalAge;
		this.criminalAddress = criminalAddress;
		this.criminalArrestDate = criminalArrestDate;
		this.criminalIdentificationMarks = criminalIdentificationMarks;
		this.crimeType = crimeType;
		this.yearsServed = yearsServed;
		this.criminalId=criminalId;
	}
	
	
}
