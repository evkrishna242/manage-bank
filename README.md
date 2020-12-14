Technology Stack: Spring Boot, Hibernate, H2
Steps:
1.	Import the project to STS or any IDE which supports spring boot.
2.	Run the Application as Spring Boot Application
3.	Open url http://localhost:8080/console/ in browser
4.	Set JDBC URL as  jdbc:h2:mem:testdb to log in to Test DB. 
5.	Run the provided Test Data Queries to insert Test Data. 

Queries:
INSERT INTO customer(custid,first_name,middle_name,last_name,city,mobile_no,email,occupation,dob) VALUES ('100001','John','Doe','five','Chennai','9876543210','sample@mail.com','Business','1990-01-01 12:00:00');
INSERT INTO customer(custid,first_name,middle_name,last_name,city,mobile_no,email,occupation,dob) VALUES ('100002','John','Doe','five','Chennai','9876543210','sample@mail.com','Business','1990-01-01 12:00:00');
INSERT INTO customer(custid,first_name,middle_name,last_name,city,mobile_no,email,occupation,dob) VALUES ('100003','John','Doe','five','Chennai','9876543210','sample@mail.com','Business','1990-01-01 12:00:00');
INSERT INTO customer(custid,first_name,middle_name,last_name,city,mobile_no,email,occupation,dob) VALUES ('100004','John','Doe','five','Chennai','9876543210','sample@mail.com','Business','1990-01-01 12:00:00');
INSERT INTO customer(custid,first_name,middle_name,last_name,city,mobile_no,email,occupation,dob) VALUES ('100005','John','Doe','five','Chennai','9876543210','sample@mail.com','Business','1990-01-01 12:00:00');

INSERT INTO branch(bank_id,bank_name,bank_city,bank_ifsc) VALUES ('BANK01','Test Bank1','Chennai','TEST00011');   
INSERT INTO branch(bank_id,bank_name,bank_city,bank_ifsc) VALUES ('BANK02','Test Bank2','Chennai','TEST00012');  
INSERT INTO branch(bank_id,bank_name,bank_city,bank_ifsc) VALUES ('BANK03','Test Bank3','Chennai','TEST00013');  
INSERT INTO branch(bank_id,bank_name,bank_city,bank_ifsc) VALUES ('BANK04','Test Bank4','Chennai','TEST00014');  
INSERT INTO branch(bank_id,bank_name,bank_city,bank_ifsc) VALUES ('BANK05','Test Bank5','Chennai','TEST00015');  

INSERT INTO account(acnumber,custid,bank_id,opening_balance,closing_balance,created_on,atype,astatus) VALUES ('500001','100001','BANK01',10000,10000,'2019-01-03 12:00:00','Savings','Active');
INSERT INTO account(acnumber,custid,bank_id,opening_balance,closing_balance,created_on,atype,astatus) VALUES ('500002','100002','BANK02',10000,10000,'2019-01-03 12:00:00','Savings','Active');
INSERT INTO account(acnumber,custid,bank_id,opening_balance,closing_balance,created_on,atype,astatus) VALUES ('500003','100003','BANK03',10000,10000,'2019-01-03 12:00:00','Savings','Active');
INSERT INTO account(acnumber,custid,bank_id,opening_balance,closing_balance,created_on,atype,astatus) VALUES ('500004','100004','BANK04',10000,10000,'2019-01-03 12:00:00','Savings','Active');
INSERT INTO account(acnumber,custid,bank_id,opening_balance,closing_balance,created_on,atype,astatus) VALUES ('500005','100005','BANK05',10000,10000,'2019-01-03 12:00:00','Savings','Active');

