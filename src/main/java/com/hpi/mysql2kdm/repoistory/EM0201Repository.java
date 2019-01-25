package com.hpi.mysql2kdm.repoistory;

import com.hpi.mysql2kdm.entity.ExternalMaster0201;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EM0201Repository extends JpaRepository<ExternalMaster0201,Long> {
    List<ExternalMaster0201> findByDateTimeGreaterThan(long dateTime);
    @Query("select max(dateTime) from ExternalMaster0201")
    Long findMaxDateTime();
}