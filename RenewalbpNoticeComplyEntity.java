package com.bfpoms.bfpoms.Entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_renewalnoticetocomply")
public class RenewalbpNoticeComplyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int renewnc_id;
	
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
	
	//date inspected
	private Date date_inspected;
	private int inspection_no;
	private String ntc_date;
	private int ntc_no;
	
	//fire safety inspectors
	private String team_leader;
	private ArrayList<String[]>fire_inspector;
	private ArrayList<String[]> defects;
	
	//date received notice to comply
	private Date date;
	private String name;
	
	private String administrative_fine;
	private String status;
	
	
	//constructor
	public RenewalbpNoticeComplyEntity() {}


	public RenewalbpNoticeComplyEntity(int renewnc_id, String bspermit_no, String permittee, String business_name,
			String address, String nature_business, String type_occupancy, String contact_no, String email,
			Date date_received, Date date_inspected, int inspection_no, String ntc_date, int ntc_no,
			String team_leader, ArrayList<String[]> fire_inspector, ArrayList<String[]> defects, Date date, String name,
			String administrative_fine, String status) {
		super();
		this.renewnc_id = renewnc_id;
		this.bspermit_no = bspermit_no;
		this.permittee = permittee;
		this.business_name = business_name;
		this.address = address;
		this.nature_business = nature_business;
		this.type_occupancy = type_occupancy;
		this.contact_no = contact_no;
		this.email = email;
		this.date_received = date_received;
		this.date_inspected = date_inspected;
		this.inspection_no = inspection_no;
		this.ntc_date = ntc_date;
		this.ntc_no = ntc_no;
		this.team_leader = team_leader;
		this.fire_inspector = fire_inspector;
		this.defects = defects;
		this.date = date;
		this.name = name;
		this.administrative_fine = administrative_fine;
		this.status = status;
	}
	//getters and setters
	public int getRenewnc_id() {
		return renewnc_id;
	}


	//public void setRenewnc_id(int renewnc_id) {
		//this.renewnc_id = renewnc_id;
	//}


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


	public Date getDate_inspected() {
		return date_inspected;
	}


	public void setDate_inspected(Date date_inspected) {
		this.date_inspected = date_inspected;
	}


	public int getInspection_no() {
		return inspection_no;
	}


	public void setInspection_no(int inspection_no) {
		this.inspection_no = inspection_no;
	}


	public String getNtc_date() {
		return ntc_date;
	}


	public void setNtc_date(String ntc_date) {
		this.ntc_date = ntc_date;
	}


	public int getNtc_no() {
		return ntc_no;
	}


	public void setNtc_no(int ntc_no) {
		this.ntc_no = ntc_no;
	}


	public String getTeam_leader() {
		return team_leader;
	}


	public void setTeam_leader(String team_leader) {
		this.team_leader = team_leader;
	}


	public ArrayList<String[]>getFire_inspector() {
		return fire_inspector;
	}


	public void setFire_inspector(ArrayList<String[]>fire_inspector) {
		this.fire_inspector = fire_inspector;
	}


	public ArrayList<String[]> getDefects() {
		return defects;
	}


	public void setDefects(ArrayList<String[]> defects) {
		this.defects = defects;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdministrative_fine() {
		return administrative_fine;
	}


	public void setAdministrative_fine(String administrative_fine) {
		this.administrative_fine = administrative_fine;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	


	

}
