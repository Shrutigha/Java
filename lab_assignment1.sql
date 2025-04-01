mysql> CREATE database BankAccount;
Query OK, 1 row affected (0.02 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| bankaccount        |
| emp                |
| information_schema |
| jdbc_odbc_fsjd     |
| maharashtra        |
| munna              |
| mysql              |
| performance_schema |
| priti              |
| priya              |
| r1                 |
| rohit              |
| s1                 |
| s3                 |
| shruti             |
| shruu              |
| sys                |
+--------------------+
17 rows in set (0.10 sec)

mysql> use bankaccount;
Database changed
mysql> CREATE TABLE BankAccount(account_id INT PRIMARY KEY,account_holder_name VARCHAR(100),account_balance DECIMAL(10,2)
    -> );
Query OK, 0 rows affected (0.36 sec)

mysql> desc BankAccount;
+---------------------+---------------+------+-----+---------+-------+
| Field               | Type          | Null | Key | Default | Extra |
+---------------------+---------------+------+-----+---------+-------+
| account_id          | int           | NO   | PRI | NULL    |       |
| account_holder_name | varchar(100)  | YES  |     | NULL    |       |
| account_balance     | decimal(10,2) | YES  |     | NULL    |       |
+---------------------+---------------+------+-----+---------+-------+
3 rows in set (0.18 sec)

mysql> INSERT INTO BankAccount (account_id, account_holder_name, account_balance)
    -> VALUES
    -> (101, 'John Doe', 25000.00),
    -> (102, 'Alice Smith', 40000.00),
    -> (103, 'Bob Johnson', 32000.00),
    -> (104, 'Emma Williams', 28000.00),
    -> (105, 'David Brown', 50000.00);
Query OK, 5 rows affected (0.20 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from  BankAccount;
+---------------------+-----------------+
| account_holder_name | account_balance |
+---------------------+-----------------+
| John Doe            |        25000.00 |
| Alice Smith         |        40000.00 |
| Bob Johnson         |        32000.00 |
| Emma Williams       |        28000.00 |
| David Brown         |        50000.00 |
+---------------------+-----------------+
5 rows in set (0.00 sec)

mysql> SELECT account_holder_name, account_balance
    -> FROM BankAccount
    -> WHERE account_balance > 30000;
+---------------------+-----------------+
| account_holder_name | account_balance |
+---------------------+-----------------+
| Alice Smith         |        40000.00 |
| Bob Johnson         |        32000.00 |
| David Brown         |        50000.00 |
+---------------------+-----------------+
3 rows in set (0.01 sec)

mysql> UPDATE BankAccount
    -> SET account_balance = 35000.00
    -> WHERE account_id = 101;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select* from  BankAccount;
+------------+---------------------+-----------------+
| account_id | account_holder_name | account_balance |
+------------+---------------------+-----------------+
|        101 | John Doe            |        35000.00 |
|        102 | Alice Smith         |        40000.00 |
|        103 | Bob Johnson         |        32000.00 |
|        104 | Emma Williams       |        28000.00 |
|        105 | David Brown         |        50000.00 |
+------------+---------------------+-----------------+
5 rows in set (0.10 sec)