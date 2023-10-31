package com.bfpoms.bfpoms.Entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "db_comply")
public class ComplyApplicationEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int comply_id;
	
	//basic information
	private int application_no;
	private String bldgpermit_no;
	private Date date_received;
	private String applicants_name;
	private String project_name;
	private String address;
	private String type_occupancy;
	private String contact_no;
	private String email;
	
	//inspected information
	private Date date_inspected;
	private int inspection_no;
	private Date date_ntc;
	private int ntc_no;
	
	//inspectors
	private String team_leader;
	private ArrayList<String[]> fire_inspectors;
	private ArrayList<String[]> defects;
	
	private String administrative_fine;
	private String status;
	
	//constructor
	public ComplyApplicationEntity() {}

	public ComplyApplicationEntity(int comply_id, int application_no, String bldgpermit_no, Date date_received,
			String applicants_name, String project_name, String address, String type_occupancy, String contact_no,
			String email, Date date_inspected, int inspection_no, Date date_ntc, int ntc_no, String team_leader,
			ArrayList<String[]> fire_inspectors, ArrayList<String[]> defects, String administrative_fine,
			String status) {
		super();
		this.comply_id = comply_id;
		this.application_no = application_no;
		this.bldgpermit_no = bldgpermit_no;
		this.date_received = date_received;
		this.applicants_name = applicants_name;
		this.project_name = project_name;
		this.address = address;
		this.type_occupancy = type_occupancy;
		this.contact_no = contact_no;
		this.email = email;
		this.date_inspected = date_inspected;
		this.inspection_no = inspection_no;
		this.date_ntc = date_ntc;
		this.ntc_no = ntc_no;
		this.team_leader = team_leader;
		this.fire_inspectors = fire_inspectors;
		this.defects = defects;
		this.administrative_fine = administrative_fine;
		this.status = status;
	}

	public int getComply_id() {
		return comply_id;
	}

	public void setComply_id(int comply_id) {
		this.comply_id = comply_id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Date getDate_ntc() {
		return date_ntc;
	}

	public void setDate_ntc(Date date_ntc) {
		this.date_ntc = date_ntc;
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

	public ArrayList<String[]> getFire_inspectors() {
		return fire_inspectors;
	}

	public void setFire_inspectors(ArrayList<String[]> fire_inspectors) {
		this.fire_inspectors = fire_inspectors;
	}

	public ArrayList<String[]> getDefects() {
		return defects;
	}

	public void setDefects(ArrayList<String[]> defects) {
		this.defects = defects;
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
