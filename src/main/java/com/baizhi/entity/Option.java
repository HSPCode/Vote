package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Option implements Serializable {
    private Integer voId;

    private Integer vsId;

    private String voOption;

    private Integer voOrder;

    private Integer voIsDelete;

    private static final long serialVersionUID = 1L;


}