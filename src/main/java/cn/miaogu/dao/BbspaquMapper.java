package cn.miaogu.dao;

import cn.miaogu.domain.Bbspaqu;

public interface BbspaquMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bbspaqu record);

    int insertSelective(Bbspaqu record);

    Bbspaqu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bbspaqu record);

    int updateByPrimaryKey(Bbspaqu record);
}