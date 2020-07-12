package model;

public class ChargeSheetDetails {
	private int chargeSheetNumber;
	private String chargeSheetDate;
	private int complaintId;
	private String complaintGiverName;
	private String complaintGiverAddress;
	private String complaintGiverPhoneNumber;
	private String complaintDate;
	private String complaintType;
	private int firId;
	private String firDate;
	private String complaintDiscription;
	private String criminalName;
	private int criminalAge;
	private String criminalAddress;
	private String criminalArrestDate;
	private String criminalIdentificationMarks;
	
	
	public String getChargeSheetDate() {
		return chargeSheetDate;
	}
	public void setChargeSheetDate(String chargeSheetDate) {
		this.chargeSheetDate = chargeSheetDate;
	}
	public int getChargeSheetNumber() {
		return chargeSheetNumber;
	}
	public void setChargeSheetNumber(int chargeSheetNumber) {
		this.chargeSheetNumber = chargeSheetNumber;
	}
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public String getComplaintGiverName() {
		return complaintGiverName;
	}
	public void setComplaintGiverName(String complaintGiverName) {
		this.complaintGiverName = complaintGiverName;
	}
	public String getComplaintGiverAddress() {
		return complaintGiverAddress;
	}
	public void setComplaintGiverAddress(String complaintGiverAddress) {
		this.complaintGiverAddress = complaintGiverAddress;
	}
	public String getComplaintGiverPhoneNumber() {
		return complaintGiverPhoneNumber;
	}
	public void setComplaintGiverPhoneNumber(String complaintGiverPhoneNumber) {
		this.complaintGiverPhoneNumber = complaintGiverPhoneNumber;
	}
	public String getComplaintDate() {
		return complaintDate;
	}
	public void setComplaintDate(String complaintDate) {
		this.complaintDate = complaintDate;
	}
	public String getComplaintType() {
		return complaintType;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	public int getFirId() {
		return firId;
	}
	public void setFirId(int firId) {
		this.firId = firId;
	}
	public String getFirDate() {
		return firDate;
	}
	public void setFirDate(String firDate) {
		this.firDate = firDate;
	}
	public String getComplaintDiscription() {
		return complaintDiscription;
	}
	public void setComplaintDiscription(String complaintDiscription) {
		this.complaintDiscription = complaintDiscription;
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
	
	public ChargeSheetDetails(int complaintId, String complaintGiverName, String complaintGiverAddress,
			String complaintGiverPhoneNumber, String complaintDate, String complaintType, int firId, String firDate,
			String complaintDiscription, String criminalName, int criminalAge, String criminalAddress,
			String criminalArrestDate, String criminalIdentificationMarks, int chargeSheetNumber, String chargeSheetDate) {
		super();
		this.complaintId = complaintId;
		this.complaintGiverName = complaintGiverName;
		this.complaintGiverAddress = complaintGiverAddress;
		this.complaintGiverPhoneNumber = complaintGiverPhoneNumber;
		this.complaintDate = complaintDate;
		this.complaintType = complaintType;
		this.firId = firId;
		this.firDate = firDate;
		this.complaintDiscription = complaintDiscription;
		this.criminalName = criminalName;
		this.criminalAge = criminalAge;
		this.criminalAddress = criminalAddress;
		this.criminalArrestDate = criminalArrestDate;
		this.criminalIdentificationMarks = criminalIdentificationMarks;
		this.chargeSheetNumber= chargeSheetNumber;
		this.chargeSheetDate = chargeSheetDate;
	}
	
	
}
