package com.hpi.mysql2kdm.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "synchro_time")
public class SynchroTime {

  @Id
  private long id;
  @Column(name = "table_name")
  private String tableName;
  @Column(name = "date_time")
  private long dateTime;


}
