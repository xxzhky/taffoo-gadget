package com.souche.autotest.peggy.dispute.pojo.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : at_dispute_voucher
 * @author fred
 * @date 2020-04-09 15:10:45
 */
public class DisputeVoucher implements Serializable {
    /**
     * 主键ID
     */
    private Long voucherId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 争议方code
     */
    private String sponsorSideCode;

    /**
     * 争议方客户端编码
     */
    private String sponsorClientCode;

    private static final long serialVersionUID = 1L;

    public Long getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getSponsorSideCode() {
        return sponsorSideCode;
    }

    public void setSponsorSideCode(String sponsorSideCode) {
        this.sponsorSideCode = sponsorSideCode == null ? null : sponsorSideCode.trim();
    }

    public String getSponsorClientCode() {
        return sponsorClientCode;
    }

    public void setSponsorClientCode(String sponsorClientCode) {
        this.sponsorClientCode = sponsorClientCode == null ? null : sponsorClientCode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voucherId=").append(voucherId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", sponsorSideCode=").append(sponsorSideCode);
        sb.append(", sponsorClientCode=").append(sponsorClientCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}