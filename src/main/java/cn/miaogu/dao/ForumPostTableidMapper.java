package cn.miaogu.dao;

import cn.miaogu.domain.ForumPostTableid;

public interface ForumPostTableidMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(ForumPostTableid record);

    int insertSelective(ForumPostTableid record);
}