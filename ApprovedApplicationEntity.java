package com.bfpoms.bfpoms.Entity;

import java.util.ArrayList;
import java.util.Date;

//import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tb_approved")
public class ApprovedApplicationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int approved_id;
	
	//Basic information
	private int application_no;
	private int bldgpermit_no;
	private String applicants_name;
	private String project_name;
	private String location;
	private int contact_no;
	private int fees;
	private Date date_received;
	
	//FSIC date and number
	private Date fsic_date;
	private int fsic_no;

	//payment and additional fees
	private double ammount;
	private int or_no;
	private Date date;
	private String nature_of_collection;
	
	//recommendations
	private ArrayList<String[]> recommendations;
	private ArrayList<String[]> fire_inspectors;
	
	private int inspection_no;
	private String status;
	
	
	
	
	//@OneToMany(cascade = CascadeType.MERGE)
	//private Set<NewApplicationEntity> NewApplication;
	
	
	
	//constructor
	public ApprovedApplicationEntity() {}




	public ApprovedApplicationEntity(int approved_id, int application_no, int bldgpermit_no, String applicants_name,
			String project_name, String location, int contact_no, int fees, Date date_received, Date fsic_date,
			int fsic_no, double ammount, int or_no, Date date, String nature_of_collection,
			ArrayList<String[]> recommendations, ArrayList<String[]> fire_inspectors, int inspection_no,
			String status) {
		super();
		this.approved_id = approved_id;
		this.application_no = application_no;
		this.bldgpermit_no = bldgpermit_no;
		this.applicants_name = applicants_name;
		this.project_name = project_name;
		this.location = location;
		this.contact_no = contact_no;
		this.fees = fees;
		this.date_received = date_received;
		this.fsic_date = fsic_date;
		this.fsic_no = fsic_no;
		this.ammount = ammount;
		this.or_no = or_no;
		this.date = date;
		this.nature_of_collection = nature_of_collection;
		this.recommendations = recommendations;
		this.fire_inspectors = fire_inspectors;
		this.inspection_no = inspection_no;
		this.status = status;
	}




	public int getApproved_id() {
		return approved_id;
	}




	public void setApproved_id(int approved_id) {
		this.approved_id = approved_id;
	}




	public int getApplication_no() {
		return application_no;
	}




	public void setApplication_no(int application_no) {
		this.application_no = application_no;
	}




	public int getBldgpermit_no() {
		return bldgpermit_no;
	}




	public void setBldgpermit_no(int bldgpermit_no) {
		this.bldgpermit_no = bldgpermit_no;
	}




	public String getApplicants_name() {
		return applicants_name;
	}




	public void setApplicants_name(String applicants_name) {
		this.applicants_name = applicants_name;
	}




	public String getProject_name() {
		return project_name;
	}




	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public int getContact_no() {
		return contact_no;
	}




	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}




	public int getFees() {
		return fees;
	}




	public void setFees(int fees) {
		this.fees = fees;
	}




	public Date getDate_received() {
		return date_received;
	}




	public void setDate_received(Date date_received) {
		this.date_received = date_received;
	}




	public Date getFsic_date() {
		return fsic_date;
	}




	public void setFsic_date(Date fsic_date) {
		this.fsic_date = fsic_date;
	}




	public int getFsic_no() {
		return fsic_no;
	}




	public void setFsic_no(int fsic_no) {
		this.fsic_no = fsic_no;
	}




	public double getAmmount() {
		return ammount;
	}




	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}




	public int getOr_no() {
		return or_no;
	}




	public void setOr_no(int or_no) {
		this.or_no = or_no;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}




	public String getNature_of_collection() {
		return nature_of_collection;
	}




	public void setNature_of_collection(String nature_of_collection) {
		this.nature_of_collection = nature_of_collection;
	}




	public ArrayList<String[]> getRecommendations() {
		return recommendations;
	}




	public void setRecommendations(ArrayList<String[]> recommendations) {
		this.recommendations = recommendations;
	}




	public ArrayList<String[]> getFire_inspectors() {
		return fire_inspectors;
	}




	public void setFire_inspectors(ArrayList<String[]> fire_inspectors) {
		this.fire_inspectors = fire_inspectors;
	}




	public int getInspection_no() {
		return inspection_no;
	}




	public void setInspection_no(int inspection_no) {
		this.inspection_no = inspection_no;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}


	


}
	
	

