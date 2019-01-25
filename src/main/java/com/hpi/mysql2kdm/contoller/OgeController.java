package com.hpi.mysql2kdm.contoller;

import com.hpi.mysql2kdm.entity.OgeKksCode;
import com.hpi.mysql2kdm.repoistory.OgeKksCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class OgeController{
    @Autowired
    OgeKksCodeRepository ogeKksCodeRepository;

    public OgeKksCode getKksCode(@RequestParam String tableName, String sourceCode) {
        return ogeKksCodeRepository.findFirstByTableNameAndSourceCode(tableName,sourceCode);
    }
}
