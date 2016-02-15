create table PatientDetails(
     id varchar(100),  
	 first_name varchar(200),  
	 last_name varchar(200),  
	 user_name varchar(400),  
	 birth_date varchar(50), 
	 gender varchar(100), 
	 mobile_number varchar(200),  
	 current_addr varchar(1000),  
	 perm_addr varchar(1000),  
	 location varchar(200),  
     primary key (id)
     );
     
     select * from patientdetails
     
     INSERT INTO `patientdatabase`.`patientdetails` (`id`, `first_name`, `last_name`, `user_name`, `birth_date`, `gender`, `mobile_number`, `current_addr`, `perm_addr`, `location`) VALUES ('1', 'Shaheen', 'S', 'shaheen.1306@gmail.com', '13-06-1989', 'Female', '9916529606', 'dummy addr', 'dummy addr', 'BENGALURU');
