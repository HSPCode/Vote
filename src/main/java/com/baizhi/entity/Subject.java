package com.baizhi.entity;

import java.io.Serializable;

public class Subject implements Serializable {
    private Integer vsId;

    private String vsTitle;

    private Integer vsType;

    private static final long serialVersionUID = 1L;

    public Integer getVsId() {
        return vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
    }

    public String getVsTitle() {
        return vsTitle;
    }

    public void setVsTitle(String vsTitle) {
        this.vsTitle = vsTitle == null ? null : vsTitle.trim();
    }

    public Integer getVsType() {
        return vsType;
    }

    public void setVsType(Integer vsType) {
        this.vsType = vsType;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Subject other = (Subject) that;
        return (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getVsTitle() == null ? other.getVsTitle() == null : this.getVsTitle().equals(other.getVsTitle()))
            && (this.getVsType() == null ? other.getVsType() == null : this.getVsType().equals(other.getVsType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getVsTitle() == null) ? 0 : getVsTitle().hashCode());
        result = prime * result + ((getVsType() == null) ? 0 : getVsType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vsId=").append(vsId);
        sb.append(", vsTitle=").append(vsTitle);
        sb.append(", vsType=").append(vsType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}