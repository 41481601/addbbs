package cn.miaogu.dao;

import cn.miaogu.domain.Bbspaqu;
import cn.miaogu.domain.ForumForum;
import cn.miaogu.domain.ForumThread;

import java.util.List;

/**
 * @Author 一直都是大番茄
 * @Time 2021-02-25 23:25
 * @Email 41481601@qq.com
 */
public interface MyMapper{
    List<Bbspaqu> selectAllBbs();

    //插入数据获取返回值
    int insertForum();
    int addForumThread(ForumThread forumThread);
    void updateCommonMemberCount(Integer uid);
    void updateForumForum(ForumForum forumForum);
}
