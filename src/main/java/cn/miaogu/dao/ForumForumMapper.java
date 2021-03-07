package cn.miaogu.dao;

import cn.miaogu.domain.ForumForum;

public interface ForumForumMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(ForumForum record);

    int insertSelective(ForumForum record);

    ForumForum selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(ForumForum record);

    int updateByPrimaryKey(ForumForum record);
}