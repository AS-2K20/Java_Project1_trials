package controller;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.CrudOperations;
import model.AdminDetails;
import model.ChargeSheetDetails;
import model.ComplaintDetails;
import model.CriminalDetails;
import model.FirDetails;
import model.UserDetails;
import service.Validation;
public class Main {
	Scanner sc = new Scanner(System.in);
	String userName,userPassword,userEmail,adminId,adminPassword;
	String options;
	int choice,chargementId;
	String userId,complaintGiverId,complaintGiverName,complaintGiverAddress,complaintGiverPhoneNumber;
	String userAddress,crimeType,crimeDescription,criminalIdentificationMarks;
	String firStatus,criminalArrestedDate;
	String complaintDate,complaintType,complaintDiscription,complaintStatus;
	int complaintId,criminalYearsServed,criminalId;
	int maxRange=300;
	int minRange=1;
	long userPhoneNumber;
	String criminalName, criminalAddress,firDate,chargeSheetDate,criminalArrestDate; 
	int firId,chargeSheetNumber,criminalAge;
	CriminalDetails criminal;
	UserDetails user;
	AdminDetails admin;
	ComplaintDetails complaint;
	FirDetails fir;
	ChargeSheetDetails chargeSheet;
	
	Validation validData = new Validation();
	CrudOperations crud = new CrudOperations();
	List<UserDetails> userDetailsList = new ArrayList<UserDetails>();
	List<AdminDetails> adminDetailsList = new ArrayList<AdminDetails>();
	List<ComplaintDetails> complaintDetailsList = new ArrayList<ComplaintDetails>();
	List<CriminalDetails> criminalDetailsList = new ArrayList<CriminalDetails>();
	List<FirDetails> firDetailsList = new ArrayList<FirDetails>();
	List<ChargeSheetDetails> chargeSheetDetailsList = new ArrayList<ChargeSheetDetails>();
	public void mainMenu(){
		
		System.out.println(" CRIME RECORD MANAGEMENT SYSTEM ");
		System.out.println("-------------------------------");
		System.out.println(" 1. User ");
		System.out.println(" 2. Administrator ");
		System.out.println(" 3. Exit ");
		System.out.println("Enter Your Choice:");
		
		choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			System.out.println(" WELCOME USER ");
			System.out.println("----------------");
			System.out.println(" 1. User SignUp ");
			System.out.println(" 2. User Login ");
			System.out.println(" 3. Exit ");
			System.out.println(" 4. Show User Details ");
			choice = Integer.parseInt(sc.nextLine());
			switch(choice){
			case 1:
				System.out.println(" USER SIGNUP: ");
				System.out.println("----------------");
				System.out.println(" Enter Your User ID: ");
				userId = sc.nextLine();
				System.out.println(" Enter Your Email: ");
				userEmail = sc.nextLine();
				System.out.println(" Enter Your Password: ");
				userPassword =sc.nextLine();				
				if(validData.checkUserLoginDetails(userId,userEmail,userPassword)) {
					user = new UserDetails(userId,userPassword,userEmail);
					crud.addUser(user);				
					System.out.println(" SIGNUP SUCCESSFULL! TRY LOGGING IN NOW ! ");
					break;
				}
				else {
					System.out.println("Invalid Data. Kindly check the inputs!");
					break;
				}
				
			case 2:
				System.out.println(" USER LOGIN:");
				System.out.println("-------------");
				System.out.println(" Enter Your User Name: ");
				userName = sc.nextLine();
				System.out.println(" Enter Your Password: ");
				userPassword =sc.nextLine();
				//System.out.println("User Name: "+userName+" Password: "+userPassword);
				//if user id is correct and validated				
//				complaintDetails();
				System.out.println(" COMPLAINTS ");
				System.out.println("--------------");
				System.out.println(" 1. Give Complaint ");
				System.out.println(" 2. Complaint Status ");
				System.out.println(" 3. Remove Complaint ");
				System.out.println(" 4. Show All Complaints ");
				System.out.println(" 5. Exit ");
				choice = Integer.parseInt(sc.nextLine());
				switch(choice) {
				case 1:
					//giveComplaint();
					System.out.println(" Give New Complaint ");
					System.out.println("----------------------");
					System.out.println(" Enter your Name: ");
					complaintGiverName = sc.nextLine();
					System.out.println(" Enter your ID: ");
					complaintGiverId = sc.nextLine();
					System.out.println(" Enter your Address: ");
					complaintGiverAddress = sc.nextLine();
					System.out.println(" Enter your Phone Number: ");
					complaintGiverPhoneNumber = sc.nextLine();	
					LocalDate now = LocalDate.now();
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					complaintDate =  (dtf.format(now)).toString();
					System.out.println(" Enter Crime Type: ");
					complaintType = sc.nextLine();
					System.out.println(" Enter Crime Description: ");
					complaintDiscription = sc.nextLine();
					complaintId = (int) (Math.random() *(maxRange-minRange+1)+minRange);
					complaintStatus ="Complaint Submitted";
					if(validData.complaintIsEmpty(complaintId, complaintGiverId, complaintGiverName, complaintGiverAddress, complaintGiverPhoneNumber, complaintDate, complaintType, complaintDiscription,complaintStatus)) {
						complaint = new ComplaintDetails(complaintId, complaintGiverId, complaintGiverName, complaintGiverAddress, complaintGiverPhoneNumber, complaintDate, complaintType, complaintDiscription,complaintStatus);
						crud.addComplaint(complaint);
						System.out.println(" COMPLAINT NOTED! ");
						System.out.println(" Your Complaint ID: "+complaintId);
					}
					else {
						System.out.println("Invalid Input");
					}
					break;
				
				case 2:
//					complaintStatus();
					System.out.println(" Complaint Status ");
					System.out.println("-----------------");
					System.out.println(" Enter Complaint ID: ");
					//checking whether complaint exists or not.
					break;
				
				case 3:
					//removeComplaint();
					System.out.println("Complaint Deletion");
					System.out.println("-----------------");
					System.out.println(" Enter Complaint ID: ");
					//CODE TO DELETION
					System.out.println("COMPLAINT DELETED!");
					break;
				
				case 4:
					System.out.println(" Complaint Details ");
					complaintDetailsList = crud.getAllComplaints();
					System.out.println(" Display Complaint Details in List ");
					for(ComplaintDetails complaintList:complaintDetailsList) {
						System.out.println(" Complaint ID: "+complaintList.getComplaintId());
						System.out.println(" Complaint Giver Name: "+complaintList.getComplaintGiverName());
						System.out.println(" Complaint Giver Address: "+complaintList.getComplaintGiverAddress());
						System.out.println(" Complaint Giver Phone Number: "+complaintList.getComplaintGiverPhoneNumber());
						System.out.println(" Complaint Date: "+complaintList.getComplaintDate());
						System.out.println(" Complaint Type: "+complaintList.getComplaintType());
						System.out.println(" Complaint Discription: "+complaintList.getComplaintDiscription());
						System.out.println(" Complaint Status: "+complaintList.getComplaintStatus());
					}
					break;
				case 5:
					System.exit(1);
				
				default:		
					System.out.println("PLEASE ENTER A VALID INPUT!");				
			}				
					
			case 4:
				System.out.println("User Details");
				userDetailsList = crud.getAllUsers();
				System.out.println("Display User Details in List");
				for(UserDetails userList:userDetailsList) {
					System.out.println(" User ID: "+userList.getUserId());
					System.out.println(" User Email: "+userList.getUserEmail());
					System.out.println(" User Password: "+userList.getUserPassword());
				}				
				break;			
		}
			//break;
		case 2:
			System.out.println(" ADMINISTRATOR LOGIN: ");
			System.out.println("-------------------------");
			System.out.println(" Enter Admin User ID: ");
			adminId = sc.nextLine();
			System.out.println(" Enter Admin Password: ");
			adminPassword =sc.nextLine();
			if(validData.checkAdminLoginDetails(adminId, adminPassword)) {
				admin = new AdminDetails(adminId, adminPassword);
				crud.addAdmin(admin);
				System.out.println(" SIGNUP SUCCESSFULL! TRY LOGGING IN NOW ! ");
			}
			else {
				
			}
			System.out.println(" WELCOME ADMIN ");
			System.out.println("----------------");
			System.out.println(" 1. Show Complaint Details ");
			//show all of the data in complaint details
			System.out.println(" 2. FIR Details ");
			System.out.println(" 3. ChargeSheet Details ");
			System.out.println(" 4. Criminal Details ");
			System.out.println(" 5. Exit ");
			System.out.println(" 6. Admin Details");
			choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				//show all of the data in complaint details
				break;
			case 2:
				System.out.println(" FIR DETAILS ");
				System.out.println("--------------");
				System.out.println(" 1. Create FIR ");
				System.out.println(" 2. Check FIR ");
				System.out.println(" 3. Show All FIR Details ");
				System.out.println(" 4. Exit ");
				choice = Integer.parseInt(sc.nextLine());
				switch(choice) {
				case 1:
					maxRange = 300;
					minRange = 200;
					System.out.println(" Create FIR ");
					System.out.println("------------- ");
					System.out.println(" Enter Complaint ID: ");
					complaintId = Integer.parseInt(sc.nextLine());
					System.out.println(" Enter Complaint Giver ID: ");
					complaintGiverId = sc.nextLine();
					System.out.println(" Enter Complaint Giver Name: ");
					complaintGiverName = sc.nextLine();
					System.out.println(" Enter Complaint Giver Address: ");
					complaintGiverAddress = sc.nextLine();
					System.out.println(" Enter Complaint Giver Phone Number: ");
					complaintGiverPhoneNumber = sc.nextLine();
					System.out.println(" Enter Complaint Date:(dd/MM/yyyy) ");
					complaintDate = sc.nextLine();
					System.out.println(" Enter Complaint Discription: ");
					complaintDiscription = sc.nextLine();
					firId = (int) (Math.random() *(maxRange-minRange+1)+minRange);
					System.out.println(" Enter FIR Date: ");
					firDate = sc.nextLine();
					System.out.println(" Enter Crime Type: ");
					complaintType = sc.nextLine();
					fir = new FirDetails(complaintId, complaintGiverId, complaintGiverName, complaintGiverAddress, complaintGiverPhoneNumber, complaintDate, complaintType, complaintDiscription, firId, firDate);
					crud.addFirDetails(fir);
					System.out.println(" FIR CREATED SUCCESSFULLY ");
					System.out.println(" FIR ID: "+firId);
					break;
				case 2:
					//checkFir();
					break;
				case 3:
					System.out.println(" Show All FIR Details ");
					System.out.println(" ----------------------- ");
					firDetailsList = crud.getAllFirDetails();
					for(FirDetails firList:firDetailsList ) {
						System.out.println(" FIR ID: "+firList.getFirId());
						System.out.println(" FIR Date: "+firList.getFirDate());
						System.out.println(" Complaint ID: "+firList.getComplaintId());
						System.out.println(" Complaint Date: "+firList.getComplaintDate());
						System.out.println(" Complaint Type: "+firList.getComplaintType());
						System.out.println(" Complaint Discription: "+firList.getComplaintDiscription());
						System.out.println(" Complaint Giver Name: "+firList.getComplaintGiverName());
						System.out.println(" Complaint Giver ID: "+firList.getComplaintGiverId());
						System.out.println(" Complaint Giver Address: "+firList.getComplaintGiverAddress());
						System.out.println("Complaint Giver Phone Number: "+firList.getComplaintGiverPhoneNumber());	
						
					}
				case 4:
					System.exit(1);
				default:
					System.out.println(" PLEASE ENTER A VALID INPUT! ");
				}
				
			case 3:
				System.out.println(" CHARGESHEET DETAILS ");
				System.out.println("-----------------------");
				System.out.println(" 1. Create Chargesheet ");
				System.out.println(" 2. Show All Chargesheets ");
				System.out.println(" 3. Exit ");
				choice = Integer.parseInt(sc.nextLine());
				switch(choice) {
				case 1:
					System.out.println(" New Chargesheet ");
					System.out.println("-------------------");
					maxRange = 300;
					minRange = 200;
					System.out.println(" Enter ChargeSheet Number: ");
					chargeSheetNumber = Integer.parseInt(sc.nextLine());
					System.out.println(" Enter ChargeSheet Date: ");
					chargeSheetDate = sc.nextLine();
					System.out.println(" Enter Complaint ID: ");
					complaintId = Integer.parseInt(sc.nextLine());
					System.out.println(" Enter Complaint Giver ID: ");
					complaintGiverId = sc.nextLine();
					System.out.println(" Enter Complaint Giver Name: ");
					complaintGiverName = sc.nextLine();
					System.out.println(" Enter Complaint Giver Address: ");
					complaintGiverAddress = sc.nextLine();
					System.out.println(" Enter Complaint Giver Phone Number: ");
					complaintGiverPhoneNumber = sc.nextLine();
					System.out.println(" Enter ChargeSheet Date:(dd/MM/yyyy) ");
					complaintDate = sc.nextLine();
					System.out.println(" Enter Crime Type: ");
					complaintType = sc.nextLine();
					System.out.println(" Enter Complaint Discription: ");
					complaintDiscription = sc.nextLine();
					firId = (int) (Math.random() *(maxRange-minRange+1)+minRange);
					System.out.println(" Enter FIR Date: ");
					firDate = sc.nextLine();
					System.out.println(" Criminal Name: ");
					criminalName = sc.nextLine();
					System.out.println(" Criminal Age: ");
					criminalAge = Integer.parseInt(sc.nextLine());
					System.out.println(" Criminal Address: ");
					criminalAddress = sc.nextLine();
					System.out.println(" Criminal Arrest Date(dd/MM/yyyy): ");
					criminalArrestDate = sc.nextLine();
					System.out.println(" Criminal Identification Marks: ");
					criminalIdentificationMarks = sc.nextLine();
					chargeSheet = new ChargeSheetDetails(complaintId, complaintGiverName, complaintGiverAddress, complaintGiverPhoneNumber, complaintDate, complaintType, firId, firDate, complaintDiscription, criminalName, criminalAge, criminalAddress, criminalArrestDate, criminalIdentificationMarks, chargeSheetNumber, chargeSheetDate);
					crud.addChargeSheetDetails(chargeSheet);
					System.out.println("ChargeSheet Created Successfully");
					break;
				case 2:
					System.out.println(" Display ChargeSheet Details: ");
					System.out.println(" ------------------------------- ");
					chargeSheetDetailsList = crud.getAllChargeSheetDetails();
					for(ChargeSheetDetails chargeSheetDetailsList:chargeSheetDetailsList) {
						System.out.println(" ChargeSheet Number: "+chargeSheetDetailsList.getChargeSheetNumber());
						System.out.println(" Enter ChargeSheet Date: "+chargeSheetDetailsList.getChargeSheetDate());
						System.out.println(" Enter Complaint ID: "+chargeSheetDetailsList.getComplaintId());
						System.out.println(" Enter Complaint Giver Name: "+chargeSheetDetailsList.getComplaintGiverName());
						System.out.println(" Enter Complaint Giver Address: "+chargeSheetDetailsList.getComplaintGiverAddress());
						System.out.println(" Enter Complaint Giver Phone Numeber: "+chargeSheetDetailsList.getComplaintGiverPhoneNumber());
						System.out.println(" Enter Complaint Date: "+chargeSheetDetailsList.getComplaintDate());
						System.out.println(" Enter Complaint Type: "+chargeSheetDetailsList.getComplaintType());
						System.out.println(" Enter Complaint Discription: "+chargeSheetDetailsList.getComplaintDiscription());
						System.out.println(" Enter FIR ID: "+chargeSheetDetailsList.getFirId());
						System.out.println(" Enter FIR Date: "+chargeSheetDetailsList.getFirDate());						
						System.out.println(" Enter Criminal Name: "+chargeSheetDetailsList.getCriminalName());
						System.out.println(" Enter Criminal Age: "+chargeSheetDetailsList.getCriminalAge());
						System.out.println(" Enter Criminal Address: "+chargeSheetDetailsList.getCriminalAddress());
						System.out.println(" Enter Criminal ArrestDate: "+chargeSheetDetailsList.getCriminalArrestDate());
						System.out.println(" Enter Criminal Identification Marks: "+chargeSheetDetailsList.getCriminalIdentificationMarks());
					}
					break;
				case 3:
					break;
				}
				break;
			case 4:
				criminalDetails();
				break;
			case 5:
				System.exit(1);
			case 6:
				System.out.println("Admin Details");
				adminDetailsList = crud.getAllAdmins();
				System.out.println("Display Admin Details in List");
				for(AdminDetails adminList:adminDetailsList) {
					System.out.println(" User ID: "+adminList.getAdminId());
					System.out.println(" User Email: "+adminList.getAdminPassword());
				}
			}
			
