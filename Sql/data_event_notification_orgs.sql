create table if not exists data_event_notification_orgs(
event_notification_org_code bigint not null,
modular_data varchar(255) null,
data_reqion varchar(255) null,
event_notification_org_team varchar(255) null,
contact varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint data_event_notification_orgs_pk primary key(event_notification_org_code));