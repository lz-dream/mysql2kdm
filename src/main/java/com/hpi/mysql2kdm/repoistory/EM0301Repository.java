package com.hpi.mysql2kdm.repoistory;

import com.hpi.mysql2kdm.entity.ExternalMaster0301;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EM0301Repository extends JpaRepository<ExternalMaster0301,Long> {
    List<ExternalMaster0301> findByDateTimeGreaterThan(long dateTime);
    @Query("select max(dateTime) from ExternalMaster0301")
    Long findMaxDateTime();
}
