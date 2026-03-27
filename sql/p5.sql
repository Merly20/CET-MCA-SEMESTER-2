
USE triggers;
CREATE TABLE Product (
    pdtid INT AUTO_INCREMENT PRIMARY KEY,
    Pname VARCHAR(100),
    Price DECIMAL(10,2),
    Qtyinstock INT NOT NULL
);

CREATE TABLE Sale (
     saleid INT auto_increment PRIMARY KEY,
     deliveryaddress VARCHAR(300)
     );

CREATE TABLE saleitem (
    saleid INT,
    pdtid INT,
    qty INT NOT NULL,
    PRIMARY KEY (saleid, pdtid),
    FOREIGN KEY (saleid) REFERENCES sale(saleid),
    FOREIGN KEY (pdtid) REFERENCES product(pdtid)
);
DELIMITER $$

CREATE TRIGGER updateavailablequantity
AFTER INSERT ON saleitem
FOR EACH ROW
BEGIN
    UPDATE product
    SET qtyinstock = qtyinstock - NEW.qty
    WHERE pdtid = NEW.pdtid;
END$$

DELIMITER ;
INSERT INTO product (pdtid, pname, price, qtyinstock)
VALUES 
(1, 'Pen', 10.00, 100),
(2, 'Notebook', 50.00, 60);
INSERT INTO sale (deliveryaddress)
VALUES ('Kerala, India');
INSERT INTO saleitem (saleid, pdtid, qty)
VALUES (1, 1, 5);
SELECT * FROM product;
          