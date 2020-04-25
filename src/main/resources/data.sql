/*create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);*/

INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES
(10001, 'Smeet Bhatt', 'Mumbai', SYSDATE()),
(10002, 'Vidhi Gosalia', 'Andaman', SYSDATE()),
(10003, 'Raj Patel', 'Surat', SYSDATE());