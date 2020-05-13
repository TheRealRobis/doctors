CREATE TABLE Doctors
(
    doctor_id  INT UNSIGNED      NOT NULL AUTO_INCREMENT,
    name      VARCHAR(50)       NOT NULL,
    last_name VARCHAR(50)      NOT NULL,
    region      VARCHAR(50)    NOT NULL,
    specialization VARCHAR(50)    NOT NULL,
    create_date TIMESTAMP         NOT NULL DEFAULT CURRENT_TIMESTAMP,
    last_update TIMESTAMP         NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (doctor_id)
);
