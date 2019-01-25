package com.hpi.mysql2kdm.entity;

import lombok.Data;

@Data
public class RTDataSet {
    private String kksCode; //KKS编码
    private int type;  //类型(1-点值数据, 2-块数据)
    private RTDataValue[] RTDataValues; //实时数据集
}
