package com.hpi.mysql2kdm.repoistory;

import com.hpi.mysql2kdm.entity.SynchroTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SynchroTimeRepository extends JpaRepository<SynchroTime,Long>{

    SynchroTime findByTableName(String tableName);

}
