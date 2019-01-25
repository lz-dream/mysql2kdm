package com.hpi.mysql2kdm.repoistory;

import com.hpi.mysql2kdm.entity.ExternalMaster0202;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EM0202Repository extends JpaRepository<ExternalMaster0202,Long> {
    List<ExternalMaster0202> findByDateTimeGreaterThan(long dateTime);
    @Query("select max(dateTime) from ExternalMaster0202")
    Long findMaxDateTime();
}
