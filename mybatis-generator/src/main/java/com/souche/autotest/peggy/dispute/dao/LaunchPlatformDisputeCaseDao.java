package com.souche.autotest.peggy.dispute.dao;

import com.souche.autotest.peggy.dispute.pojo.entity.LaunchPlatformDisputeCase;
import com.souche.autotest.peggy.dispute.pojo.entity.LaunchPlatformDisputeCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LaunchPlatformDisputeCaseDao {
    long countByExample(LaunchPlatformDisputeCaseExample example);

    int deleteByExample(LaunchPlatformDisputeCaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LaunchPlatformDisputeCase record);

    int insertSelective(LaunchPlatformDisputeCase record);

    List<LaunchPlatformDisputeCase> selectByExampleWithRowbounds(LaunchPlatformDisputeCaseExample example, RowBounds rowBounds);

    List<LaunchPlatformDisputeCase> selectByExample(LaunchPlatformDisputeCaseExample example);

    LaunchPlatformDisputeCase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LaunchPlatformDisputeCase record, @Param("example") LaunchPlatformDisputeCaseExample example);

    int updateByExample(@Param("record") LaunchPlatformDisputeCase record, @Param("example") LaunchPlatformDisputeCaseExample example);

    int updateByPrimaryKeySelective(LaunchPlatformDisputeCase record);

    int updateByPrimaryKey(LaunchPlatformDisputeCase record);
}