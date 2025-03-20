-- pembuatan table users
CREATE table users(
	id int PRIMARY KEY,
	nama VARCHAR not null, 
	username VARCHAR(15) unique not null,
	email VARCHAR unique not null,
	password VARCHAR not null,
	avatar VARCHAR,
	phone_no VARCHAR not null
	
)

INSERT INTO users (id, nama, username, email, password, phone_no) VALUES
(2, 'Joko', 'joko','joko@jokogmail.com','jokowinumber1','087898989012'),
(1, 'Budi', 'budi','budi@budimail.com','budirahasia','081234567890'),
(3, 'Siti', 'siti','siti@siti.com','sitikeren','085678901234'),
(4, 'Andi', 'andi','andi@andi.com','andijago','089012345678'),
(5, 'Dewi', 'dewi','dewi@dewi.com','dewicantik','083456789012');

select * from users

SELECT * from users
insert description to table users

-- pembuatan table transactions
create table transactions(
	id VARCHAR primary key,
	amount float not null,
	date_time date not null,
	transaction_no varchar not null,
	sender_id int not null,
	foreign key (sender_id) references users(id),
	receipent_id int not null,
	foreign key (receipent_id) references users(id),
	status boolean
)

select * from transactions

update transactions (id, amount, date_time, transaction_no, sender_id, receipent_id, status, transaction_type, description)
VALUES
  ('TRX001', 100.50, '2023-10-26', 'TN001', 1, 2, true, 'debit', 'Deposit gaji bulanan'),
  ('TRX002', 50.25, '2023-10-27', 'TN002', 2, 3, true, 'CREDIT', 'Pembayaran tagihan listrik'),
  ('TRX003', 200.00, '2023-10-28', 'TN003', 3, 1, false, 'DEBIT', 'Transfer ke teman'),
  ('TRX004', 75.80, '2023-10-29', 'TN004', 1, 4, true, 'DEBIT', 'Pembelian online'),
  ('TRX005', 30.15, '2023-10-30', 'TN005', 4, 2, false, 'CREDIT', 'Pengembalian barang');


--use case
SELECT transactions.date_time, transactions.transaction_type,
CASE
    WHEN transactions.transaction_type = 'DEBIT'  THEN users.nama
    WHEN transactions.transaction_type = 'CREDIT' THEN  users.nama 
END AS "from/to",

transactions.description,
case when transactions.transaction_type = 'CREDIT' then CONCAT ('+', transactions.amount)
when transactions.transaction_type = 'DEBIT' then CONCAT ('-', transactions.amount)
end as amount
from users
inner join transactions on users.id = transactions.receipent_id
where transactions.sender_id = 1 OR transactions.receipent_id = 1;
