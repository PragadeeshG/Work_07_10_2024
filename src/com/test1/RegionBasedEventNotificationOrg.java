package com.test1;

public class RegionBasedEventNotificationOrg {
	private long eventNotificationOrgCode;
	private String routineImpactAnalysis;
	private String eventNotificationOrgRegion;
	private String eventNotificationOrgLevel;
	private long metadataCode;
	private String moduledata;
	private String remarks;
	private String content;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RegionBasedEventNotificationOrg() {

	}

	public RegionBasedEventNotificationOrg(long eventNotificationOrgCode, String routineImpactAnalysis,
			String eventNotificationOrgRegion, String eventNotificationOrgLevel, long metadataCode, String moduledata,
			String remarks, String content, String creationDate, String modifiedDate, String entityState) {
		super();
		this.eventNotificationOrgCode = eventNotificationOrgCode;
		this.routineImpactAnalysis = routineImpactAnalysis;
		this.eventNotificationOrgRegion = eventNotificationOrgRegion;
		this.eventNotificationOrgLevel = eventNotificationOrgLevel;
		this.metadataCode = metadataCode;
		this.moduledata = moduledata;
		this.remarks = remarks;
		this.content = content;
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

	public String getRoutineImpactAnalysis() {
		return routineImpactAnalysis;
	}

	public void setRoutineImpactAnalysis(String routineImpactAnalysis) {
		this.routineImpactAnalysis = routineImpactAnalysis;
	}

	public String getEventNotificationOrgRegion() {
		return eventNotificationOrgRegion;
	}

	public void setEventNotificationOrgRegion(String eventNotificationOrgRegion) {
		this.eventNotificationOrgRegion = eventNotificationOrgRegion;
	}

	public String getEventNotificationOrgLevel() {
		return eventNotificationOrgLevel;
	}

	public void setEventNotificationOrgLevel(String eventNotificationOrgLevel) {
		this.eventNotificationOrgLevel = eventNotificationOrgLevel;
	}

	public long getMetadataCode() {
		return metadataCode;
	}

	public void setMetadataCode(long metadataCode) {
		this.metadataCode = metadataCode;
	}

	public String getModuledata() {
		return moduledata;
	}

	public void setModuledata(String moduledata) {
		this.moduledata = moduledata;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
