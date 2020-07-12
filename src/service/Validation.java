package service;

public class Validation {

	public boolean checkUserLoginDetails(String userId, String userEmail, String userPassword) {
		String passwordRegex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		String emailRegex = "^[A-Za-z0-9+_.]+@(.+)$";
		String userIdRegex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
		if(userId.matches(userIdRegex)&&(userEmail.matches(emailRegex))&&(userPassword.matches(passwordRegex))) {
			return true;
		}
		else 
			return false;
	}
	
	public boolean checkAdminLoginDetails(String adminId, String adminPassword) {
		String passwordRegex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		String userIdRegex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
		if(adminId.matches(userIdRegex)&&(adminPassword.matches(passwordRegex))) {
			return true;
		}
		else
			return false;
	}
	
	public boolean complaintIsEmpty(int complaintId, String complaintGiverId, String complaintGiverName,
			String complaintGiverAddress, String complaintGiverPhoneNumber, String complaintDate, String complaintType,
			String complaintDiscription,String complaintStatus) {
		if((complaintId!=0)||(complaintGiverId!=null)||(complaintGiverName!=null)||(complaintGiverAddress!=null)||(complaintGiverPhoneNumber!=null)||(complaintDate!=null)||(complaintType!=null)||(complaintDiscription!=null)||(complaintStatus!=null)) {
			return true;
		}
		else
			return false;
	}

}
