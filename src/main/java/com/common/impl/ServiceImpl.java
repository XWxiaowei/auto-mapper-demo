package com.common.impl;

import com.common.IService;
import com.common.util.SqlHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by xiang.wei on 2018/10/26
 *
 * @author xiang.wei
 */
public class ServiceImpl<M extends Mapper<T>,T> implements IService<T>{
    @Autowired
    protected M mapper;


    @Override
    public List<T> select(T record) {
        return this.mapper.select(record);
    }

    @Override
    public T selectByPrimaryKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public List<T> selectByIds(String ids) {
//        return mapper.sele;
        return null;
    }

    @Override
    public T selectOne(T record) {
        return mapper.selectOne(record);
    }

    @Override
    public int selectCount(T record) {
        return mapper.selectCount(record);
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean insert(T record) {
        return retBool(mapper.insert(record));
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean insertSelective(T record) {
        return retBool(mapper.insertSelective(record));
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateByPrimaryKey(T record) {
        return retBool(mapper.updateByPrimaryKey(record));
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateByPrimaryKeySelective(T record) {
        return retBool(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public int updateByExample(T record, Object condition) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(T record, Object example) {
        return 0;
    }

    @Override
    public boolean deleteByPrimaryKey(Object key) {
        return retBool(mapper.deleteByPrimaryKey(key));
    }

//    @Override
//    public boolean insertOrUpdate(T record) {
//        if (record == null) {
//            return false;
//        }
//
//        return false;
//    }

    private boolean retBool(Integer ret) {
        return SqlHelper.retBool(ret);
    }
}
