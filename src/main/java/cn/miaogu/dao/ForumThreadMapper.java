package cn.miaogu.dao;

import cn.miaogu.domain.ForumThread;

public interface ForumThreadMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(ForumThread record);

    int insertSelective(ForumThread record);

    ForumThread selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(ForumThread record);

    int updateByPrimaryKey(ForumThread record);
}