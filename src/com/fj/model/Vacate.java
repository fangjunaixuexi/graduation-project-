package com.fj.model;


public class Vacate {
	private Integer vacate_id;
	private String vacate_name;
	private String start_time;
	private String over_time;
	private Integer leave_day;
	private String leave_cause;
	private String admin;
	private Integer audit;
	
	public Integer getAudit() {
		return audit;
	}
	public void setAudit(Integer audit) {
		this.audit = audit;
	}

	
	public Integer getVacate_id() {
		return vacate_id;
	}
	public void setVacate_id(Integer vacate_id) {
		this.vacate_id = vacate_id;
	}
	public String getVacate_name() {
		return vacate_name;
	}
	public void setVacate_name(String vacate_name) {
		this.vacate_name = vacate_name;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getOver_time() {
		return over_time;
	}
	public void setOver_time(String over_time) {
		this.over_time = over_time;
	}
	public Integer getLeave_day() {
		return leave_day;
	}
	public void setLeave_day(Integer leave_day) {
		this.leave_day = leave_day;
	}
	public String getLeave_cause() {
		return leave_cause;
	}
	public void setLeave_cause(String leave_cause) {
		this.leave_cause = leave_cause;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	
}