		case 3:		
			System.exit(1);
		default:
			System.out.println(" PLEASE ENTER A VALID INPUT! ");
		}
		
		
	}
	
	public void complaintDetails() {
		System.out.println(" COMPLAINTS ");
		System.out.println("--------------");
		System.out.println(" 1. Give Complaint ");
		System.out.println(" 2. Complaint Status ");
		System.out.println(" 3. Remove Complaint ");
		System.out.println(" 4. Exit ");
		choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			System.out.println("New Complaint");
			System.out.println("---------------");
			System.out.println(" Enter your Name: ");
			userName = sc.nextLine();
			System.out.println(" Enter your Address: ");
			userAddress = sc.nextLine();
			System.out.println(" Enter your Phone Number: ");
			userPhoneNumber = Long.parseLong(sc.nextLine());	
			LocalDate now = LocalDate.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			complaintDate =  (dtf.format(now)).toString();
			System.out.println(" Enter Crime Type: ");
			crimeType = sc.nextLine();
			System.out.println(" Enter Crime Description: ");
			crimeDescription = sc.nextLine();
			complaintId = (int) (Math.random() *(maxRange-minRange+1)+minRange);
			System.out.println(" COMPLAINT NOTED! ");
			//System.out.println("Your Complaint ID:");
			break;
		
		case 2:
			System.out.println(" Complaint Status ");
			System.out.println("-----------------");
			System.out.println(" Enter Complaint ID: ");
			break;
		
		case 3:
			
			System.out.println("Complaint Deletion");
			System.out.println("-----------------");
			System.out.println(" Enter Complaint ID: ");
			//CODE TO DELETION
			System.out.println("COMPLAINT DELETED!");
			break;
		
		case 4:
			System.exit(1);
		
		default:		
			System.out.println("PLEASE ENTER A VALID INPUT!");
		
	}
}
	public void giveComplaint() {
		
		System.out.println("New Complaint");
		System.out.println("---------------");
		System.out.println(" Enter your Name: ");
		userName = sc.nextLine();
		System.out.println(" Enter your Address: ");
		userAddress = sc.nextLine();
		System.out.println(" Enter your Phone Number: ");
		userPhoneNumber = Long.parseLong(sc.nextLine());	
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		complaintDate =  (dtf.format(now)).toString();
		System.out.println(" Enter Crime Type: ");
		crimeType = sc.nextLine();
		System.out.println(" Enter Crime Description: ");
		crimeDescription = sc.nextLine();
		complaintId = (int) (Math.random() *(maxRange-minRange+1)+minRange);
		System.out.println(" COMPLAINT NOTED! ");
		//System.out.println("Your Complaint ID:");
	}
	
	public void complaintStatus() {
		System.out.println(" Complaint Status ");
		System.out.println("-----------------");
		System.out.println(" Enter Complaint ID: ");
		//checking whether complaint exists or not.
	}

	
