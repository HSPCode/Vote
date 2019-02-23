package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private String vuUserId;

    private String vuUserName;

    private String vuPassword;

    private Integer vuStatus;

    private static final long serialVersionUID = 1L;

}