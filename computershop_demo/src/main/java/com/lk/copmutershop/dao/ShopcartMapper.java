package com.lk.copmutershop.dao;

import com.lk.copmutershop.bean.Shopcart;
import com.lk.copmutershop.bean.ShopcartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopcartMapper {
    long countByExample(ShopcartExample example);

    int deleteByExample(ShopcartExample example);

    int deleteByPrimaryKey(Integer cartId);

    int insert(Shopcart record);

    int insertSelective(Shopcart record);

    List<Shopcart> selectByExample(ShopcartExample example);

    Shopcart selectByPrimaryKey(Integer cartId);

    int updateByExampleSelective(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByExample(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByPrimaryKeySelective(Shopcart record);

    int updateByPrimaryKey(Shopcart record);
    //查询购物车信息
    List<Shopcart> selectcart(String accountId);
}