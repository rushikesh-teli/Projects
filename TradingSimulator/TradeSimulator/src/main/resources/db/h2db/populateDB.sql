CREATE USER IF NOT EXISTS SA SALT 'a34fe51ba590d505' HASH '219c2f189a0425ef4417d87e22a2722191d6721018b52086a5bddd2bf32cec39' ADMIN;
CREATE CACHED TABLE PUBLIC.NEWS(
    NEWSID INT NOT NULL,
    TITLE VARCHAR,
    DESCRIPTION VARCHAR,
    TYPE VARCHAR
);
ALTER TABLE PUBLIC.NEWS ADD CONSTRAINT PUBLIC.CONSTRAINT_2 PRIMARY KEY(NEWSID);
-- 5 +/- SELECT COUNT(*) FROM PUBLIC.NEWS;
INSERT INTO PUBLIC.NEWS(NEWSID, TITLE, DESCRIPTION, TYPE) VALUES
(1, 'NEWS1', 'NEWS from table row1', 'GOOD'),
(2, 'NEWS2', 'NEWS from table row2', 'BAD'),
(3, 'NEWS3', 'NEWS from table row3', 'GOOD'),
(4, 'NEWS4', 'NEWS frm table row 4', 'GOOD'),
(5, 'NEWS5', 'NEWS frm table row 5', 'GOOD');
CREATE CACHED TABLE PUBLIC.USERDETAILS(
	ID INTEGER NOT NULL,
    USERNAME VARCHAR NOT NULL,
    FIRSTNAME VARCHAR NOT NULL,
    LASTNAME VARCHAR NOT NULL,
    PASSWORD VARCHAR NOT NULL,
    ROLES VARCHAR NOT NULL
);
ALTER TABLE PUBLIC.USERDETAILS ADD CONSTRAINT PUBLIC.CONSTRAINT_6 PRIMARY KEY(ID);
-- 3 +/- SELECT COUNT(*) FROM PUBLIC.USERDETAILS;
INSERT INTO PUBLIC.USERDETAILS(ID, USERNAME, FIRSTNAME, LASTNAME, PASSWORD, ROLES) VALUES
(1,'test', 'TestFirst', 'TestLast', 'test','USER'),
(2,'admin', 'AdminFirst', 'AdminLast', 'admin','USER,ADMIN');
CREATE CACHED TABLE PUBLIC.STOCKS(
    STOCKID VARCHAR NOT NULL,
    STOCKDESC VARCHAR,
    MKTVAL FLOAT
);
ALTER TABLE PUBLIC.STOCKS ADD CONSTRAINT PUBLIC.CONSTRAINT_9 PRIMARY KEY(STOCKID);
-- 9 +/- SELECT COUNT(*) FROM PUBLIC.STOCKS;
INSERT INTO PUBLIC.STOCKS(STOCKID, STOCKDESC, MKTVAL) VALUES
('APPL', 'APPLE INC', 1000.00),
('IBM', 'IBM SOLUTIONS', 1200.00),
('REL','RELIENCE INDUSTRIES',850.00),
('GOOG','ALPHABET INC',1500.00);
CREATE CACHED TABLE PUBLIC.TRADETXN(
	TRADEID INTEGER NOT NULL,
    BSACTION VARCHAR NOT NULL,
    STOCK VARCHAR NOT NULL,
    PRODUCT VARCHAR,
    EXCHANGE VARCHAR,
    QUANTITY INTEGER,
    ORDERTYPE VARCHAR,
    LIMITPRICE FLOAT,
    VIEWLIMIT FLOAT,
    ORDERVALIDITY VARCHAR,
    STOPLOSSTRIGGERPRICE FLOAT,
    CREATEDON DATETIME DEFAULT NOW() NOT NULL,
    EXECUTEDON DATETIME,
    EXECUTIONSTATUS VARCHAR DEFAULT 'N',
    USERNAME VARCHAR NOT NULL
);
