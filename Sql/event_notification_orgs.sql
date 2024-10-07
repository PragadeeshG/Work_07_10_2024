create table if not exists event_notification_orgs(
event_notification_org_code bigint not null,
event_notification_org_name varchar(255) null,
event_notification_org_desc varchar(255) null,
remarks varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint event_notification_orgs_pk primary key(event_notification_org_code));