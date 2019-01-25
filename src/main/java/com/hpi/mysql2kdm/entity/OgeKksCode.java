package com.hpi.mysql2kdm.entity;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "oge_kksCode")
public class OgeKksCode implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  private long id;
  private String tableName;
  private String sourceCode;
  private String codeName;
  private String kksCode;
  private String type;
  private String channel;
  private String eigenValue;

}
