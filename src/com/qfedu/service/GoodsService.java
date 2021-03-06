package com.qfedu.service;

import com.qfedu.entity.Goods;
import com.qfedu.util.PageUtil;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public interface GoodsService {
    List<Goods> findGoodsByPage(PageUtil pageUtil,String condtion) throws SQLException, InvocationTargetException, IllegalAccessException;
    int findGoodsCount(String condition) throws SQLException;
    Goods findGoodsByGid(Integer gid) throws SQLException, InvocationTargetException, IllegalAccessException;
    void updateGoods(Goods goods) throws SQLException;
    void addGoods(Goods goods) throws SQLException;
    void deleteGoodsById(String[] ids) throws SQLException;
}
