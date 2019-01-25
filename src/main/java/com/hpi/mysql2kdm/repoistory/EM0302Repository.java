package com.hpi.mysql2kdm.repoistory;

import com.hpi.mysql2kdm.entity.ExternalMaster0302;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EM0302Repository extends JpaRepository<ExternalMaster0302,Long> {
    List<ExternalMaster0302> findByDateTimeGreaterThan(long dateTime);
    @Query("select max(dateTime) from ExternalMaster0302")
    Long findMaxDateTime();
}