//	public void firDetails() {
//		System.out.println(" FIR DETAILS ");
//		System.out.println("--------------");
//		System.out.println(" 1. Add FIR ");
//		System.out.println(" 2. Check FIR ");
//		System.out.println(" 3. Exit ");
//		choice = Integer.parseInt(sc.nextLine());
//		switch(choice) {
//		case 1:
//			createFir();
//			break;
//		case 2:
//			checkFir();
//			break;
//		case 3:
//			System.exit(1);
//			break;
//		default:
//			System.out.println(" PLEASE ENTER A VALID INPUT! ");
//		}
//	}
	
//	public void createFir() {
//		
//		System.out.println(" FIR Creation ");
//		System.out.println("----------------");
//		firId = (int) (Math.random() *(maxRange-minRange+1)+minRange);
//		System.out.println(" Enter Chargesheet Number: ");
//		chargeSheetNumber = Integer.parseInt(sc.nextLine());
//		
//		
//	}
	
//	public void checkFir() {
//		
//		System.out.println(" FIR Status ");
//		System.out.println("--------------");
//		System.out.println(" Enter FIR ID: ");
//		//Code to be completed
//		System.out.println(" Enter FIR Status: ");
//	}
	
//	public void chargementDetails() {		
//	}
	
	
	public void createChargesheet() {
		System.out.println(" Enter Chargement ID: ");
		chargementId=(int) (Math.random() *(maxRange-minRange+1)+minRange);
		//FIR Details to get here
	}
	
	public void criminalDetails() {
		System.out.println(" CRIMINAL DETAILS ");
		System.out.println("---------------------");
		System.out.println(" 1. Add Criminal Details ");
		System.out.println(" 2. View All Criminal Details ");
		System.out.println(" 3. Exit ");
		choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			minRange = 100;
			maxRange = 500; 
			System.out.println(" Enter Criminal Name: ");
			criminalName = sc.nextLine();
			System.out.println(" Enter Criminal Age: ");
			criminalAge = Integer.parseInt(sc.nextLine());
			System.out.println(" Enter Criminal Address: ");
			criminalAddress = sc.nextLine();
			System.out.println(" Enter Criminal's Crime: ");
			crimeType = sc.nextLine();
			System.out.println(" Enter Criminal's Identification Marks: ");
			criminalIdentificationMarks= sc.nextLine();
			System.out.println(" Enter Criminal's Arrested Date (dd/MM/yyyy): ");
			criminalArrestedDate = sc.nextLine();
			//validate date
			System.out.println(" Enter Criminal's Prsion Time Served Period in Years: ");
			criminalYearsServed = Integer.parseInt(sc.nextLine());
			criminalId = (int)(Math.random() *(maxRange-minRange+1)+minRange);
			criminal = new CriminalDetails(criminalName, criminalAge, criminalAddress, criminalArrestedDate, criminalIdentificationMarks, crimeType, criminalYearsServed,criminalId);
			crud.addCriminal(criminal);
			System.out.println("CRIMINAL DETAILS ADDED SUCCESSFULLY!");			
			break;
		case 2:
			System.out.println(" Available Criminal Details ");
			criminalDetailsList = crud.getAllCriminalDetails();
			for(CriminalDetails criminal:criminalDetailsList) {
				System.out.println(" Criminal ID: "+criminal.getCriminalId());
				System.out.println(" Criminal Name: "+criminal.getCriminalName());
				System.out.println(" Criminal Age: "+criminal.getCriminalAge());
				System.out.println(" Criminal Address: "+criminal.getCriminalAddress());
				System.out.println(" Criminal Arrest Date: "+criminal.getCriminalArrestDate());
				System.out.println(" Criminal Identification Marks: "+criminal.getCriminalIdentificationMarks());
				System.out.println(" Crime Type: "+criminal.getCrimeType());
				System.out.println(" Criminal Years Served in Prison: "+criminal.getYearsServed());
			}
			break;
		case 3: 
				System.exit(1);
				
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String options;
		Main m = new Main();
		do {
		m.mainMenu();
		System.out.println(" Do You Want To Continue (Yes or No) ? ");
		options = sc.nextLine();
		options = options.toLowerCase();
		} 
		while(options.equals("yes"));
		sc.close();
	}
}
