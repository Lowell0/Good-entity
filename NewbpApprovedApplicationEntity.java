package com.bfpoms.bfpoms.Entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_newbpapproved")
public class NewbpApprovedApplicationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int newbp_id;
	
	//basic information
	private String bspermit_no;
	private String permittee;
	private String business_name;
	private String address;
	private String nature_business;
	private String type_occupancy;
	private String contact_no;
	private String email;
	private Date date_received;
	
	//date of inspection
	private Date date_inspection;
	private int inspection_np;
	
	//fsic date and number
	private int fsic_no;
	private Date fsic_date;
	
	//FSIF payment
	private int amount;
	private int or_no;
	private Date date;
	
	//fire safety inspectors
	private String team_leadr;
	private ArrayList<String[]>fire_inspectors;
	private String [] recommendation;
	
	private String remarks;
	
	//constructor
	public NewbpApprovedApplicationEntity() {}

	public NewbpApprovedApplicationEntity(int newbp_id, String bspermit_no, String permittee, String business_name,
			String address, String nature_business, String type_occupancy, String contact_no, String email,
			Date date_received, Date date_inspection, int inspection_np, int fsic_no, Date fsic_date, int amount,
			int or_no, Date date, String team_leadr, ArrayList<String[]> fire_inspectors, String[] recommendation,
			String remarks) {
		super();
		this.newbp_id = newbp_id;
		this.bspermit_no = bspermit_no;
		this.permittee = permittee;
		this.business_name = business_name;
		this.address = address;
		this.nature_business = nature_business;
		this.type_occupancy = type_occupancy;
		this.contact_no = contact_no;
		this.email = email;
		this.date_received = date_received;
		this.date_inspection = date_inspection;
		this.inspection_np = inspection_np;
		this.fsic_no = fsic_no;
		this.fsic_date = fsic_date;
		this.amount = amount;
		this.or_no = or_no;
		this.date = date;
		this.team_leadr = team_leadr;
		this.fire_inspectors = fire_inspectors;
		this.recommendation = recommendation;
		this.remarks = remarks;
	}

	public int getNewbp_id() {
		return newbp_id;
	}

	public void setNewbp_id(int newbp_id) {
		this.newbp_id = newbp_id;
	}

	public String getBspermit_no() {
		return bspermit_no;
	}

	public void setBspermit_no(String bspermit_no) {
		this.bspermit_no = bspermit_no;
	}

	public String getPermittee() {
		return permittee;
	}

	public void setPermittee(String permittee) {
		this.permittee = permittee;
	}

	public String getBusiness_name() {
		return business_name;
	}

	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNature_business() {
		return nature_business;
	}

	public void setNature_business(String nature_business) {
		this.nature_business = nature_business;
	}

	public String getType_occupancy() {
		return type_occupancy;
	}

	public void setType_occupancy(String type_occupancy) {
		this.type_occupancy = type_occupancy;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate_received() {
		return date_received;
	}

	public void setDate_received(Date date_received) {
		this.date_received = date_received;
	}

	public Date getDate_inspection() {
		return date_inspection;
	}

	public void setDate_inspection(Date date_inspection) {
		this.date_inspection = date_inspection;
	}

	public int getInspection_np() {
		return inspection_np;
	}

	public void setInspection_np(int inspection_np) {
		this.inspection_np = inspection_np;
	}

	public int getFsic_no() {
		return fsic_no;
	}

	public void setFsic_no(int fsic_no) {
		this.fsic_no = fsic_no;
	}

	public Date getFsic_date() {
		return fsic_date;
	}

	public void setFsic_date(Date fsic_date) {
		this.fsic_date = fsic_date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
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

	public String getTeam_leadr() {
		return team_leadr;
	}

	public void setTeam_leadr(String team_leadr) {
		this.team_leadr = team_leadr;
	}

	public ArrayList<String[]> getFire_inspectors() {
		return fire_inspectors;
	}

	public void setFire_inspectors(ArrayList<String[]> fire_inspectors) {
		this.fire_inspectors = fire_inspectors;
	}

	public String[] getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String[] recommendation) {
		this.recommendation = recommendation;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	


}
