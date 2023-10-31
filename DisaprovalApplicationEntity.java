package com.bfpoms.bfpoms.Entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_disapproval")
public class DisaprovalApplicationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int disapproval_id;
	
	//basic information
	private int application_no;
	private String bldgpermit_no;
	private Date date_received;
	private String applicants_name;
	private String project_name;
	private String location;
	private int contact_no;
	private int ammount_paid;
	
	//nod date and number
	private int nod_no;
	private Date date_nod;
	
	//deficiencies
	private ArrayList<String[]> defects;
	
	//Received NoD
	private String name;
	
	private int inspection_no;
	private String status;
	
	//Constructor
	public DisaprovalApplicationEntity() {}

	public DisaprovalApplicationEntity(int disapproval_id, int application_no, String bldgpermit_no, Date date_received,
			String applicants_name, String project_name, String location, int contact_no, int ammount_paid, int nod_no,
			Date date_nod, ArrayList<String[]> defects, String name, int inspection_no, String status) {
		super();
		this.disapproval_id = disapproval_id;
		this.application_no = application_no;
		this.bldgpermit_no = bldgpermit_no;
		this.date_received = date_received;
		this.applicants_name = applicants_name;
		this.project_name = project_name;
		this.location = location;
		this.contact_no = contact_no;
		this.ammount_paid = ammount_paid;
		this.nod_no = nod_no;
		this.date_nod = date_nod;
		this.defects = defects;
		this.name = name;
		this.inspection_no = inspection_no;
		this.status = status;
	}

	public int getDisapproval_id() {
		return disapproval_id;
	}

	public void setDisapproval_id(int disapproval_id) {
		this.disapproval_id = disapproval_id;
	}

	public int getApplication_no() {
		return application_no;
	}

	public void setApplication_no(int application_no) {
		this.application_no = application_no;
	}

	public String getBldgpermit_no() {
		return bldgpermit_no;
	}

	public void setBldgpermit_no(String bldgpermit_no) {
		this.bldgpermit_no = bldgpermit_no;
	}

	public Date getDate_received() {
		return date_received;
	}

	public void setDate_received(Date date_received) {
		this.date_received = date_received;
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

	public int getAmmount_paid() {
		return ammount_paid;
	}

	public void setAmmount_paid(int ammount_paid) {
		this.ammount_paid = ammount_paid;
	}

	public int getNod_no() {
		return nod_no;
	}

	public void setNod_no(int nod_no) {
		this.nod_no = nod_no;
	}

	public Date getDate_nod() {
		return date_nod;
	}

	public void setDate_nod(Date date_nod) {
		this.date_nod = date_nod;
	}

	public ArrayList<String[]> getDefects() {
		return defects;
	}

	public void setDefects(ArrayList<String[]> defects) {
		this.defects = defects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