INSERT INTO payee(payee_id,custid,payee_no,payee_fname,payee_lname,payee_bank_name,payee_bank_ifsc,payee_bank_acno,payee_status,created_on) VALUES ('P00001','100001',1,'Test','One','Test Bank1','TEST00011','700001','Active','2019-11-11 12:00:00');
INSERT INTO payee(payee_id,custid,payee_no,payee_fname,payee_lname,payee_bank_name,payee_bank_ifsc,payee_bank_acno,payee_status,created_on) VALUES ('P00002','100001',2,'Test','Two','Test Bank2','TEST00012','700002','Active','2019-11-11 12:00:00');
INSERT INTO payee(payee_id,custid,payee_no,payee_fname,payee_lname,payee_bank_name,payee_bank_ifsc,payee_bank_acno,payee_status,created_on) VALUES ('P00003','100002',1,'Test','One','Test Bank1','TEST00011','700001','Active','2019-11-11 12:00:00');
INSERT INTO payee(payee_id,custid,payee_no,payee_fname,payee_lname,payee_bank_name,payee_bank_ifsc,payee_bank_acno,payee_status,created_on) VALUES ('P00004','100002',2,'Test','Two','Test Bank2','TEST00012','700002','Active','2019-11-11 12:00:00');
INSERT INTO payee(payee_id,custid,payee_no,payee_fname,payee_lname,payee_bank_name,payee_bank_ifsc,payee_bank_acno,payee_status,created_on) VALUES ('P00005','100003',1,'Test','One','Test Bank1','TEST00011','700001','Active','2019-11-11 12:00:00');
INSERT INTO payee(payee_id,custid,payee_no,payee_fname,payee_lname,payee_bank_name,payee_bank_ifsc,payee_bank_acno,payee_status,created_on) VALUES ('P00006','100003',2,'Test','Two','Test Bank2','TEST00012','700002','Active','2019-11-11 12:00:00');
INSERT INTO payee(payee_id,custid,payee_no,payee_fname,payee_lname,payee_bank_name,payee_bank_ifsc,payee_bank_acno,payee_status,created_on) VALUES ('P00007','100004',1,'Test','One','Test Bank1','TEST00011','700001','Active','2019-11-11 12:00:00');
INSERT INTO payee(payee_id,custid,payee_no,payee_fname,payee_lname,payee_bank_name,payee_bank_ifsc,payee_bank_acno,payee_status,created_on) VALUES ('P00008','100004',2,'Test','Two','Test Bank2','TEST00012','700002','Active','2019-11-11 12:00:00');
INSERT INTO payee(payee_id,custid,payee_no,payee_fname,payee_lname,payee_bank_name,payee_bank_ifsc,payee_bank_acno,payee_status,created_on) VALUES ('P00009','100005',1,'Test','One','Test Bank1','TEST00011','700001','Active','2019-11-11 12:00:00');
INSERT INTO payee(payee_id,custid,payee_no,payee_fname,payee_lname,payee_bank_name,payee_bank_ifsc,payee_bank_acno,payee_status,created_on) VALUES ('P00010','100005',2,'Test','Two','Test Bank2','TEST00012','700002','Active','2019-11-11 12:00:00');

INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000001','500001','100001','2019-12-11 12:00:00','Transaction','100.00','Dr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000002','500001','100001','2019-12-11 12:00:00','Transaction','100.00','Cr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000003','500001','100001','2019-12-11 12:00:00','Transaction','100.00','Dr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000004','500002','100002','2019-12-11 12:00:00','Transaction','100.00','Dr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000005','500002','100002','2019-12-11 12:00:00','Transaction','100.00','Cr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000006','500002','100002','2019-12-11 12:00:00','Transaction','100.00','Dr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000007','500003','100003','2019-12-11 12:00:00','Transaction','100.00','Dr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000008','500003','100003','2019-12-11 12:00:00','Transaction','100.00','Cr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000009','500003','100003','2019-12-11 12:00:00','Transaction','100.00','Dr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000010','500004','100004','2019-12-11 12:00:00','Transaction','100.00','Dr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000011','500004','100004','2019-12-11 12:00:00','Transaction','100.00','Cr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000012','500004','100004','2019-12-11 12:00:00','Transaction','100.00','Dr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000013','500005','100005','2019-12-11 12:00:00','Transaction','100.00','Dr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000014','500005','100005','2019-12-11 12:00:00','Transaction','100.00','Cr');
INSERT INTO transaction(transaction_number,acnumber,custid,transaction_date,transaction_description,transaction_amount,transaction_type) VALUES ('100000000015','500005','100005','2019-12-11 12:00:00','Transaction','100.00','Dr');


Import the postman collection to postman to test the APIs.
