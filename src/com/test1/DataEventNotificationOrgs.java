package com.test1;

public class DataEventNotificationOrgs {
	private long eventNotificationOrgCode;
	private String modularData;
	private String dataReqion;
	private String eventNotificationOrgTeam;
	private String contact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataEventNotificationOrgs() {

	}

	public DataEventNotificationOrgs(long eventNotificationOrgCode, String modularData, String dataReqion,
			String eventNotificationOrgTeam, String contact, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.eventNotificationOrgCode = eventNotificationOrgCode;
		this.modularData = modularData;
		this.dataReqion = dataReqion;
		this.eventNotificationOrgTeam = eventNotificationOrgTeam;
		this.contact = contact;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getEventNotificationOrgCode() {
		return eventNotificationOrgCode;
	}

	public void setEventNotificationOrgCode(long eventNotificationOrgCode) {
		this.eventNotificationOrgCode = eventNotificationOrgCode;
	}

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
	}

	public String getDataReqion() {
		return dataReqion;
	}

	public void setDataReqion(String dataReqion) {
		this.dataReqion = dataReqion;
	}

	public String getEventNotificationOrgTeam() {
		return eventNotificationOrgTeam;
	}

	public void setEventNotificationOrgTeam(String eventNotificationOrgTeam) {
		this.eventNotificationOrgTeam = eventNotificationOrgTeam;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
