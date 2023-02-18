package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

    /**
     * 根据id查询 回显数据
     * @param id
     * @return
     */
    @Select("select * from tb_brand where id=#{id}")
    @ResultMap("brandResultMap")

    Brand selectById(int id);

    /**
     * 修改操作
     * @param brand
     */
    @Update("update tb_brand set brand_name=#{brandName}," +
            "company_name=#{companyName}," +
            "ordered=#{ordered}," +
            "description=#{description}," +
            "status=#{status} where id=#{id}")
    @ResultMap("brandResultMap")

    void update(Brand brand);

}
