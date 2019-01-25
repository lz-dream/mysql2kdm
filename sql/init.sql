CREATE TABLE IF NOT EXISTS
    oge_kkscode
    (
        id INT NOT NULL AUTO_INCREMENT,
        tableName VARCHAR(50) NOT NULL,
        sourceCode VARCHAR(20) NOT NULL,
        codeName VARCHAR(100),
        kksCode VARCHAR(50),
        type VARCHAR(10),
        channel VARCHAR(30),
        eigenValue VARCHAR(10),
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS
    synchro_time
    (
        id INT NOT NULL,
        Table_Name VARCHAR(50) NOT NULL,
        Date_Time bigint NOT NULL,
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into synchro_time (Table_Name, Date_Time) values ('external_master0101', 0);
insert into synchro_time (Table_Name, Date_Time) values ('external_master0102', 0);
insert into synchro_time (Table_Name, Date_Time) values ('external_master0201', 0);
insert into synchro_time (Table_Name, Date_Time) values ('external_master0202', 0);
insert into synchro_time (Table_Name, Date_Time) values ('external_master0301', 0);
insert into synchro_time (Table_Name, Date_Time) values ('external_master0302', 0);
