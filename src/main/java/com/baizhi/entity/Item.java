package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {
    private Integer viId;

    private Integer vuUserId;

    private Integer vsId;

    private Integer voId;

    private static final long serialVersionUID = 1L;


}