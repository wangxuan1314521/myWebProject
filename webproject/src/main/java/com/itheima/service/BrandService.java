package com.itheima.service;

import com.itheima.mapper.BrandMapper;
import com.itheima.pojo.Brand;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.text.Bidi;
import java.util.List;

/**
 * @author shkstart
 * @create 2023-02-18 15:14
 */
public class BrandService {
    //提到成员位置
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 查询所有
     */
    public List<Brand> selectAll() {


        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        List<Brand> brands = mapper.selectAll();

        sqlSession.close();

        return brands;

    }

    /**
     * 添加功能
     * @param brand
     */
    public void add(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //调用方法
        mapper.add(brand);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }



    /**
     * 根据id查询Brand品牌信息
     */
    public Brand selectById( int id) {


        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = mapper.selectById(id);
        sqlSession.close();

        return brand;

    }

    /**
     * 修改功能
     * @param brand
     */
    public void update(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //调用方法
        mapper.update(brand);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

}
