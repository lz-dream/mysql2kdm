package com.hpi.mysql2kdm.util;


import cn.oge.wave.decompress.WaveDataModelCompress;
import cn.oge.wave.decompress.model.WaveDataHeader;
import cn.oge.wave.decompress.model.WaveDataModel;
import cn.oge.wave.decompress.util.NumberFormatUtil;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MysqlBlobUtil {

    public static byte[] byteCompress(byte[] b) throws IOException {
        WaveDataHeader header = new WaveDataHeader();
        byte[] compressbyte = null;
//            header.setDate_time(rs.getDouble(1));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
        BufferedInputStream bInput = new BufferedInputStream(byteArrayInputStream);
        //time
        byte bTime[] = new byte[4];
        bInput.read(bTime, 0, 4);
//            header.setTime(NumberFormatUtil.transInt(bTime, 0));
        //flag
        byte bFlag[] = new byte[2];
        bInput.read(bFlag, 0, 2);
        header.setRecordType(NumberFormatUtil.transShort(bFlag, 0));
        //period
        byte bPeriod[] = new byte[2];
        bInput.read(bPeriod, 0, 2);
        header.setPeriod(NumberFormatUtil.transShort(bPeriod, 0));
        //keyPhaseCount
        byte bKeyPhaseCount[] = new byte[2];
        bInput.read(bKeyPhaseCount, 0, 2);
        header.setKeyPhaseCount(NumberFormatUtil.transShort(bKeyPhaseCount, 0));
        //keyPhaseOffset
        int keyPhaseOffset[] = new int[header.getKeyPhaseCount()];
        for (int i = 0; i < header.getKeyPhaseCount(); i++) {
            byte a[] = new byte[4];
            bInput.read(a, 0, 4);
            keyPhaseOffset[i] = NumberFormatUtil.transInt(a, 0);
        }
        header.setKeyPhaseOffset(keyPhaseOffset);
        for (int i = 0; i < 128 - header.getKeyPhaseCount(); i++) {
            byte[] a = new byte[4];
            bInput.read(a, 0, 4);
        }
        //dataNum
        byte bDataNum[] = new byte[4];
        bInput.read(bDataNum, 0, 4);
        header.setWaveNum(NumberFormatUtil.transInt(bDataNum, 0));
        //data
        float data[] = new float[header.getWaveNum()];
        for (int i = 0; i < header.getWaveNum(); i++) {
            byte bData[] = new byte[4];
            bInput.read(bData, 0, 4);
            data[i] = NumberFormatUtil.transFloat(bData, 0);
        }
        //float[] -> double[]
        double[] ware = new double[header.getWaveNum()];
        for (int i = 0; i < header.getWaveNum(); i++) {
            ware[i] = Double.parseDouble(String.valueOf(data[i]));
        }
        try {
            compressbyte = compress(header, ware);
        } catch (Exception e) {
            e.printStackTrace();
        }
        bInput.close();
        return compressbyte;
    }
    private static byte[] compress(WaveDataHeader header, double[] waves) throws Exception {
        WaveDataModel waveModel = new WaveDataModel();
        waveModel.setHeader(header);
        waveModel.setData(waves);
        return WaveDataModelCompress.executeNew(waveModel);
    }
}
