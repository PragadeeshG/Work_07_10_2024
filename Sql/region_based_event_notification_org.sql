create table if not exists region_based_event_notification_org(
event_notification_org_code bigint not null,
routine_impact_analysis varchar(255) null,
event_notification_org_region varchar(255) null,
event_notification_org_level varchar(255) null,
metadata_code bigint null,
moduledata varchar(255) null,
remarks varchar(255) null,
content varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint region_based_event_notification_org_pk primary key(event_notification_org_code));