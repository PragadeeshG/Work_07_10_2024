package com.test1;

public class EventNotificationOrgs {
	private long eventNotificationOrgCode;
	private String eventNotificationOrgName;
	private String eventNotificationOrgDesc;
	private String remarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public EventNotificationOrgs() {

	}

	public EventNotificationOrgs(long eventNotificationOrgCode, String eventNotificationOrgName,
			String eventNotificationOrgDesc, String remarks, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.eventNotificationOrgCode = eventNotificationOrgCode;
		this.eventNotificationOrgName = eventNotificationOrgName;
		this.eventNotificationOrgDesc = eventNotificationOrgDesc;
		this.remarks = remarks;
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

	public String getEventNotificationOrgName() {
		return eventNotificationOrgName;
	}

	public void setEventNotificationOrgName(String eventNotificationOrgName) {
		this.eventNotificationOrgName = eventNotificationOrgName;
	}

	public String getEventNotificationOrgDesc() {
		return eventNotificationOrgDesc;
	}

	public void setEventNotificationOrgDesc(String eventNotificationOrgDesc) {
		this.eventNotificationOrgDesc = eventNotificationOrgDesc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
