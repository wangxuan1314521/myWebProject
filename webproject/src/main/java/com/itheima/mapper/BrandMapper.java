package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resources;
import java.util.List;

/**
 * @author shkstart
 * @create 2023-02-18 15:07
 */
public interface BrandMapper {
    /*
    * 查询所有
    * */
    @Select("select * from  tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();


}
