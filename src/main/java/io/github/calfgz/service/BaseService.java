package io.github.calfgz.service;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author calf
 * @create 2017-05-27 16:26
 */
public abstract class BaseService<T> {

    @Autowired
    protected Mapper<T> mapper;

    /**
     * 获取通用Mapper
     * @return
     */
    public Mapper<T> getMapper() {
        return mapper;
    }

    /**
     * 根据主键查询实体类
     * @param key
     * @return
     */
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    /**
     * 新增实体类，不采用数据库默认值，所有字段写入数据库,包括null字段
     * @param entity
     * @return
     */
    public int save(T entity) {
        return mapper.insert(entity);
    }

    /**
     * 新增实体类，空字段不写入数据库，采用数据库默认值
     * @param entity
     * @return
     */
    public int saveSelective(T entity) {
        return mapper.insertSelective(entity);
    }

    /**
     * 根据主键删除实体类
     * @param key
     * @return
     */
    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    /**
     * 根据主键更新实体类，所有字段写入数据库,包括null字段
     * @param entity
     * @return
     */
    public int update(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    /**
     * 根据主键更新实体类，只更新不为空的字段
     * @param entity
     * @return
     */
    public int updateSelective(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    /**
     * 根据examplt条件查找List
     * @param example
     * @return
     */
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    /**
     * 查询所有列表
     * @return
     */
    public List<T> selectAll() {
        return mapper.selectAll();
    }

}
