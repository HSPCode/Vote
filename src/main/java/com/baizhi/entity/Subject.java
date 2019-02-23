package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject implements Serializable {
    private Integer vsId;

    private String vsTitle;

    private Integer vsType;

    private static final long serialVersionUID = 1L;


}