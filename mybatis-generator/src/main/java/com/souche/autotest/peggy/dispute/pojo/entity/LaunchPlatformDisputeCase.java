package com.souche.autotest.peggy.dispute.pojo.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : at_launch_platform_dispute_case
 * @author fred
 * @date 2020-04-09 15:10:45
 */
public class LaunchPlatformDisputeCase implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 授权信息
     */
    private String bizAuthSource;

    /**
     * 争议信息ID
     */
    private Long voucherId;

    /**
     * 期望结果
     */
    private String expected;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBizAuthSource() {
        return bizAuthSource;
    }

    public void setBizAuthSource(String bizAuthSource) {
        this.bizAuthSource = bizAuthSource == null ? null : bizAuthSource.trim();
    }

    public Long getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected == null ? null : expected.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bizAuthSource=").append(bizAuthSource);
        sb.append(", voucherId=").append(voucherId);
        sb.append(", expected=").append(expected);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}