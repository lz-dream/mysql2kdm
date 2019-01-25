package com.hpi.mysql2kdm.scheduling;

import com.google.gson.Gson;
import com.hpi.mysql2kdm.conf.MyConfig;
import com.hpi.mysql2kdm.contoller.EMController;
import com.hpi.mysql2kdm.contoller.FormData;
import com.hpi.mysql2kdm.contoller.OgeController;
import com.hpi.mysql2kdm.entity.*;
import com.hpi.mysql2kdm.repoistory.SynchroTimeRepository;
import com.hpi.mysql2kdm.util.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class MysqlToKdmScheduling {

    @Autowired
    private EMController controller;
    @Autowired
    private SynchroTimeRepository synchroTimeRepository;
    @Autowired
    private MyConfig myConfig;
    @Autowired
    private OgeController ogeController;

    private List<RTDataSet> em0101ToRtData(long maxTime, String tableName) throws Exception {

        FormData<ExternalMaster0101> formData = new FormData<>();
        List<ExternalMaster0101> ems = controller.getEM0101(maxTime);
        List<RTDataSet> rtDataSets = new ArrayList<>();
        for (ExternalMaster0101 em : ems) {
            Long dateTime = em.getDateTime();
            Field[] fields = ExternalMaster0101.class.getDeclaredFields();
            List<RTDataSet> rtList = formData.getRTList(fields, dateTime, em, ogeController, tableName);
            rtDataSets.addAll(rtList);
        }
        return rtDataSets;
    }

    @Scheduled(initialDelay = 1000, fixedDelayString = "${oge.fixedDelay}")
    public void em0101Scheduling() {
        String tableName = "external_master0101";
        SynchroTime time = controller.getTime(tableName);
        long emMaxTime = controller.getEM0101MaxTime();
        long maxTime = time.getDateTime();

        try {
            List<RTDataSet> rtDataSets = this.em0101ToRtData(maxTime, tableName);
            doPost(rtDataSets, tableName, time, emMaxTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<RTDataSet> em0102ToRtData(long maxTime, String tableName) throws Exception {

        FormData<ExternalMaster0102> formData = new FormData<>();
        List<ExternalMaster0102> ems = controller.getEM0102(maxTime);
        List<RTDataSet> rtDataSets = new ArrayList<>();
        for (ExternalMaster0102 em : ems) {
            Long dateTime = em.getDateTime();
            Field[] fields = ExternalMaster0102.class.getDeclaredFields();
            List<RTDataSet> rtList = formData.getRTList(fields, dateTime, em, ogeController, tableName);
            rtDataSets.addAll(rtList);
        }
        return rtDataSets;
    }

    @Scheduled(initialDelay = 2000, fixedDelayString = "${oge.fixedDelay}")
    public void em0102Scheduling() {
        String tableName = "external_master0102";
        SynchroTime time = controller.getTime(tableName);
        long emMaxTime = controller.getEM0102MaxTime();
        long maxTime = time.getDateTime();

        try {
            List<RTDataSet> rtDataSets = this.em0102ToRtData(maxTime, tableName);
            doPost(rtDataSets, tableName, time, emMaxTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<RTDataSet> em0201ToRtData(long maxTime, String tableName) throws Exception {

        FormData<ExternalMaster0201> formData = new FormData<>();
        List<ExternalMaster0201> ems = controller.getEM0201(maxTime);
        List<RTDataSet> rtDataSets = new ArrayList<>();
        for (ExternalMaster0201 em : ems) {
            Long dateTime = em.getDateTime();
            Field[] fields = ExternalMaster0201.class.getDeclaredFields();

            List<RTDataSet> rtList = formData.getRTList(fields, dateTime, em, ogeController, tableName);
            rtDataSets.addAll(rtList);
        }
        return rtDataSets;
    }

    @Scheduled(initialDelay = 3000, fixedDelayString = "${oge.fixedDelay}")
    public void em0201Scheduling() {
        String tableName = "external_master0201";
        SynchroTime time = controller.getTime(tableName);
        long emMaxTime = controller.getEM0201MaxTime();
        long maxTime = time.getDateTime();

        try {
            List<RTDataSet> rtDataSets = this.em0201ToRtData(maxTime, tableName);
            doPost(rtDataSets, tableName, time, emMaxTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<RTDataSet> em0202ToRtData(long maxTime, String tableName) throws Exception {

        FormData<ExternalMaster0202> formData = new FormData<>();
        List<ExternalMaster0202> ems = controller.getEM0202(maxTime);
        List<RTDataSet> rtDataSets = new ArrayList<>();
        for (ExternalMaster0202 em : ems) {
            Long dateTime = em.getDateTime();
            Field[] fields = ExternalMaster0202.class.getDeclaredFields();
            List<RTDataSet> rtList = formData.getRTList(fields, dateTime, em, ogeController, tableName);
            rtDataSets.addAll(rtList);
        }
        return rtDataSets;
    }

    @Scheduled(initialDelay = 4000, fixedDelayString = "${oge.fixedDelay}")
    public void em0202Scheduling() {
        String tableName = "external_master0202";
        SynchroTime time = controller.getTime(tableName);
        long emMaxTime = controller.getEM0202MaxTime();
        long maxTime = time.getDateTime();
        try {
            List<RTDataSet> rtDataSets = this.em0202ToRtData(maxTime, tableName);
            doPost(rtDataSets, tableName, time, emMaxTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<RTDataSet> em0301ToRtData(long maxTime, String tableName) throws Exception {

        FormData<ExternalMaster0301> formData = new FormData<>();
        List<ExternalMaster0301> ems = controller.getEM0301(maxTime);
        List<RTDataSet> rtDataSets = new ArrayList<>();
        for (ExternalMaster0301 em : ems) {
            Long dateTime = em.getDateTime();
            Field[] fields = ExternalMaster0301.class.getDeclaredFields();

            List<RTDataSet> rtList = formData.getRTList(fields, dateTime, em, ogeController, tableName);
            rtDataSets.addAll(rtList);
        }
        return rtDataSets;
    }

    @Scheduled(initialDelay = 5000, fixedDelayString = "${oge.fixedDelay}")
    public void em0301Scheduling() {
        String tableName = "external_master0301";
        SynchroTime time = controller.getTime(tableName);
        long emMaxTime = controller.getEM0301MaxTime();
        long maxTime = time.getDateTime();
        try {
            List<RTDataSet> rtDataSets = this.em0301ToRtData(maxTime, tableName);
            doPost(rtDataSets, tableName, time, emMaxTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<RTDataSet> em0302ToRtData(long maxTime, String tableName) throws Exception {

        FormData<ExternalMaster0302> formData = new FormData<>();
        List<ExternalMaster0302> ems = controller.getEM0302(maxTime);
        List<RTDataSet> rtDataSets = new ArrayList<>();
        for (ExternalMaster0302 em : ems) {
            Long dateTime = em.getDateTime();
            Field[] fields = ExternalMaster0302.class.getDeclaredFields();

            List<RTDataSet> rtList = formData.getRTList(fields, dateTime, em, ogeController, tableName);
            rtDataSets.addAll(rtList);
        }
        return rtDataSets;
    }

    @Scheduled(initialDelay = 6000, fixedDelayString = "${oge.fixedDelay}")
    public void em0302Scheduling() {
        String tableName = "external_master0302";
        SynchroTime time = controller.getTime(tableName);
        long emMaxTime = controller.getEM0302MaxTime();
        long maxTime = time.getDateTime();
        try {
            List<RTDataSet> rtDataSets = this.em0302ToRtData(maxTime, tableName);
            doPost(rtDataSets, tableName, time, emMaxTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateTime(String tableName, SynchroTime time, long emMaxTime, int success) {
        if (success == 1) {
            time.setDateTime(emMaxTime);
            synchroTimeRepository.save(time);
            log.info(tableName + "  同步完成！");
        } else {
            log.info("同步失败。。。下次尝试");
        }
    }

    private void doPost(List<RTDataSet> rtDataSets, String tableName, SynchroTime time, long emMaxTime) {
        int success;
        log.info("开始同步-" + tableName + ": " + rtDataSets.size());
        RTDataSets rts = new RTDataSets();
        rts.setRTDataSets(rtDataSets);
        if (rtDataSets.size() > 0) {
            Gson gson = new Gson();
            String jsonData = gson.toJson(rts);
            success = HttpUtil.doPost(myConfig.getApiUrl(), jsonData);
            updateTime(tableName, time, emMaxTime, success);
        } else {
            log.info(tableName + ": 没有数据。。。");
        }
    }
}
