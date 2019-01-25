package com.hpi.mysql2kdm.entity;

import lombok.Data;

@Data
public class BasicResponse {
    private Integer succeeded;
    private String errors;
}