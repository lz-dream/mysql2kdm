package com.hpi.mysql2kdm.repoistory;

import com.hpi.mysql2kdm.entity.ExternalMaster0101;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EM0101Repository extends JpaRepository<ExternalMaster0101,Long> {
    List<ExternalMaster0101> findByDateTimeGreaterThan(long dateTime);

    @Query("select max(dateTime) from ExternalMaster0101")
    Long findMaxDateTime();
}
