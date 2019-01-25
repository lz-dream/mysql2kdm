package com.hpi.mysql2kdm.repoistory;

import com.hpi.mysql2kdm.entity.ExternalMaster0102;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EM0102Repository extends JpaRepository<ExternalMaster0102,Long> {
    List<ExternalMaster0102> findByDateTimeGreaterThan(long dateTime);

    @Query("select max(dateTime) from ExternalMaster0102")
    Long findMaxDateTime();
}
