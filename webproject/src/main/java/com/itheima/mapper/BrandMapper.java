package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resources;
import java.util.List;

/**
 * @author shkstart
 * @create 2023-02-18 15:07
 */
public interface BrandMapper {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from  tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    /**
     * 添加
     * @param brand
     */
    @Insert("insert into tb_brand values (null,#{brandName},#{companyName}," +
            "#{ordered},#{description},#{status})")
    void add(Brand brand);


}
