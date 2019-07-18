package com.liyan.service.Impl;

import com.liyan.mapper.LogMapper;
import com.liyan.pojo.Log;
import com.liyan.service.LogService;
import com.liyan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class LogServiceImpl implements LogService {
    @Override
    public int insert(Log log) {
        SqlSession sqlSession = MybatisUtil.getSession();
        LogMapper logMapper = sqlSession.getMapper(LogMapper.class);
        int row = logMapper.insert(log);
        return row;
    }

    @Override
    public List<Log> findAll() {
        SqlSession sqlSession = MybatisUtil.getSession();
        LogMapper logs=sqlSession.getMapper(LogMapper.class);
        List<Log> list=logs.findAll();
        return list;
    }
}
