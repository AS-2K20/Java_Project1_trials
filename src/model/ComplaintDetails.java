package model;

public class ComplaintDetails {
	
	private int complaintId;
	private String complaintGiverId;
	private String complaintGiverName;
	private String complaintGiverAddress;
	private String complaintGiverPhoneNumber;
	private String complaintDate;
	private String complaintType;
	private String complaintDiscription;
	private String complaintStatus;
	
	public String getComplaintStatus() {
		return complaintStatus;
	}
	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public String getComplaintGiverId() {
		return complaintGiverId;
	}
	public void setComplaintGiverId(String complaintGiverId) {
		this.complaintGiverId = complaintGiverId;
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
	public String getComplaintDiscription() {
		return complaintDiscription;
	}
	public void setComplaintDiscription(String complaintDiscription) {
		this.complaintDiscription = complaintDiscription;
	}
	public ComplaintDetails(int complaintId, String complaintGiverId, String complaintGiverName,
			String complaintGiverAddress, String complaintGiverPhoneNumber, String complaintDate, String complaintType,
			String complaintDiscription, String complaintStatus) {
		super();
		this.complaintId = complaintId;
		this.complaintGiverId = complaintGiverId;
		this.complaintGiverName = complaintGiverName;
		this.complaintGiverAddress = complaintGiverAddress;
		this.complaintGiverPhoneNumber = complaintGiverPhoneNumber;
		this.complaintDate = complaintDate;
		this.complaintType = complaintType;
		this.complaintDiscription = complaintDiscription;
		this.complaintStatus = complaintStatus;
	}		
}
