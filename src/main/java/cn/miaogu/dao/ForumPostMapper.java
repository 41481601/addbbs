package cn.miaogu.dao;

import cn.miaogu.domain.ForumPost;
import cn.miaogu.domain.ForumPostKey;

public interface ForumPostMapper {
    int deleteByPrimaryKey(ForumPostKey key);

    int insert(ForumPost record);

    int insertSelective(ForumPost record);

    ForumPost selectByPrimaryKey(ForumPostKey key);

    int updateByPrimaryKeySelective(ForumPost record);

    int updateByPrimaryKeyWithBLOBs(ForumPost record);

    int updateByPrimaryKey(ForumPost record);
}