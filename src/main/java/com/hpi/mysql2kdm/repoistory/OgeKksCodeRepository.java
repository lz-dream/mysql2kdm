package com.hpi.mysql2kdm.repoistory;

import com.hpi.mysql2kdm.entity.OgeKksCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OgeKksCodeRepository extends JpaRepository<OgeKksCode,Long> {

    OgeKksCode findFirstByTableNameAndSourceCode(String tableName,String sourceCode);
}
