CREATE TABLE customer
   (
       custid VARCHAR(6),
       first_name VARCHAR(30),
       middle_name VARCHAR(30),
       last_name VARCHAR(30),
       city VARCHAR(15),
       mobile_no VARCHAR(10),
       email VARCHAR(100),
       occupation VARCHAR(10),
       dob TIMESTAMP,
      CONSTRAINT customer_custid_pk PRIMARY KEY(custid)
   );

CREATE TABLE branch
   (
    bank_id VARCHAR(6),
    bank_name VARCHAR(30),
    bank_city VARCHAR(30),
    bank_ifsc VARCHAR(30),
    CONSTRAINT branch_bid_pk PRIMARY KEY(bid) 
   );
   
CREATE TABLE account
   (
      acnumber VARCHAR(10),
      custid  VARCHAR(6),
      bank_id VARCHAR(6),
      opening_balance INT(7),
      closing_balance INT(7),
      created_on TIMESTAMP,
      atype VARCHAR(10),
      astatus VARCHAR(10),
      CONSTRAINT account_acnumber_pk PRIMARY KEY(acnumber),
      CONSTRAINT account_custid_fk FOREIGN KEY(custid) REFERENCES customer(custid),
      CONSTRAINT account_bid_fk FOREIGN KEY(bank_id) REFERENCES branch(bank_id) 
    );

CREATE TABLE payee(
	    payee_id VARCHAR(10),
		custid  VARCHAR(6),
		payee_no INT(7),
		payee_fname VARCHAR(30),
		payee_lname VARCHAR(30),
		payee_bank_name  VARCHAR(30),
		payee_bank_ifsc VARCHAR(30),
		payee_bank_acno VARCHAR(30),
		payee_status VARCHAR(6),
		created_on TIMESTAMP,		
		CONSTRAINT payee_number_pk PRIMARY KEY(custid,payee_no),
		CONSTRAINT account_custid_fk FOREIGN KEY(custid) REFERENCES customer(custid)
);

CREATE TABLE transaction(
	  transaction_number VARCHAR(20),
	  acnumber VARCHAR(6),
      custid  VARCHAR(6),     
      transaction_date TIMESTAMP,
      transaction_description VARCHAR(100),
      transaction_amount VARCHAR(6),
      transaction_type VARCHAR(6),
      CONSTRAINT transaction_number_pk PRIMARY KEY(transaction_number),
);
 

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
