package com.baizhi.entity;

import java.io.Serializable;

public class Item implements Serializable {
    private Integer viId;

    private Integer vuUserId;

    private Integer vsId;

    private Integer voId;

    private static final long serialVersionUID = 1L;

    public Integer getViId() {
        return viId;
    }

    public void setViId(Integer viId) {
        this.viId = viId;
    }

    public Integer getVuUserId() {
        return vuUserId;
    }

    public void setVuUserId(Integer vuUserId) {
        this.vuUserId = vuUserId;
    }

    public Integer getVsId() {
        return vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
    }

    public Integer getVoId() {
        return voId;
    }

    public void setVoId(Integer voId) {
        this.voId = voId;
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
        Item other = (Item) that;
        return (this.getViId() == null ? other.getViId() == null : this.getViId().equals(other.getViId()))
            && (this.getVuUserId() == null ? other.getVuUserId() == null : this.getVuUserId().equals(other.getVuUserId()))
            && (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getVoId() == null ? other.getVoId() == null : this.getVoId().equals(other.getVoId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getViId() == null) ? 0 : getViId().hashCode());
        result = prime * result + ((getVuUserId() == null) ? 0 : getVuUserId().hashCode());
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getVoId() == null) ? 0 : getVoId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", viId=").append(viId);
        sb.append(", vuUserId=").append(vuUserId);
        sb.append(", vsId=").append(vsId);
        sb.append(", voId=").append(voId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}