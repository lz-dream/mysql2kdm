package com.hpi.mysql2kdm.contoller;

import com.hpi.mysql2kdm.entity.*;
import com.hpi.mysql2kdm.repoistory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EMController {

    @Autowired
    EM0101Repository em0101Repository;
    @Autowired
    EM0102Repository em0102Repository;
    @Autowired
    EM0201Repository em0201Repository;
    @Autowired
    EM0202Repository em0202Repository;
    @Autowired
    EM0301Repository em0301Repository;
    @Autowired
    EM0302Repository em0302Repository;
    @Autowired
    SynchroTimeRepository synchroTimeRepository;

    public List<ExternalMaster0101> getEM0101(long dateTime) {
        return em0101Repository.findByDateTimeGreaterThan(dateTime);
    }

    public long getEM0101MaxTime() {
        return em0101Repository.findMaxDateTime() == null?0:em0101Repository.findMaxDateTime();
    }

    public long getEM0102MaxTime() {
        return em0102Repository.findMaxDateTime() == null?0:em0102Repository.findMaxDateTime();
    }

    public long getEM0201MaxTime() {
        return em0201Repository.findMaxDateTime() == null?0:em0201Repository.findMaxDateTime();
    }

    public long getEM0202MaxTime() {
        return em0202Repository.findMaxDateTime() == null?0:em0202Repository.findMaxDateTime();
    }

    public long getEM0301MaxTime() {
        return em0301Repository.findMaxDateTime() == null?0:em0301Repository.findMaxDateTime();
    }

    public long getEM0302MaxTime() {
        return em0302Repository.findMaxDateTime() == null?0:em0302Repository.findMaxDateTime();
    }


    public List<ExternalMaster0102> getEM0102(long dateTime) {
        return em0102Repository.findByDateTimeGreaterThan(dateTime);
    }

    public List<ExternalMaster0201> getEM0201(long dateTime) {
        return em0201Repository.findByDateTimeGreaterThan(dateTime);
    }

    public List<ExternalMaster0202> getEM0202(long dateTime) {
        return em0202Repository.findByDateTimeGreaterThan(dateTime);
    }

    public List<ExternalMaster0301> getEM0301(long dateTime) {
        return em0301Repository.findByDateTimeGreaterThan(dateTime);
    }

    public List<ExternalMaster0302> getEM0302(long dateTime) {
        return em0302Repository.findByDateTimeGreaterThan(dateTime);
    }

    public SynchroTime getTime(String name) {
        return synchroTimeRepository.findByTableName(name);
    }
}
