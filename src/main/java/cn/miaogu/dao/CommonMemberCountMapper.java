package cn.miaogu.dao;

import cn.miaogu.domain.CommonMemberCount;

public interface CommonMemberCountMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(CommonMemberCount record);

    int insertSelective(CommonMemberCount record);

    CommonMemberCount selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(CommonMemberCount record);

    int updateByPrimaryKey(CommonMemberCount record);
}