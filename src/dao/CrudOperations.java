package dao;

import java.util.ArrayList;
import java.util.List;

import model.UserDetails;
import model.AdminDetails;
import model.ChargeSheetDetails;
import model.ComplaintDetails;
import model.CriminalDetails;
import model.FirDetails;

public class CrudOperations {
	
	static List<UserDetails> userList = new ArrayList<UserDetails>();	
	public List<UserDetails> addUser(UserDetails user){
		userList.add(user);
		return userList;
	}	
	public List<UserDetails> getAllUsers(){
		return userList;
	}
	
	static List<AdminDetails> adminList = new ArrayList<AdminDetails>();
	public List<AdminDetails> addAdmin(AdminDetails admin){
		adminList.add(admin);
		return adminList;
	}
	public List<AdminDetails> getAllAdmins(){
		return adminList;
	}
	
	static List<ComplaintDetails> complaintList = new ArrayList<ComplaintDetails>();
	public List<ComplaintDetails> addComplaint(ComplaintDetails complaint){
		complaintList.add(complaint);
		return complaintList;
	}
	public List<ComplaintDetails> getAllComplaints(){
		return complaintList;
	}
	
	static List<CriminalDetails> criminalList = new ArrayList<CriminalDetails>();
	public List<CriminalDetails> addCriminal(CriminalDetails criminal){
		criminalList.add(criminal);
		return criminalList;
	}
	public List<CriminalDetails> getAllCriminalDetails(){
		return criminalList;
	}
	
	static List<FirDetails> firDetailsList = new ArrayList<FirDetails>();
	public List<FirDetails> addFirDetails (FirDetails firDetails){
		firDetailsList.add(firDetails);
		return firDetailsList;
	}
	public List<FirDetails> getAllFirDetails(){
		return firDetailsList;
	}
	
	static List<ChargeSheetDetails> chargeSheetDetailsList = new ArrayList<ChargeSheetDetails>();
	public List <ChargeSheetDetails> addChargeSheetDetails (ChargeSheetDetails chargeSheetDetails){
		chargeSheetDetailsList.add(chargeSheetDetails);
		return chargeSheetDetailsList;
	}
	
	public List<ChargeSheetDetails> getAllChargeSheetDetails(){
		return chargeSheetDetailsList;
	}
}
