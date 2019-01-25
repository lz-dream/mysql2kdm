package com.hpi.mysql2kdm.contoller;

import com.hpi.mysql2kdm.entity.RTDataSet;
import com.hpi.mysql2kdm.entity.RTDataValue;
import com.hpi.mysql2kdm.util.Base64Util;
import com.hpi.mysql2kdm.util.MysqlBlobUtil;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class FormData<T> {


    public List<RTDataSet> getRTList(Field[] fields, Long dateTime, T em,
                                     OgeController ogeController,String tableName) throws Exception {
        List<RTDataSet> rtDataSets = new ArrayList<>();
        for (Field field : fields) {

            String fName = field.getName();
            if (fName.equals("serialVersionUID") || fName.equals("dateTime")
                    || fName.equals("state") || fName.equals("runCondition")) {
                continue;
            }
            RTDataSet rtDataSet = new RTDataSet();
            RTDataValue rtDataValue = new RTDataValue();
            String  kksCode = ogeController.getKksCode(tableName, fName.toUpperCase()).getKksCode();
            rtDataSet.setKksCode(kksCode);
            rtDataValue.setTime(dateTime);
            PropertyDescriptor pd = new PropertyDescriptor(field.getName(), em.getClass());
            Method readMethod = pd.getReadMethod();
            Object value = readMethod.invoke(em);
            if (field.getType() != byte[].class) {
                rtDataSet.setType(1);
                if (value != null)
                    rtDataValue.setValue(value);
            } else if (value != null) {
                rtDataSet.setType(2);
                byte[] buf = (byte[]) value;
                byte[] byteCompress = MysqlBlobUtil.byteCompress(buf);
                String encode = Base64Util.encode(byteCompress);
                rtDataValue.setValue(encode);
            } else {
                rtDataSet.setType(2);
                rtDataValue.setValue(null);
            }
            rtDataSet.setRTDataValues(new RTDataValue[]{rtDataValue});
            rtDataSets.add(rtDataSet);
        }
        return rtDataSets;
    }

}
