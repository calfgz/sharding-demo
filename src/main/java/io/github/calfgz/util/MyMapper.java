package io.github.calfgz.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;

/**
 * 继承通用mapper
 * @author calf
 * @create 2017-09-08 11:33
 */
public interface MyMapper<T> extends Mapper<T>, InsertSelectiveMapper<T>, MySqlMapper<T> {
}
