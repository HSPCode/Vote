package com.baizhi.entity;

import java.io.Serializable;

public class Option implements Serializable {
    private Integer voId;

    private Integer vsId;

    private String voOption;

    private Integer voOrder;

    private Integer voIsDelete;

    private static final long serialVersionUID = 1L;

    public Integer getVoId() {
        return voId;
    }

    public void setVoId(Integer voId) {
        this.voId = voId;
    }

    public Integer getVsId() {
        return vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
    }

    public String getVoOption() {
        return voOption;
    }

    public void setVoOption(String voOption) {
        this.voOption = voOption == null ? null : voOption.trim();
    }

    public Integer getVoOrder() {
        return voOrder;
    }

    public void setVoOrder(Integer voOrder) {
        this.voOrder = voOrder;
    }

    public Integer getVoIsDelete() {
        return voIsDelete;
    }

    public void setVoIsDelete(Integer voIsDelete) {
        this.voIsDelete = voIsDelete;
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
        Option other = (Option) that;
        return (this.getVoId() == null ? other.getVoId() == null : this.getVoId().equals(other.getVoId()))
            && (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getVoOption() == null ? other.getVoOption() == null : this.getVoOption().equals(other.getVoOption()))
            && (this.getVoOrder() == null ? other.getVoOrder() == null : this.getVoOrder().equals(other.getVoOrder()))
            && (this.getVoIsDelete() == null ? other.getVoIsDelete() == null : this.getVoIsDelete().equals(other.getVoIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVoId() == null) ? 0 : getVoId().hashCode());
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getVoOption() == null) ? 0 : getVoOption().hashCode());
        result = prime * result + ((getVoOrder() == null) ? 0 : getVoOrder().hashCode());
        result = prime * result + ((getVoIsDelete() == null) ? 0 : getVoIsDelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voId=").append(voId);
        sb.append(", vsId=").append(vsId);
        sb.append(", voOption=").append(voOption);
        sb.append(", voOrder=").append(voOrder);
        sb.append(", voIsDelete=").append(voIsDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}