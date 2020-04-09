package com.souche.autotest.peggy.dispute.dao;

import com.souche.autotest.peggy.dispute.pojo.entity.DisputeVoucher;
import com.souche.autotest.peggy.dispute.pojo.entity.DisputeVoucherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DisputeVoucherDao {
    long countByExample(DisputeVoucherExample example);

    int deleteByExample(DisputeVoucherExample example);

    int deleteByPrimaryKey(Long voucherId);

    int insert(DisputeVoucher record);

    int insertSelective(DisputeVoucher record);

    List<DisputeVoucher> selectByExampleWithRowbounds(DisputeVoucherExample example, RowBounds rowBounds);

    List<DisputeVoucher> selectByExample(DisputeVoucherExample example);

    DisputeVoucher selectByPrimaryKey(Long voucherId);

    int updateByExampleSelective(@Param("record") DisputeVoucher record, @Param("example") DisputeVoucherExample example);

    int updateByExample(@Param("record") DisputeVoucher record, @Param("example") DisputeVoucherExample example);

    int updateByPrimaryKeySelective(DisputeVoucher record);

    int updateByPrimaryKey(DisputeVoucher record);
}